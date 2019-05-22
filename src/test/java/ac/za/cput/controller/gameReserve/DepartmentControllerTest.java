package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.factory.gameReserve.DepartmentFactory;
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
public class DepartmentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/gameReserve/department";

    @Test
    public void create() {
        Department department = DepartmentFactory.getDepartment(2,2 ,null);
        department.setDeptId(department.getDeptId());

        ResponseEntity<Department> responseEntity = restTemplate.postForEntity(originUrl +"/create", department, Department.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        Department department = restTemplate.getForObject(originUrl +"/find/2", Department.class);
        assertNotNull(department);
    }

    @Test
    public void update() {
        int id = 2;
        Department department = restTemplate.getForObject(originUrl + "/update/" +id, Department.class);
        department.setDeptId(1);

        restTemplate.put(originUrl +"/update/"+ id, department);
        Department departmentUpdate = restTemplate.getForObject(originUrl +"/update/" +id, Department.class);
        assertNotNull(departmentUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        Department department = restTemplate.getForObject(originUrl +"/find/" +id, Department.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            department = restTemplate.getForObject(originUrl +"/find/" +id, Department.class);
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