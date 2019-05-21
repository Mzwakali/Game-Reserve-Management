package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.factory.visitor.VisitorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitorServiceImpTest {

    private VisitorServiceImp visitorService;

    @Before
    public void setUp() throws Exception {
        visitorService = new VisitorServiceImp();
    }

    @Test
    public void create() {
        Visitor visitor = VisitorFactory.getVisitor(4, "James", "Brown", "0842131185", null);
        visitorService.create(visitor);
        Assert.assertNotNull(visitorService.getAll());

    }

    @Test
    public void update() {
        Visitor visitor = VisitorFactory.getVisitor(4, "James", "Brown", "0842131185", null);
        visitorService.create(visitor);
        Assert.assertNotNull(visitorService.getAll());

        Visitor visitorUpdate = VisitorFactory.getVisitor(4, "James", "Gorden", "0842131185", null);
        visitorUpdate.setVisitorId(visitor.getVisitorId());
        visitorService.update(visitorUpdate);

        Visitor visitor1 = visitorService.read(visitorUpdate.getVisitorId());
        Assert.assertEquals(visitorUpdate, visitor1);
    }

    @Test
    public void delete() {
        Visitor visitor = VisitorFactory.getVisitor(4, "James", "Brown", "0842131185", null);
        visitorService.create(visitor);
        Assert.assertNotNull(visitorService.getAll());

        visitorService.delete(visitor.getVisitorId());

        Visitor excluded = visitorService.read(visitor.getVisitorId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Visitor visitor = VisitorFactory.getVisitor (4, "James", "Brown", "0842131185", null);
        visitorService.create(visitor);
        Assert.assertNotNull(visitorService.getAll());

        Visitor visitor1 = visitorService.read(visitor.getVisitorId());
        Assert.assertEquals(visitor,visitor1);
    }
}