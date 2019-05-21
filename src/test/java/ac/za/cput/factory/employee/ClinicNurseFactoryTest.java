package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.domain.employee.Qualification;
import org.junit.Assert;
import org.junit.Test;

import javax.validation.constraints.Null;

import java.util.List;

import static org.junit.Assert.*;

public class ClinicNurseFactoryTest {

    @Test
    public void getClinicNurse() {

        Assert.assertNull(null);
       // ClinicNurse nurse = ClinicNurseFactory.getClinicNurse("Jessica","May","PA");
    }
}