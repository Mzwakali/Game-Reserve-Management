package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.Security;
import ac.za.cput.service.IService;

import java.util.Set;

public interface SecurityService extends IService<Security, Integer> {
    Set<Security> getAll();
}
