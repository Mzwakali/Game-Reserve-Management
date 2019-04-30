package ac.za.cput.repository.EmployeeRepository.Imp;

import ac.za.cput.domain.Employee.Security;
import ac.za.cput.repository.EmployeeRepository.SecurityRepository;

import java.util.HashSet;
import java.util.Set;

public class SecurityRepositoryImp implements SecurityRepository {
    private static SecurityRepositoryImp securityRepo = null;
    private Set<Security> securities;

    private SecurityRepositoryImp(){
        securities = new HashSet<>();
    }

    public static SecurityRepositoryImp getSecurityRepository(){
        if (securityRepo == null){
            return new SecurityRepositoryImp();
        }
        return securityRepo;
    }

    public Security find(int id){
        return securities.stream().filter(security -> security.getEmpId() ==id).findAny().orElse(null);
    }
    @Override
    public Set<Security> getAll() {
        return securities;
    }

    @Override
    public Security create(Security security) {
        securities.add(security);
        return security;
    }

    @Override
    public Security update(Security security) {
        Security security1 = find(security.getEmpId());
        if (securities.contains(security1)){
            securities.remove(security1);
            securities.add(security);
        }
        return security1;
    }

    @Override
    public void delete(Integer id) {
        Security security = find(id);
        securities.remove(security);
    }

    @Override
    public Security read(int id) {
        Security security = find(id);
        if (security == null){
            return null;
        }
        else {
            return security;
        }
    }
}
