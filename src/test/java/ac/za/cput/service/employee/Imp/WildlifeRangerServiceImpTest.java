package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.factory.employee.WildlifeRangerFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WildlifeRangerServiceImpTest {

    private WildlifeRangerServiceImp wildlifeRangerService;

    @Before
    public void setUp() throws Exception {
        wildlifeRangerService = new WildlifeRangerServiceImp();
    }

    @Test
    public void create() {
        WildlifeRanger ranger = WildlifeRangerFactory.getWildlifeRanger(2, "Jungle", "Zoologist");
        wildlifeRangerService.create(ranger);
        Assert.assertNotNull(wildlifeRangerService.getAll());
    }

    @Test
    public void update() {
        WildlifeRanger ranger = WildlifeRangerFactory.getWildlifeRanger(2, "Jungle", "Zoologist");
        wildlifeRangerService.create(ranger);
        Assert.assertNotNull(wildlifeRangerService.getAll());

        WildlifeRanger rangerUpdate = WildlifeRangerFactory.getWildlifeRanger(2, "Jurassic World", "Jungle Book");
        rangerUpdate.setRangerId(ranger.getRangerId());
        wildlifeRangerService.update(rangerUpdate);

        WildlifeRanger ranger1 = wildlifeRangerService.read(rangerUpdate.getRangerId());
        Assert.assertEquals(rangerUpdate, ranger1);
    }

    @Test
    public void delete() {
        WildlifeRanger ranger = WildlifeRangerFactory.getWildlifeRanger(2, "Jungle", "Zoologist");
        wildlifeRangerService.create(ranger);
        Assert.assertNotNull(wildlifeRangerService.getAll());

        wildlifeRangerService.delete(ranger.getRangerId());

        WildlifeRanger excluded = wildlifeRangerService.read(ranger.getRangerId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        WildlifeRanger ranger = WildlifeRangerFactory.getWildlifeRanger(2, "Jungle", "Zoologist");
        wildlifeRangerService.create(ranger);
        Assert.assertNotNull(wildlifeRangerService.getAll());

        WildlifeRanger ranger1 = wildlifeRangerService.read(ranger.getRangerId());
        Assert.assertEquals(ranger,ranger1);
    }
}