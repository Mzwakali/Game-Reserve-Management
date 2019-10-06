package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.factory.employee.ClinicDocFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class ClinicDocRepositoryImpTest {

    ClinicDocRepositoryImp clinicDocRepository;

    @Before
    public void setUp() throws Exception {
        clinicDocRepository = ClinicDocRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jake","Black", "Vet");
        clinicDocRepository.create(doc);

        Assert.assertNotNull(clinicDocRepository.getAll());
    }

    @Test
    public void read() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jake","Black", "Vet");
        clinicDocRepository.create(doc);
        ClinicDoc onSet = clinicDocRepository.read(doc.getEmpId());

        Assert.assertEquals(doc, onSet);
    }

    @Test
    public void update() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jake","Black", "Vet");
        clinicDocRepository.create(doc);

        Assert.assertNotNull(clinicDocRepository.getAll());

        ClinicDoc doc1 = ClinicDocFactory.getClinicDoc("Jake","Henny", "Vet");
        doc1.setEmpId(doc.getEmpId());
        clinicDocRepository.update(doc1);

        ClinicDoc onSet = clinicDocRepository.read(doc1.getEmpId());
        Assert.assertEquals(doc1, onSet);
    }

    @Test
    public void delete() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jake","Black", "Vet");
        clinicDocRepository.create(doc);

        Assert.assertNotNull(clinicDocRepository.getAll());

        clinicDocRepository.delete(doc.getEmpId());

        ClinicDoc doc1 = clinicDocRepository.read(doc.getEmpId());
        Assert.assertNull(doc1);
    }

}*/