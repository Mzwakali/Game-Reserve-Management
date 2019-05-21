package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.factory.employee.CareTakerFactory;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CaretakerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/caretaker";

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("John","Snow","Maintenance", 25);
        caretaker.setEmpId(caretaker.getEmpId());
        ResponseEntity<Caretaker> postResponse = restTemplate.postForEntity(originUrl + "/create",caretaker, Caretaker.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void find(){
        Caretaker caretaker = restTemplate.getForObject(originUrl +"/find/2", Caretaker.class);
        assertNotNull(caretaker);
    }

    @Test
    public void update() {
        int id = 2;
        Caretaker caretaker = restTemplate.getForObject(originUrl + "/update/" +id, Caretaker.class);
        caretaker.setFirstName("Jason");

        restTemplate.put(originUrl +"/update/"+ id, caretaker);
        Caretaker caretakerUpdate = restTemplate.getForObject(originUrl +"/update/" +id, Caretaker.class);
        assertNotNull(caretakerUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        Caretaker caretaker = restTemplate.getForObject(originUrl +"/find/" +id, Caretaker.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            caretaker = restTemplate.getForObject(originUrl +"/find/" +id, Caretaker.class);
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
        System.out.println(responseEntity.getBody());
    }
}