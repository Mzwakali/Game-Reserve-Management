package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface SecurityRepository extends InterfaceRepository<Security, Integer> {

    Set<Security> getAll();
}
