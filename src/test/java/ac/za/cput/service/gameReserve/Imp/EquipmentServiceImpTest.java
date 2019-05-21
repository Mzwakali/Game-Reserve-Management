package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.factory.gameReserve.EquipmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EquipmentServiceImpTest {

    private EquipmentServiceImp equipmentService;

    @Before
    public void setUp() throws Exception {
        equipmentService = new EquipmentServiceImp();
    }

    @Test
    public void create() {
        Equipment equipment = EquipmentFactory.getEquipment(2,"Mower",5,null);
        equipmentService.create(equipment);
        Assert.assertNotNull(equipmentService.getAll());

    }

    @Test
    public void update() {
        Equipment equipment = EquipmentFactory.getEquipment(2,"Mower",5,null);
        equipmentService.create(equipment);
        Assert.assertNotNull(equipmentService.getAll());

        Equipment equipmentUpdate = EquipmentFactory.getEquipment(4,"Caddy", 5,null);
        equipmentUpdate.setEquipId(equipment.getEquipId());
        equipmentService.update(equipmentUpdate);

        Equipment equipmentNew = equipmentService.read(equipmentUpdate.getEquipId());
        Assert.assertEquals(equipmentUpdate, equipmentNew);
    }

    @Test
    public void delete() {
        Equipment equipment = EquipmentFactory.getEquipment(2,"Mower",5,null);
        equipmentService.create(equipment);
        Assert.assertNotNull(equipmentService.getAll());

        equipmentService.delete(equipment.getEquipId());

        Equipment excluded = equipmentService.read(equipment.getEquipId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Equipment equipment = EquipmentFactory.getEquipment(2,"Mower",5,null);
        equipmentService.create(equipment);
        Assert.assertNotNull(equipmentService.getAll());

        Equipment equipmentRead = equipmentService.read(equipment.getEquipId());
        Assert.assertEquals(equipment,equipmentRead);
    }
}