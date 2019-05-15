package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface WildlifeRangerRepository extends InterfaceRepository<WildlifeRanger, Integer> {

    Set<WildlifeRanger> getAll();
}
