package ac.za.cput.controller.visitor;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.factory.visitor.InternationalVisitorFactory;
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
public class InternationalVisitorControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/visitor/internationalVisitor";

    @Test
    public void create() {
        InternationalVisitor visitor = InternationalVisitorFactory.getInternationalVisitor(null);
        visitor.setVisitorId(visitor.getVisitorId());

        ResponseEntity<InternationalVisitor> responseEntity = restTemplate.postForEntity(originUrl +"/create", visitor, InternationalVisitor.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        InternationalVisitor visitor = restTemplate.getForObject(originUrl +"/find/2", InternationalVisitor.class);
        assertNotNull(visitor);
    }

    @Test
    public void update() {
        int id = 2;
        InternationalVisitor visitor = restTemplate.getForObject(originUrl + "/update/" +id, InternationalVisitor.class);
        visitor.setVisitorId(1);

        restTemplate.put(originUrl +"/update/"+ id, visitor);
        InternationalVisitor visitorUpdate = restTemplate.getForObject(originUrl +"/update/" +id, InternationalVisitor.class);
        assertNotNull(visitorUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        InternationalVisitor visitor = restTemplate.getForObject(originUrl +"/find/" +id, InternationalVisitor.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            visitor = restTemplate.getForObject(originUrl +"/find/" +id, InternationalVisitor.class);
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