package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.MarineRanger;
import ac.za.cput.repository.InterfaceRepository;
import java.util.HashSet;
import java.util.Set;

public interface MarineRangerRepository extends InterfaceRepository<MarineRanger, Integer> {

    Set<MarineRanger> getAll();
}
