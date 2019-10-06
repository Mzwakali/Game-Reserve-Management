package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.factory.employee.WildlifeRangerFactory;
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
public class WildlifeRangerRepositoryImpTest {

    WildlifeRangerRepositoryImp wildlifeRangerRepository;

    @Before
    public void setUp() throws Exception {
        wildlifeRangerRepository = WildlifeRangerRepositoryImp.getRepository();
    }

    @Test
    public void create() {
        WildlifeRanger wildlifeRanger = WildlifeRangerFactory.getWildlifeRanger(14/*,"Wilderness", "Zoologist");
        wildlifeRangerRepository.create(wildlifeRanger);
        Assert.assertNotNull(wildlifeRangerRepository.getAll());
    }

    @Test
    public void update() {
        WildlifeRanger wildlifeRanger = WildlifeRangerFactory.getWildlifeRanger(14/*,"Wilderness", "Zoologist");
        wildlifeRangerRepository.create(wildlifeRanger);

        WildlifeRanger wildlifeRanger1 = WildlifeRangerFactory.getWildlifeRanger(14/*,"Jungle", "Zoologist");
        wildlifeRanger1.setEmpId(wildlifeRanger.getEmpId());
        wildlifeRangerRepository.update(wildlifeRanger1);

        WildlifeRanger wildlifeRanger2 = wildlifeRangerRepository.read(wildlifeRanger1.getEmpId());
        Assert.assertEquals(wildlifeRanger1, wildlifeRanger2);
    }

    @Test
    public void delete() {
        WildlifeRanger wildlifeRanger = WildlifeRangerFactory.getWildlifeRanger(14/*,"Wilderness", "Zoologist");
        wildlifeRangerRepository.create(wildlifeRanger);

        Assert.assertNotNull(wildlifeRangerRepository.getAll());
        wildlifeRangerRepository.delete(wildlifeRanger.getEmpId());

        WildlifeRanger wildlifeRanger1 = wildlifeRangerRepository.read(wildlifeRanger.getEmpId());
        Assert.assertNull(wildlifeRanger1);
    }

    @Test
    public void read() {
        WildlifeRanger wildlifeRanger = WildlifeRangerFactory.getWildlifeRanger(14/*,"Wilderness", "Zoologist");
        wildlifeRangerRepository.create(wildlifeRanger);

        WildlifeRanger onSet = wildlifeRangerRepository.read(wildlifeRanger.getEmpId());
        Assert.assertEquals(wildlifeRanger, onSet);
    }
}*/