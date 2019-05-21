package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.factory.employee.SecurityFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityServiceImpTest {

    private SecurityServiceImp securityService;

    @Before
    public void setUp() throws Exception {
        securityService = new SecurityServiceImp();
    }

    @Test
    public void create() {
        Security security = SecurityFactory.getSecurity(55);
        securityService.create(security);
        Assert.assertNotNull(securityService.getAll());
    }

    @Test
    public void update() {
        Security security = SecurityFactory.getSecurity(55);
        securityService.create(security);
        Assert.assertNotNull(securityService.getAll());

        Security securityUpdate = SecurityFactory.getSecurity(22);
        securityUpdate.setSecurityId(security.getSecurityId());
        securityService.update(securityUpdate);

        Security security1 = securityService.read(securityUpdate.getSecurityId());
        Assert.assertEquals(securityUpdate, security1);
    }

    @Test
    public void delete() {
        Security security = SecurityFactory.getSecurity(55);
        securityService.create(security);
        Assert.assertNotNull(securityService.getAll());

        securityService.delete(security.getSecurityId());

        Security excluded = securityService.read(security.getSecurityId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        Security security = SecurityFactory.getSecurity(55);
        securityService.create(security);
        Assert.assertNotNull(securityService.getAll());

        Security security1 = securityService.read(security.getSecurityId());
        Assert.assertEquals(security,security1);
    }
}