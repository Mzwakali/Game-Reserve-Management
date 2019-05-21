package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.factory.employee.MarineRangerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        rangerUpdate.setRangerId(ranger.getRangerId());
        marineRangerService.update(rangerUpdate);

        MarineRanger ranger1 = marineRangerService.read(rangerUpdate.getRangerId());
        Assert.assertEquals(rangerUpdate, ranger1);
    }

    @Test
    public void delete() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());

        marineRangerService.delete(ranger.getRangerId());

        MarineRanger excluded = marineRangerService.read(ranger.getRangerId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        MarineRanger ranger = MarineRangerFactory.getMarineRanger(1,"Marine World");
        marineRangerService.create(ranger);
        Assert.assertNotNull(marineRangerService.getAll());

        MarineRanger ranger1 = marineRangerService.read(ranger.getRangerId());
        Assert.assertEquals(ranger,ranger1);
    }
}