package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.repository.employee.SecurityRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("SecurityInMemory")
public class SecurityRepositoryImp implements SecurityRepository {
    private static SecurityRepositoryImp securityRepo = null;
    private Map<Integer, Security> securities;

    private SecurityRepositoryImp(){
        securities = new HashMap<>();
    }

    public static SecurityRepositoryImp getSecurityRepository(){
        if (securityRepo == null){
            return new SecurityRepositoryImp();
        }
        return securityRepo;
    }

    /*public Security find(int id){
        return securities.stream().filter(security -> security.getEmpId() ==id).findAny().orElse(null);
    }*/

    @Override
    public Set<Security> getAll() {
        return new HashSet<>(securities.values());
    }

    @Override
    public Security create(Security security) {
        securities.put(security.getEmpId(), security);
        return security;
    }

    @Override
    public Security update(Security security) {
       /* Security security1 = find(security.getEmpId());
        if (securities.contains(security1)){
            securities.remove(security1);
            securities.add(security);
        }*/
       securities.replace(security.getEmpId(), security);
        return securities.get(security.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //Security security = find(id);
        securities.remove(id);
    }

    @Override
    public Security read(int id) {
        /*Security security = find(id);
        if (security == null){
            return null;
        }
        else {
            return security;
        }*/
        return  securities.get(id);
    }
}
