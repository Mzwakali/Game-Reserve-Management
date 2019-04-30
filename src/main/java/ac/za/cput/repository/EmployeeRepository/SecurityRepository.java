package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.Security;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface SecurityRepository extends InterfaceRepository<Security, Integer> {

    Set<Security> getAll();
}
