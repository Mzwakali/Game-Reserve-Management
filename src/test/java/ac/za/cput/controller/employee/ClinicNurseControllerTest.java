package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.factory.employee.ClinicNurseFactory;
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
public class ClinicNurseControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/nurse";

    @Test
    public void create() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Hanna","Montana","Assistant");
        nurse.setEmpId(nurse.getEmpId());

        ResponseEntity<ClinicNurse> responseEntity = restTemplate.postForEntity(originUrl +"/create", nurse, ClinicNurse.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        ClinicNurse nurse = restTemplate.getForObject(originUrl +"/find/2", ClinicNurse.class);
        assertNotNull(nurse);
    }

    @Test
    public void update() {
        int id = 2;
        ClinicNurse nurse = restTemplate.getForObject(originUrl + "/update/" +id, ClinicNurse.class);
        nurse.setFirstName("Harly");

        restTemplate.put(originUrl +"/update/"+ id, nurse);
        ClinicNurse nurseUpdate = restTemplate.getForObject(originUrl +"/update/" +id, ClinicNurse.class);
        assertNotNull(nurseUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        ClinicNurse nurse = restTemplate.getForObject(originUrl +"/find/" +id, ClinicNurse.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            nurse = restTemplate.getForObject(originUrl +"/find/" +id, ClinicNurse.class);
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