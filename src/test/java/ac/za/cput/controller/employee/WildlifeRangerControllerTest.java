package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.factory.employee.WildlifeRangerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class WildlifeRangerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/wildlife";

    @Test
    public void create() {
        WildlifeRanger ranger = WildlifeRangerFactory.getWildlifeRanger(2/*,"Jurassic Park","Zoologist"*/);
        ranger.setEmpId(ranger.getEmpId());

        ResponseEntity<WildlifeRanger> responseEntity = restTemplate.postForEntity(originUrl +"/create", ranger, WildlifeRanger.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        WildlifeRanger ranger = restTemplate.getForObject(originUrl +"/find/2", WildlifeRanger.class);
        assertNotNull(ranger);
    }

    @Test
    public void update() {
        int id = 2;
        WildlifeRanger ranger = restTemplate.getForObject(originUrl + "/update/" +id, WildlifeRanger.class);
        ranger.setEmpId(1);

        restTemplate.put(originUrl +"/update/"+ id, ranger);
        WildlifeRanger rangerUpdate = restTemplate.getForObject(originUrl +"/update/" +id, WildlifeRanger.class);
        assertNotNull(rangerUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        WildlifeRanger ranger = restTemplate.getForObject(originUrl +"/find/" +id, WildlifeRanger.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            ranger = restTemplate.getForObject(originUrl +"/find/" +id, WildlifeRanger.class);
        }catch(final HttpClientErrorException x){
            assertEquals(x.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(originUrl +"/getAll", HttpMethod.GET, entity, String.class);
        assertNotNull(responseEntity.getBody());
    }
}