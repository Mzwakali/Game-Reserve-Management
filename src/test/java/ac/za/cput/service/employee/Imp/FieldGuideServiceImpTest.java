package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.factory.employee.FieldGuideFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldGuideServiceImpTest {

    private FieldGuideServiceImp guideService;

    @Before
    public void setUp() throws Exception {
        guideService = new FieldGuideServiceImp();
    }

    @Test
    public void create() {
        FieldGuide guide = FieldGuideFactory.getGuide(1/*,"07/06/19",  null*/);
        guideService.create(guide);

        Assert.assertNotNull(guideService.getAll());
    }

    @Test
    public void update() {
        FieldGuide guide = FieldGuideFactory.getGuide(1/*,"07/06/19",  null*/);
        guideService.create(guide);
        Assert.assertNotNull(guideService.getAll());

        FieldGuide guideUpdate = FieldGuideFactory.getGuide(1/*, "15/06/19", null*/);
        guideUpdate.setGuideId(guide.getGuideId());
        guideService.update(guideUpdate);

        FieldGuide guide1 = guideService.read(guideUpdate.getGuideId());
        Assert.assertEquals(guideUpdate, guide1);
    }

    @Test
    public void delete() {
        FieldGuide guide = FieldGuideFactory.getGuide(1/*,"07/06/19",  null*/);
        guideService.create(guide);
        Assert.assertNotNull(guideService.getAll());

        guideService.delete(guide.getGuideId());

        FieldGuide excluded = guideService.read(guide.getGuideId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        FieldGuide guide = FieldGuideFactory.getGuide(1/*,"07/06/19",  null*/);
        guideService.create(guide);
        Assert.assertNotNull(guideService.getAll());

        FieldGuide guide1 = guideService.read(guide.getEmpId());
        Assert.assertEquals(guide,guide1);
    }
}