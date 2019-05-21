package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.factory.gameReserve.EquipmentFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipmentRepositoryImpTest {

    EquipmentRepositoryImp equipmentRepository;

    @Before
    public void setUp() throws Exception {
        equipmentRepository = EquipmentRepositoryImp.getEquipmentRepository();
    }

    @Test
    public void create() {
        Equipment equipment = EquipmentFactory.getEquipment(1, "Mower", 4, null);
        equipmentRepository.create(equipment);

        Assert.assertNotNull(equipmentRepository.getAll());
    }

    @Test
    public void update() {
        Equipment equipment = EquipmentFactory.getEquipment(1, "Mower", 4, null);
        equipmentRepository.create(equipment);

        Assert.assertNotNull(equipmentRepository.getAll());

        Equipment equipmentUpdate = EquipmentFactory.getEquipment(1,"Water pipe",7,null);
        equipmentUpdate.setEquipId(equipment.getEquipId());
        equipmentRepository.update(equipmentUpdate);

        Equipment equipment1 = equipmentRepository.read(equipmentUpdate.getEquipId());
        Assert.assertEquals(equipmentUpdate, equipment1);
    }

    @Test
    public void delete() {
        Equipment equipment = EquipmentFactory.getEquipment(1, "Mower", 4, null);
        equipmentRepository.create(equipment);

        Assert.assertNotNull(equipmentRepository.getAll());

        equipmentRepository.delete(equipment.getEquipId());
        Equipment equipment1 = equipmentRepository.read(equipment.getEquipId());
        Assert.assertNull(equipment1);
    }

    @Test
    public void read() {
        Equipment equipment = EquipmentFactory.getEquipment(1, "Mower", 4, null);
        equipmentRepository.create(equipment);

        Assert.assertNotNull(equipmentRepository.getAll());

        Equipment onSet = equipmentRepository.read(equipment.getEquipId());
        Assert.assertEquals(equipment, onSet);
    }
}