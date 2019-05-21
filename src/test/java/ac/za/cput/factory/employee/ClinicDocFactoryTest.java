package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicDocFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getClinicDoc() {
        ClinicDoc clinicDoc = ClinicDocFactory.getClinicDoc("Jack","Black","Vet");
        Assert.assertNotNull(clinicDoc.getEmpId());
    }
}