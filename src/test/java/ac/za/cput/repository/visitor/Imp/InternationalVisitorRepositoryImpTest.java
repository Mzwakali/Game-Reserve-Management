package ac.za.cput.repository.visitor.Imp;

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
public class InternationalVisitorRepositoryImpTest {

    InternationalVisitorRepositoryImp internationalRepository;


    @Before
    public void setUp() throws Exception {
        internationalRepository = InternationalVisitorRepositoryImp.getInternationalVisitorRepo();
    }

    @Test
    public void create() {
        //instance creation
        InternationalVisitor internationalVisitor = InternationalVisitorFactory.getInternationalVisitor("25/05/19");
        internationalRepository.create(internationalVisitor);

        Assert.assertNotNull(internationalRepository.getAll());
    }

    @Test
    public void update() {
        InternationalVisitor internationalVisitor = InternationalVisitorFactory.getInternationalVisitor("25/05/19");
        internationalRepository.create(internationalVisitor);

         InternationalVisitor internationalVisitor1 = InternationalVisitorFactory.getInternationalVisitor( "28/05/19");
         internationalVisitor1.setVisitorId(internationalVisitor.getVisitorId());

         internationalRepository.update(internationalVisitor1);

         InternationalVisitor onset = internationalRepository.read(internationalVisitor.getVisitorId());
         Assert.assertEquals(internationalVisitor1, onset);
    }

    @Test
    public void delete() {
        InternationalVisitor internationalVisitor = InternationalVisitorFactory.getInternationalVisitor("25/05/19");
        internationalRepository.create(internationalVisitor);

        Assert.assertNotNull(internationalRepository.getAll());

        internationalRepository.delete(internationalVisitor.getVisitorId());

        InternationalVisitor internationalVisitor1 = internationalRepository.read(internationalVisitor.getVisitorId());
        Assert.assertNull(internationalVisitor1);
    }

    @Test
    public void read() {
        InternationalVisitor internationalVisitor = InternationalVisitorFactory.getInternationalVisitor("25/05/19");
        internationalRepository.create(internationalVisitor);

        InternationalVisitor internationalVisitor1 = internationalRepository.read(internationalVisitor.getVisitorId());
        Assert.assertEquals(internationalVisitor, internationalVisitor1);
    }
}