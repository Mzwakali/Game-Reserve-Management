package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.domain.employee.Qualification;
import ac.za.cput.factory.employee.ClinicNurseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClinicNurseRepositoryImpTest {

    ClinicNurseRepositoryImp clinicNurseRepository;

    @Before
    public void setUp() throws Exception {
        clinicNurseRepository = ClinicNurseRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jackie","Marry", "PA Assistant");
        clinicNurseRepository.create(nurse);

        Assert.assertNotNull(clinicNurseRepository.getAll());
    }

    @Test
    public void update() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jackie","Marry", "PA Assistant");
        clinicNurseRepository.create(nurse);

        Assert.assertNotNull(clinicNurseRepository.getAll());
        ClinicNurse nurse1 = ClinicNurseFactory.getClinicNurse("Jane","Marry", "PA Assistant");
        nurse1.setEmpId(nurse.getEmpId());
        clinicNurseRepository.update(nurse1);

        ClinicNurse nurse2 = clinicNurseRepository.read(nurse1.getEmpId());
        Assert.assertEquals(nurse1, nurse2);
    }

    @Test
    public void delete() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jackie","Marry", "PA Assistant");
        clinicNurseRepository.create(nurse);

        Assert.assertNotNull(clinicNurseRepository.getAll());
        clinicNurseRepository.delete(nurse.getEmpId());

        ClinicNurse nurse1 = clinicNurseRepository.read(nurse.getEmpId());
        Assert.assertNull(nurse1);
    }

    @Test
    public void read() {
        ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jackie","Marry", "PA Assistant");
        clinicNurseRepository.create(nurse);
        Assert.assertNotNull(clinicNurseRepository.getAll());

        ClinicNurse onSet = clinicNurseRepository.read(nurse.getEmpId());
        Assert.assertEquals(nurse, onSet);
    }
}*/