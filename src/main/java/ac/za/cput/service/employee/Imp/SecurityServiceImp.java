package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Security;
//import ac.za.cput.repository.employee.Imp.SecurityRepositoryImp;
import ac.za.cput.repository.employee.SecurityRepository;
import ac.za.cput.service.employee.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecurityServiceImp implements SecurityService {

    private static SecurityService securityService = null;

    @Autowired
    private SecurityRepository repository;

    /*SecurityServiceImp(){
        this.repository = SecurityRepositoryImp.getSecurityRepository();
    }*/

    public static SecurityService getSecurityService(){
        if (securityService == null){
            securityService = new SecurityServiceImp();
        }
        return securityService;
    }

    @Override
    public List<Security> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Security create(Security security) {
        return this.repository.save(security);
    }

    @Override
    public Security update(Security security) {
        return this.repository.save(security);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public Security read(int id) {
        Optional<Security> optionalSecurity = this.repository.findById(id);
        return optionalSecurity.orElse(null);
    }
}
