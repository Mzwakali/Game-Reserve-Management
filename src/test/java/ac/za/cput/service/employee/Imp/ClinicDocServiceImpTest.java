package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.factory.employee.ClinicDocFactory;
import ac.za.cput.factory.employee.ClinicNurseFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicDocServiceImpTest {

    ClinicDocServiceImp docService;



    @Before
    public void setUp() throws Exception {
        docService = new ClinicDocServiceImp();
    }

    @Test
    public void create() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jack", "Holmes", "Vet");
        docService.create(doc);
        Assert.assertNotNull(docService.getAll());
    }

    @Test
    public void update() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jack", "Holmes", "Vet");
        docService.create(doc);
        Assert.assertNotNull(docService.getAll());

        ClinicDoc docUpdate = ClinicDocFactory.getClinicDoc("Jack", "Hamilton", "Stand by Dr.");
        docUpdate.setEmpId(doc.getEmpId());
        docService.update(docUpdate);

        ClinicDoc doc1 = docService.read(docUpdate.getEmpId());
        Assert.assertEquals(docUpdate, doc1);
    }

    @Test
    public void delete() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jack", "Holmes", "Vet");
        docService.create(doc);
        Assert.assertNotNull(docService.getAll());

        docService.delete(doc.getEmpId());
        ClinicDoc doc1 = docService.read(doc.getEmpId());
        Assert.assertNull(doc1);
    }

    @Test
    public void read() {
        ClinicDoc doc = ClinicDocFactory.getClinicDoc("Jack", "Holmes", "Vet");
        docService.create(doc);
        Assert.assertNotNull(docService.getAll());

        ClinicDoc onSet = docService.read(doc.getEmpId());
        Assert.assertEquals(doc, onSet);
    }
}