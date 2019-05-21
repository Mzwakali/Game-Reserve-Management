package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.repository.employee.Imp.SecurityRepositoryImp;
import ac.za.cput.repository.employee.SecurityRepository;
import ac.za.cput.service.employee.SecurityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SecurityServiceImp implements SecurityService {
    private static SecurityServiceImp securityService = null;
    private SecurityRepository repository;

    SecurityServiceImp(){
        this.repository = SecurityRepositoryImp.getSecurityRepository();
    }

    public static SecurityServiceImp getSecurityService(){
        if (securityService == null){
            securityService = new SecurityServiceImp();
        }
        return securityService;
    }

    @Override
    public Set<Security> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Security create(Security security) {
        return this.repository.create(security);
    }

    @Override
    public Security update(Security security) {
        return this.repository.update(security);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public Security read(int id) {
        return this.repository.read(id);
    }
}
