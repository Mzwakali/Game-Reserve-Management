package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.factory.gameReserve.ProtectedAreaFactory;
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
public class ProtectedAreaControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/gameReserve/protectedArea";

    @Test
    public void create() {
        ProtectedArea protectedArea = ProtectedAreaFactory.getProtectedArea(2,null);
        protectedArea.setAreaId(protectedArea.getAreaId());

        ResponseEntity<ProtectedArea> responseEntity = restTemplate.postForEntity(originUrl +"/create", protectedArea, ProtectedArea.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        ProtectedArea protectedArea = restTemplate.getForObject(originUrl +"/find/2", ProtectedArea.class);
        assertNotNull(protectedArea);
    }

    @Test
    public void update() {
        int id = 2;
        ProtectedArea protectedArea = restTemplate.getForObject(originUrl + "/update/" +id, ProtectedArea.class);
        protectedArea.setAreaId(1);

        restTemplate.put(originUrl +"/update/"+ id, protectedArea);
        ProtectedArea areaUpdate = restTemplate.getForObject(originUrl +"/update/" +id, ProtectedArea.class);
        assertNotNull(areaUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        ProtectedArea protectedArea = restTemplate.getForObject(originUrl +"/find/" +id, ProtectedArea.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            protectedArea = restTemplate.getForObject(originUrl +"/find/" +id, ProtectedArea.class);
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