package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.factory.employee.CareTakerFactory;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CaretakerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/employee/caretaker";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("John","Snow","Maintenance", 25);
        caretaker.setEmpId(2);
        ResponseEntity<Caretaker> postResponse = restTemplate.postForEntity(originUrl + "/new",caretaker, Caretaker.class);

        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}