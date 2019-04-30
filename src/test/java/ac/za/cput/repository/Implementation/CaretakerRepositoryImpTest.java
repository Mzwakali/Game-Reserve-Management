package ac.za.cput.repository.Implementation;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.factory.CareTakerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ac.za.cput.repository.EmployeeRepository.Imp.CaretakerRepositoryImp;

public class CaretakerRepositoryImpTest {

    CaretakerRepositoryImp caretakerRepo;

    @Before
    public void setUp() throws Exception {
        caretakerRepo = (CaretakerRepositoryImp) CaretakerRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("William","Jones","Grounds Keeper", 38);
        caretakerRepo.create(caretaker);

        Assert.assertNotNull(caretakerRepo.getAll());
    }

    @Test
    public void read() {

        Caretaker caretaker = CareTakerFactory.getCareTaker("William", "Jones", "Ground Keeper", 38);
        caretakerRepo.create(caretaker);

        Assert.assertNotNull(caretakerRepo.getAll());
        Caretaker caretaker1 = caretakerRepo.read(caretaker.getEmpId());
        Assert.assertEquals(caretaker,caretaker1);
    }

    @Test
    public void update() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("William", "Jones", "Ground Keeper", 38);
        caretakerRepo.create(caretaker);
        Assert.assertNotNull(caretakerRepo.getAll());
        Caretaker caretaker1 =  CareTakerFactory.getCareTaker("William", "Jones", "Ground Keeper", 38);
        caretaker1.setEmpId(caretaker.getEmpId());
        caretakerRepo.update(caretaker1);
        Caretaker caretaker2 = caretakerRepo.read(caretaker1.getEmpId());
        Assert.assertEquals(caretaker1, caretaker2);
    }

    @Test
    public void delete() {
        Caretaker caretaker = CareTakerFactory.getCareTaker("William", "Jones", "Ground Keeper", 38);
        caretakerRepo.create(caretaker);
        Assert.assertNotNull(caretakerRepo.getAll());
        caretakerRepo.delete(caretaker.getEmpId());
        Caretaker notIncluded = caretakerRepo.read(caretaker.getEmpId());
        Assert.assertNull(notIncluded);
    }

}