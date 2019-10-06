package ac.za.cput.repository.visitor.Imp;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.factory.visitor.LocalVisitorFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.acl.LastOwnerException;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class LocalVisitorRepositoryImpTest {

    LocalVisitorRepositoryImp localRepository;

    @Before
    public void setUp() throws Exception {
        localRepository = LocalVisitorRepositoryImp.getLocalVisitorRepository();
    }

    @Test
    public void create() {
        //instance creation
        LocalVisitor localVisitor = LocalVisitorFactory.getLocalVisitor("Jonas", "Jackson", "08427945532");
        localRepository.create(localVisitor);

        Assert.assertNotNull(localRepository.getAll());
    }

    @Test
    public void update() {
        LocalVisitor localVisitor = LocalVisitorFactory.getLocalVisitor("Jonas", "Jackson", "08427945532");
        localRepository.create(localVisitor);

         LocalVisitor localVisitor1 = LocalVisitorFactory.getLocalVisitor("Jonas", "Joyner", "08427945532");
         localVisitor1.setVisitorId(localVisitor.getVisitorId());

         localRepository.update(localVisitor1);

         LocalVisitor onset = localRepository.read(localVisitor.getVisitorId());
         Assert.assertEquals(localVisitor1, onset);
    }

    @Test
    public void delete() {
        LocalVisitor localVisitor = LocalVisitorFactory.getLocalVisitor("Jonas", "Jackson", "08427945532");
        localRepository.create(localVisitor);

        Assert.assertNotNull(localRepository.getAll());

        localRepository.delete(localVisitor.getVisitorId());

        LocalVisitor localVisitor1 = localRepository.read(localVisitor.getVisitorId());
        Assert.assertNull(localVisitor1);
    }

    @Test
    public void read() {
        LocalVisitor localVisitor = LocalVisitorFactory.getLocalVisitor("Jonas", "Jackson", "08427945532");
        localRepository.create(localVisitor);

        LocalVisitor localVisitor1 = localRepository.read(localVisitor.getVisitorId());
        Assert.assertEquals(localVisitor, localVisitor1);
    }
}*/