package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.factory.employee.CareTakerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaretakerServiceImpTest {
    private CaretakerServiceImp caretakerService;

    @Before
    public void setUp() throws Exception {
        caretakerService = new CaretakerServiceImp();
    }

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Brown", "Grounds Man", 24);
        caretakerService.create(caretaker);

        Assert.assertNotNull(caretakerService.getAll());
    }

    @Test
    public void update() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Brown", "Grounds Man", 24);
        caretakerService.create(caretaker);

        Assert.assertNotNull(caretakerService.getAll());

        Caretaker caretakerUpdate = CareTakerFactory.getCareTaker("Jessi", "Brown", "Grounds Man", 24);
        caretakerUpdate.setEmpId(caretaker.getEmpId());
        caretakerService.update(caretakerUpdate);

        Caretaker caretaker1 = caretakerService.read(caretakerUpdate.getEmpId());
        Assert.assertEquals(caretakerUpdate, caretaker1);
    }

    @Test
    public void delete() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Brown", "Grounds Man", 24);
        caretakerService.create(caretaker);
        Assert.assertNotNull(caretakerService.getAll());

        caretakerService.delete(caretaker.getEmpId());

        Caretaker excluded = caretakerService.read(caretaker.getEmpId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Brown", "Grounds Man", 24);
        caretakerService.create(caretaker);
        Assert.assertNotNull(caretakerService.getAll());

        Caretaker caretaker1 = caretakerService.read(caretaker.getEmpId());
        Assert.assertEquals(caretaker,caretaker1);
    }
}