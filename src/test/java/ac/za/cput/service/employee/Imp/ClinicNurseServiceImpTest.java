package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.factory.employee.ClinicNurseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicNurseServiceImpTest {

    ClinicNurseServiceImp nurseService;

    @Before
    public void setUp() throws Exception {
        nurseService = new ClinicNurseServiceImp();
    }

    @Test
    public void create() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jones", "Hamilton", "Standy-By Assistance");
        nurseService.create(nurse);
        Assert.assertNotNull(nurseService.getAll());
    }

    @Test
    public void update() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jones", "Hamilton", "Standy-By Assistance");
        nurseService.create(nurse);
        Assert.assertNotNull(nurseService.getAll());

        ClinicNurse nurseUpdate = ClinicNurseFactory.getClinicNurse("Jones", "Hamilton", "Assistant Nurse");
        nurseUpdate.setEmpId(nurse.getEmpId());
        nurseService.update(nurseUpdate);

        ClinicNurse nurse1 = nurseService.read(nurseUpdate.getEmpId());
        Assert.assertEquals(nurseUpdate, nurse1);
    }

    @Test
    public void delete() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jones", "Hamilton", "Standy-By Assistance");
        nurseService.create(nurse);
        Assert.assertNotNull(nurseService.getAll());

        nurseService.delete(nurse.getEmpId());
        ClinicNurse nurse1 = nurseService.read(nurse.getEmpId());
        Assert.assertNull(nurse1);
    }

    @Test
    public void read() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jones", "Hamilton", "Standy-By Assistance");
        nurseService.create(nurse);
        Assert.assertNotNull(nurseService.getAll());

        ClinicNurse onSet = nurseService.read(nurse.getEmpId());
        Assert.assertEquals(nurse, onSet);
    }
}