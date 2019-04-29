package ac.za.cput.repository.Implementation;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.factory.FieldGuideFactory;
import ac.za.cput.factory.LocalVisitorFactory;
import ac.za.cput.repository.VisitorRepository.VisitorRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class VisitorRepositoryImplTest {

    VisitorRepositoryImpl visitorRepo;

    @Before
    public void setUp() throws Exception {
        visitorRepo = VisitorRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        FieldGuide guide = FieldGuideFactory.getGuide("Joseph");
        Visitor visitor = LocalVisitorFactory.getLocalVisitor("Walt","Disney","08421311789");

        visitorRepo.create(visitor);
        Assert.assertNotNull(visitorRepo.getAll());
    }

    @Test
    public void update() {
        FieldGuide guide = FieldGuideFactory.getGuide("Jospeh");
        Visitor visitor = LocalVisitorFactory.getLocalVisitor("Walt","Disney","08421311789");

        Visitor visitor1 = LocalVisitorFactory.getLocalVisitor("Tiffany","Disney","0781824091");
        visitor1.setVisitorId(visitor.getVisitorId());
        visitorRepo.update(visitor1);

        Visitor visitorUpdate =  visitorRepo.find(visitor.getVisitorId());
        Assert.assertEquals(visitor1, visitorUpdate);

        System.out.println(visitor1.toString());
        System.out.println(visitorUpdate.toString());

    }

    @Test
    public void delete() {
        FieldGuide guide = FieldGuideFactory.getGuide("Jospeh");
        Visitor visitor = LocalVisitorFactory.getLocalVisitor("Walt","Disney","08421311789");
        visitorRepo.create(visitor);
        Assert.assertNotNull(visitorRepo.getAll());

        visitorRepo.delete(visitor.getVisitorId());
        Visitor included = visitorRepo.read(visitor.getVisitorId());
        Assert.assertNull(included);
    }

    @Test
    public void read() {
        FieldGuide guide = FieldGuideFactory.getGuide("Jospeh");
        Visitor visitor = LocalVisitorFactory.getLocalVisitor("Walt","Disney","08421311789");
        visitorRepo.create(visitor);
        Visitor included = visitorRepo.read(visitor.getVisitorId());
        Assert.assertEquals(visitor, included);
    }
}