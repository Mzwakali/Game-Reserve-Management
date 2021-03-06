package ac.za.cput.controller.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.factory.visitor.LocalVisitorFactory;
import org.junit.Before;
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
public class LocalVisitorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/visitor/localVisitor";

    @Test
    public void create() {
        LocalVisitor visitor = LocalVisitorFactory.getLocalVisitor("Joseph","Mosenga","0842497845");
        visitor.setVisitorId(visitor.getVisitorId());

        ResponseEntity<LocalVisitor> responseEntity = restTemplate.postForEntity(originUrl +"/create", visitor, LocalVisitor.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        LocalVisitor visitor = restTemplate.getForObject(originUrl +"/find/2", LocalVisitor.class);
        assertNotNull(visitor);
    }

    @Test
    public void update() {
        int id = 2;
        LocalVisitor visitor = restTemplate.getForObject(originUrl + "/update/" +id, LocalVisitor.class);
        visitor.setVisitorId(1);

        restTemplate.put(originUrl +"/update/"+ id, visitor);
        LocalVisitor visitorUpdate = restTemplate.getForObject(originUrl +"/update/" +id, LocalVisitor.class);
        assertNotNull(visitorUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        LocalVisitor visitor = restTemplate.getForObject(originUrl +"/find/" +id, LocalVisitor.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            visitor = restTemplate.getForObject(originUrl +"/find/" +id, LocalVisitor.class);
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