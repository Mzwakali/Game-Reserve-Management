package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.Caretaker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CareTakerFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getCareTaker() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Borne","Grounds man", 27);

        Assert.assertNotNull(caretaker.getEmpId());
    }
}