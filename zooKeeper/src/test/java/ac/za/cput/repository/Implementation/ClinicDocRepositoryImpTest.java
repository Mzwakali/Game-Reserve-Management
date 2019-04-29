package ac.za.cput.repository.Implementation;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.factory.ClinicDocFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicDocRepositoryImpTest {

    private ClinicDocRepositoryImp clinicDocRepo;

    @Before
    public void setUp() throws Exception {
        clinicDocRepo = ClinicDocRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        ClinicDoc clinicDoc = ClinicDocFactory.getClinicDoc("John", "Doris", "Vet");
        clinicDocRepo.create(clinicDoc);
        Assert.assertNotNull(clinicDocRepo.getAll());
    }

    @Test
    public void update() {
        ClinicDoc clinicDoc = ClinicDocFactory.getClinicDoc("John", "Doris", "Vet");
        clinicDocRepo.create(clinicDoc);
        Assert.assertNotNull(clinicDocRepo.getAll());
        ClinicDoc clinicDoc1 = ClinicDocFactory.getClinicDoc("John", "Doris", "Vetenarian");
        clinicDoc1.setEmpId(clinicDoc.getEmpId());
        clinicDocRepo.update(clinicDoc1);

        ClinicDoc included = clinicDocRepo.read(clinicDoc1.getEmpId());
        Assert.assertEquals(clinicDoc1, included);
    }

    @Test
    public void delete() {
        ClinicDoc clinicDoc = ClinicDocFactory.getClinicDoc("John", "Doris", "Vet");
        clinicDocRepo.create(clinicDoc);
        Assert.assertNotNull(clinicDocRepo.getAll());
        clinicDocRepo.delete(clinicDoc.getEmpId());
        ClinicDoc clinicDoc1= clinicDocRepo.read(clinicDoc.getEmpId());
        Assert.assertNull(clinicDoc1);
    }

    @Test
    public void read() {
        ClinicDoc clinicDoc = ClinicDocFactory.getClinicDoc("John", "Doris", "Vet");
        clinicDocRepo.create(clinicDoc);
        ClinicDoc included = clinicDocRepo.read(clinicDoc.getEmpId());
        Assert.assertEquals(clinicDoc, included);
    }
}