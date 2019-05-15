package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.service.IService;

import java.util.Set;

public interface SecurityService extends IService<Security, Integer> {
    Set<Security> getAll();
}
