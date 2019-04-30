package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.WildlifeRanger;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface WildlifeRangerRepository extends InterfaceRepository<WildlifeRanger, Integer> {

    Set<WildlifeRanger> getAll();
}
