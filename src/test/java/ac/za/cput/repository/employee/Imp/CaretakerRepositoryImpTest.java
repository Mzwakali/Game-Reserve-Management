package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.factory.employee.CareTakerFactory;
import ac.za.cput.repository.employee.CaretakerRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class CaretakerRepositoryImpTest {

    @Autowired
    CaretakerRepository caretakerRepository;

    /*@Before
    public void setUp() throws Exception {
        caretakerRepository = (CaretakerRepositoryImp) CaretakerRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason","Borne","Groundsman", 27);
        caretakerRepository.save(caretaker);

        Assert.assertNotNull(caretakerRepository.findAll());
    }

    @Test
    public void read() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("Jason", "Borne", "Groundsman", 27);
        caretakerRepository.save(caretaker);

        Assert.assertNotNull(caretakerRepository.findAll());

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
}*/