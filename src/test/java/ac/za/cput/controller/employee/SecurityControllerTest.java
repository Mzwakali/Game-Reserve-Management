package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.factory.employee.SecurityFactory;
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
public class SecurityControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/security";

    @Test
    public void create() {
        Security security = SecurityFactory.getSecurity(2);
        security.setSecurityId(security.getSecurityId());

        ResponseEntity<Security> responseEntity = restTemplate.postForEntity(originUrl +"/create", security, Security.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        Security security = restTemplate.getForObject(originUrl +"/find/2", Security.class);
        assertNotNull(security);
    }

    @Test
    public void update() {
        int id = 2;
        Security security = restTemplate.getForObject(originUrl + "/update/" +id, Security.class);
        security.setSecurityId(1);

        restTemplate.put(originUrl +"/update/"+ id, security);
        Security securityUpdate = restTemplate.getForObject(originUrl +"/update/" +id, Security.class);
        assertNotNull(securityUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        Security security = restTemplate.getForObject(originUrl +"/find/" +id, Security.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            security = restTemplate.getForObject(originUrl +"/find/" +id, Security.class);
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