package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.factory.employee.SecurityFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityRepositoryImpTest {

    SecurityRepositoryImp securityRepository;

    @Before
    public void setUp() throws Exception {
        securityRepository = SecurityRepositoryImp.getSecurityRepository();
    }

    @Test
    public void create() {
        Security security = SecurityFactory.getSecurity(23);
        securityRepository.create(security);
        Assert.assertNotNull(securityRepository.getAll());
    }

    @Test
    public void update() {
        Security security = SecurityFactory.getSecurity(23);
        securityRepository.create(security);

        Security security1 = SecurityFactory.getSecurity(55);
        security1.setEmpId(security.getEmpId());
        securityRepository.update(security1);

        Security security2 = securityRepository.read(security1.getEmpId());
        Assert.assertEquals(security1, security2);
    }

    @Test
    public void delete() {
        Security security = SecurityFactory.getSecurity(23);
        securityRepository.create(security);

        Assert.assertNotNull(securityRepository.getAll());
        securityRepository.delete(security.getEmpId());

        Security security1 = securityRepository.read(security.getEmpId());
        Assert.assertNull(security1);
    }

    @Test
    public void read() {
        Security security = SecurityFactory.getSecurity(23);
        securityRepository.create(security);

        Security onSet = securityRepository.read(security.getEmpId());
        Assert.assertEquals(security, onSet);
    }
}*/