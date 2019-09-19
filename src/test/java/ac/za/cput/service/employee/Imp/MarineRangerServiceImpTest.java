package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.factory.employee.MarineRangerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarineRangerServiceImpTest {

    private MarineRangerServiceImp marineRangerService;

    @Before
    public void setUp() throws Exception {
        marineRangerService = new MarineRangerServiceImp();
    }

    @Test
    public void create() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());
    }

    @Test
    public void update() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());

        MarineRanger rangerUpdate = MarineRangerFactory.getMarineRanger(2, "Marine World");
        rangerUpdate.setEmpId(ranger.getEmpId());
        marineRangerService.update(rangerUpdate);

        MarineRanger ranger1 = marineRangerService.read(rangerUpdate.getEmpId());
        Assert.assertEquals(rangerUpdate, ranger1);
    }

    @Test
    public void delete() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());

        marineRangerService.delete(ranger.getEmpId());

        MarineRanger excluded = marineRangerService.read(ranger.getEmpId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());

        MarineRanger ranger1 = marineRangerService.read(ranger.getEmpId());
        Assert.assertEquals(ranger,ranger1);
    }
}