package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.factory.visitor.LocalVisitorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocalVisitorServiceImpTest {

    private LocalVisitorServiceImp localVisitorService;

    @Before
    public void setUp() throws Exception {
        localVisitorService = new LocalVisitorServiceImp();
    }

    @Test
    public void create() {
        LocalVisitor locals = LocalVisitorFactory.getLocalVisitor("John", "Gabanna", "0781824094");
        localVisitorService.create(locals);
        Assert.assertNotNull(localVisitorService.getAll());

    }

    @Test
    public void update() {
        LocalVisitor locals = LocalVisitorFactory.getLocalVisitor("John", "Gabanna", "0781824094");
        localVisitorService.create(locals);
        Assert.assertNotNull(localVisitorService.getAll());

        LocalVisitor localsUpdate = LocalVisitorFactory.getLocalVisitor("Boonk", "James", "0842131185");
        localsUpdate.setVisitorId(locals.getVisitorId());
        localVisitorService.update(localsUpdate);

        LocalVisitor visitor1 = localVisitorService.read(localsUpdate.getVisitorId());
        Assert.assertEquals(localsUpdate, visitor1);
    }

    @Test
    public void delete() {
        LocalVisitor locals = LocalVisitorFactory.getLocalVisitor("John", "Gabanna", "0781824094");
        localVisitorService.create(locals);
        Assert.assertNotNull(localVisitorService.getAll());

        localVisitorService.delete(locals.getVisitorId());

        LocalVisitor excluded = localVisitorService.read(locals.getVisitorId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        LocalVisitor locals = LocalVisitorFactory.getLocalVisitor("John", "Gabanna", "0781824094");
        localVisitorService.create(locals);
        Assert.assertNotNull(localVisitorService.getAll());

        LocalVisitor visitor1 = localVisitorService.read(locals.getVisitorId());
        Assert.assertEquals(locals,visitor1);
    }
}