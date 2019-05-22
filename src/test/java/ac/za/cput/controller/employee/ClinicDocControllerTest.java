package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.factory.employee.ClinicDocFactory;
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
public class ClinicDocControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/doc";

    @Test
    public void create() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jack","Black","Vet");
        doc.setEmpId(doc.getEmpId());

        ResponseEntity<ClinicDoc> responseEntity = restTemplate.postForEntity(originUrl +"/create", doc, ClinicDoc.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        ClinicDoc doc = restTemplate.getForObject(originUrl +"/find/2", ClinicDoc.class);
        assertNotNull(doc);
    }

    @Test
    public void update() {
        int id = 2;
        ClinicDoc doc = restTemplate.getForObject(originUrl + "/update/" +id, ClinicDoc.class);
        doc.setFirstName("Jassie");

        restTemplate.put(originUrl +"/update/"+ id, doc);
        ClinicDoc docUpdate = restTemplate.getForObject(originUrl +"/update/" +id, ClinicDoc.class);
        assertNotNull(docUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        ClinicDoc doc = restTemplate.getForObject(originUrl +"/find/" +id, ClinicDoc.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            doc = restTemplate.getForObject(originUrl +"/find/" +id, ClinicDoc.class);
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