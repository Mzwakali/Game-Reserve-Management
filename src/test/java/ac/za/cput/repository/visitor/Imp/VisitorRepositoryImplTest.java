package ac.za.cput.repository.visitor.Imp;

import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.factory.visitor.VisitorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitorRepositoryImplTest {

    VisitorRepositoryImpl visitorRepository;

    @Before
    public void setUp() throws Exception {
        visitorRepository = VisitorRepositoryImpl.getRepository();
    }

    @Test
    public void create() {
        Visitor visitor = VisitorFactory.getVisitor(1,"Jason","James","0781824090", "Marine World");
        visitorRepository.create(visitor);

        Assert.assertNotNull(visitorRepository.getAll());
    }

    @Test
    public void update() {
        Visitor visitor = VisitorFactory.getVisitor(1,"Jason","James","0781824090", "Marine World");
        visitorRepository.create(visitor);

        Visitor visitor1 = VisitorFactory.getVisitor(1, "Jessie", "James","0781824090", "Marine World");
        visitor1.setVisitorId(visitor.getVisitorId());

        visitorRepository.update(visitor1);

        Visitor visitor2 = visitorRepository.read(visitor.getVisitorId());
        Assert.assertEquals(visitor1, visitor2);

    }

    @Test
    public void delete() {
        Visitor visitor = VisitorFactory.getVisitor(1,"Jason","James","0781824090", "Marine World");
        visitorRepository.create(visitor);

        Assert.assertNotNull(visitorRepository.getAll());

        visitorRepository.delete(visitor.getVisitorId());

        Visitor onSet = visitorRepository.read(visitor.getVisitorId());
        Assert.assertNull(onSet);
    }

    @Test
    public void read() {
        Visitor visitor = VisitorFactory.getVisitor(1,"Jason","James","0781824090", "Marine World");
        visitorRepository.create(visitor);

        Visitor visitor1 = visitorRepository.read(visitor.getVisitorId());
        Assert.assertEquals(visitor, visitor1);
    }
}