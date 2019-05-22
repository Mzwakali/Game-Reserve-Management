package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.factory.gameReserve.EquipmentFactory;
import net.bytebuddy.asm.Advice;
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
public class EquipmentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/gameReserve/equipment";

    @Test
    public void create() {
        Equipment equipment = EquipmentFactory.getEquipment(2,"Mower" ,5,null);
        equipment.setEquipId(equipment.getEquipId());

        ResponseEntity<Equipment> responseEntity = restTemplate.postForEntity(originUrl +"/create", equipment, Equipment.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        Equipment equipment = restTemplate.getForObject(originUrl +"/find/2", Equipment.class);
        assertNotNull(equipment);
    }

    @Test
    public void update() {
        int id = 2;
        Equipment equipment = restTemplate.getForObject(originUrl + "/update/" +id, Equipment.class);
        equipment.setEquipId(1);

        restTemplate.put(originUrl +"/update/"+ id, equipment);
        Equipment equipmentUpdate = restTemplate.getForObject(originUrl +"/update/" +id, Equipment.class);
        assertNotNull(equipmentUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        Equipment equipment = restTemplate.getForObject(originUrl +"/find/" +id, Equipment.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            equipment = restTemplate.getForObject(originUrl +"/find/" +id, Equipment.class);
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