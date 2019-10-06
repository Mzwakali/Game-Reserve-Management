package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.factory.employee.MarineRangerFactory;
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
public class MarineRangerRepositoryImpTest {

    @Autowired
    MarineRangerRepositoryImp marineRangerRepository;

    @Before
    public void setUp() throws Exception {
        marineRangerRepository = MarineRangerRepositoryImp.getMarineRangerRepository();
    }

    @Test
    public void create() {
        MarineRanger marineRanger = MarineRangerFactory.getMarineRanger(14/*,"Aqua");
        marineRangerRepository.create(marineRanger);
        Assert.assertNotNull(marineRangerRepository.getAll());
    }

    @Test
    public void update() {
        MarineRanger marineRanger = MarineRangerFactory.getMarineRanger(14/*,"Aqua");
        marineRangerRepository.create(marineRanger);

        MarineRanger marineRanger1 = MarineRangerFactory.getMarineRanger(14/*,"Marine World");
        marineRanger1.setEmpId(marineRanger.getEmpId());
        marineRangerRepository.update(marineRanger1);

        MarineRanger marineRanger2 = marineRangerRepository.read(marineRanger1.getEmpId());
        Assert.assertEquals(marineRanger1, marineRanger2);
    }

    @Test
    public void delete() {
        MarineRanger marineRanger = MarineRangerFactory.getMarineRanger(14/*,"Aqua");
        marineRangerRepository.create(marineRanger);

        Assert.assertNotNull(marineRangerRepository.getAll());
        marineRangerRepository.delete(marineRanger.getEmpId());

        MarineRanger marineRanger1 = marineRangerRepository.read(marineRanger.getEmpId());
        Assert.assertNull(marineRanger1);
    }

    @Test
    public void read() {
        MarineRanger marineRanger = MarineRangerFactory.getMarineRanger(14/*,"Aqua");
        marineRangerRepository.create(marineRanger);

        MarineRanger onSet = marineRangerRepository.read(marineRanger.getEmpId());
        Assert.assertEquals(marineRanger, onSet);
    }
}*/