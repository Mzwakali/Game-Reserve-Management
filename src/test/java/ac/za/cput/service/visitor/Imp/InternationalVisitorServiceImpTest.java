package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.factory.visitor.InternationalVisitorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InternationalVisitorServiceImpTest {

    private InternationalVisitorServiceImp internationalVisitorService;

    @Before
    public void setUp() throws Exception {
        internationalVisitorService = new InternationalVisitorServiceImp();
    }

    @Test
    public void create() {
        InternationalVisitor internationals = InternationalVisitorFactory.getInternationalVisitor(null);
        internationalVisitorService.create(internationals);
        Assert.assertNotNull(internationalVisitorService.getAll());

    }

    @Test
    public void update() {
        InternationalVisitor internationals = InternationalVisitorFactory.getInternationalVisitor(null);
        internationalVisitorService.create(internationals);
        Assert.assertNotNull(internationalVisitorService.getAll());

        InternationalVisitor internationalsUpdate = InternationalVisitorFactory.getInternationalVisitor(null);
        internationalsUpdate.setVisitorId(internationals.getVisitorId());
        internationalVisitorService.update(internationalsUpdate);

        InternationalVisitor internationalVisitor = internationalVisitorService.read(internationalsUpdate.getVisitorId());
        Assert.assertEquals(internationalsUpdate, internationalVisitor);
    }

    @Test
    public void delete() {
        InternationalVisitor internationals = InternationalVisitorFactory.getInternationalVisitor(null);
        internationalVisitorService.create(internationals);
        Assert.assertNotNull(internationalVisitorService.getAll());

        internationalVisitorService.delete(internationals.getVisitorId());

        InternationalVisitor excluded = internationalVisitorService.read(internationals.getVisitorId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        InternationalVisitor internationals = InternationalVisitorFactory.getInternationalVisitor(null);
        internationalVisitorService.create(internationals);
        Assert.assertNotNull(internationalVisitorService.getAll());;

        InternationalVisitor internationalVisitor = internationalVisitorService.read(internationals.getVisitorId());
        Assert.assertEquals(internationals,internationalVisitor);
    }
}