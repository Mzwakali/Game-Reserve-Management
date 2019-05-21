package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.factory.gameReserve.ClinicFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicRepositoryImpTest {

    ClinicRepositoryImp clinicRepository;

    @Before
    public void setUp() throws Exception {
        clinicRepository = ClinicRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        Clinic clinic = ClinicFactory.getClinic(1, "Domestic Clinc", null);
        clinicRepository.create(clinic);

        Assert.assertNotNull(clinicRepository.getAll());
    }

    @Test
    public void update() {
        Clinic clinic = ClinicFactory.getClinic(1, "Domestic Clinc", null);
        clinicRepository.create(clinic);

        Assert.assertNotNull(clinicRepository.getAll());

        Clinic clinicUpdate = ClinicFactory.getClinic(1,"Wild Animal Vet",null);
        clinicUpdate.setClinicId(clinic.getClinicId());
        clinicRepository.update(clinicUpdate);

        Clinic clinic1 = clinicRepository.read(clinicUpdate.getClinicId());
        Assert.assertEquals(clinicUpdate, clinic1);
    }

    @Test
    public void delete() {
        Clinic clinic = ClinicFactory.getClinic(1, "Domestic Clinc", null);
        clinicRepository.create(clinic);

        Assert.assertNotNull(clinicRepository.getAll());

        clinicRepository.delete(clinic.getClinicId());
        Clinic department1 = clinicRepository.read(clinic.getClinicId());
        Assert.assertNull(department1);
    }

    @Test
    public void read() {
        Clinic clinic = ClinicFactory.getClinic(1, "Domestic Clinc", null);
        clinicRepository.create(clinic);

        Assert.assertNotNull(clinicRepository.getAll());

        Clinic onSet = clinicRepository.read(clinic.getClinicId());
        Assert.assertEquals(clinic, onSet);
    }
}