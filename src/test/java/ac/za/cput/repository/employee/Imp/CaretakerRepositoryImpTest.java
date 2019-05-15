package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.factory.employee.CareTakerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaretakerRepositoryImpTest {

    CaretakerRepositoryImp caretakerRepository;

    @Before
    public void setUp() throws Exception {
        caretakerRepository = (CaretakerRepositoryImp) CaretakerRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Borne","Groundsman", 27);
        caretakerRepository.create(caretaker);

        Assert.assertNotNull(caretakerRepository.getAll());
    }

    @Test
    public void read() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason", "Borne", "Groundsman", 27);
        caretakerRepository.create(caretaker);

        Assert.assertNotNull(caretakerRepository.getAll());

        Caretaker caretaker1 = caretakerRepository.read(caretaker.getEmpId());
        Assert.assertEquals(caretaker, caretaker1);

    }

    @Test
    public void update() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason", "Borne", "Groundsman", 27);
        caretakerRepository.create(caretaker);
        Assert.assertNotNull(caretakerRepository.getAll());

        Caretaker caretaker1 = CareTakerFactory.getCareTaker("Jason", "Statham", "Groundsman", 27);
        caretaker1.setEmpId(caretaker.getEmpId());
        caretakerRepository.update(caretaker1);

        Caretaker caretaker2 = caretakerRepository.read(caretaker1.getEmpId());
        Assert.assertEquals(caretaker1, caretaker2);
    }

    @Test
    public void delete() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason", "Borne", "Groundsman", 27);
        caretakerRepository.create(caretaker);
        Assert.assertNotNull(caretakerRepository.getAll());

        caretakerRepository.delete(caretaker.getEmpId());

        Caretaker excluded = caretakerRepository.read(caretaker.getEmpId());
        Assert.assertNull(excluded);
    }
}