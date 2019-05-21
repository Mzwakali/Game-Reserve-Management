package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.factory.gameReserve.ClinicFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicServiceImpTest {

    private ClinicServiceImp clinicService;


    @Before
    public void setUp() throws Exception {
        clinicService = new ClinicServiceImp();
    }

    @Test
    public void create() {
        Clinic clinic = ClinicFactory.getClinic(2,"Domestic Pet Pat",null);
        clinicService.create(clinic);
        Assert.assertNotNull(clinicService.getAll());

    }

    @Test
    public void update() {
        Clinic clinic = ClinicFactory.getClinic(2,"Domestic Pet Pat",null);
        clinicService.create(clinic);
        Assert.assertNotNull(clinicService.getAll());

        Clinic clinicUpdate = ClinicFactory.getClinic(4,"Off the Leash Care", null);
        clinicUpdate.setClinicId(clinic.getClinicId());
        clinicService.update(clinicUpdate);

        Clinic clinicNew = clinicService.read(clinicUpdate.getClinicId());
        Assert.assertEquals(clinicUpdate, clinicNew);
    }

    @Test
    public void delete() {
        Clinic clinic = ClinicFactory.getClinic(2,"Domestic Pet Pat",null);
        clinicService.create(clinic);
        Assert.assertNotNull(clinicService.getAll());

        clinicService.delete(clinic.getClinicId());

        Clinic excluded = clinicService.read(clinic.getClinicId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Clinic clinic = ClinicFactory.getClinic(2,"Domestic Pet Pat",null);
        clinicService.create(clinic);
        Assert.assertNotNull(clinicService.getAll());

        Clinic clinicRead = clinicService.read(clinic.getClinicId());
        Assert.assertEquals(clinic,clinicRead);
    }
}