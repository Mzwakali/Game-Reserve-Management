package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.factory.gameReserve.ProtectedAreaFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProtectedAreaServiceImpTest {
    private ProtectedAreaServiceImp protectedAreaService;

    @Before
    public void setUp() throws Exception {
        protectedAreaService = new ProtectedAreaServiceImp();
    }

    @Test
    public void create() {
        ProtectedArea protectedArea = ProtectedAreaFactory.getProtectedArea(2,null);
        protectedAreaService.create(protectedArea);
        Assert.assertNotNull(protectedAreaService.getAll());

    }

    @Test
    public void update() {
        ProtectedArea protectedArea = ProtectedAreaFactory.getProtectedArea(2,null);
        protectedAreaService.create(protectedArea);
        Assert.assertNotNull(protectedAreaService.getAll());

        ProtectedArea areaUpdate = ProtectedAreaFactory.getProtectedArea(4,null);
        areaUpdate.setAreaId(protectedArea.getAreaId());
        protectedAreaService.update(areaUpdate);

        ProtectedArea newArea = protectedAreaService.read(areaUpdate.getAreaId());
        Assert.assertEquals(areaUpdate, newArea);
    }

    @Test
    public void delete() {
        ProtectedArea protectedArea = ProtectedAreaFactory.getProtectedArea(2,null);
        protectedAreaService.create(protectedArea);
        Assert.assertNotNull(protectedAreaService.getAll());

        protectedAreaService.delete(protectedArea.getAreaId());

        ProtectedArea excluded = protectedAreaService.read(protectedArea.getAreaId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        ProtectedArea protectedArea = ProtectedAreaFactory.getProtectedArea(2,null);
        protectedAreaService.create(protectedArea);
        Assert.assertNotNull(protectedAreaService.getAll());

        ProtectedArea areaRead = protectedAreaService.read(protectedArea.getAreaId());
        Assert.assertEquals(protectedArea,areaRead);
    }
}