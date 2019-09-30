package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.factory.employee.FieldGuideFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class FieldGuideControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/guide";

    @Test
    public void create() {
        FieldGuide guide = FieldGuideFactory.getGuide(2/*,"16/06/19","Jacksons"*/);
        guide.setGuideId(guide.getGuideId());

        ResponseEntity<FieldGuide> responseEntity = restTemplate.postForEntity(originUrl +"/create", guide, FieldGuide.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        FieldGuide guide = restTemplate.getForObject(originUrl +"/find/2", FieldGuide.class);
        assertNotNull(guide);
    }

    @Test
    public void update() {
        int id = 2;
        FieldGuide guide = restTemplate.getForObject(originUrl + "/update/" +id, FieldGuide.class);
        guide.setGuideId(1);

        restTemplate.put(originUrl +"/update/"+ id, guide);
        FieldGuide guideUpdate = restTemplate.getForObject(originUrl +"/update/" +id, FieldGuide.class);
        assertNotNull(guideUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        FieldGuide guide = restTemplate.getForObject(originUrl +"/find/" +id, FieldGuide.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            guide = restTemplate.getForObject(originUrl +"/find/" +id, FieldGuide.class);
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