package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.factory.gameReserve.ClinicFactory;
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
public class ClinicControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/gameReserve/clinic";

    @Test
    public void create() {
        Clinic clinic = ClinicFactory.getClinic(2,"Domestic Pet Pat",null);
        clinic.setClinicId(clinic.getClinicId());

        ResponseEntity<Clinic> responseEntity = restTemplate.postForEntity(originUrl +"/create", clinic, Clinic.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        Clinic clinic = restTemplate.getForObject(originUrl +"/find/2", Clinic.class);
        assertNotNull(clinic);
    }

    @Test
    public void update() {
        int id = 2;
        Clinic clinic = restTemplate.getForObject(originUrl + "/update/" +id, Clinic.class);
        clinic.setClinicId(1);

        restTemplate.put(originUrl +"/update/"+ id, clinic);
        Clinic clinicUpdate = restTemplate.getForObject(originUrl +"/update/" +id, Clinic.class);
        assertNotNull(clinicUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        Clinic clinic = restTemplate.getForObject(originUrl +"/find/" +id, Clinic.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            clinic = restTemplate.getForObject(originUrl +"/find/" +id, Clinic.class);
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