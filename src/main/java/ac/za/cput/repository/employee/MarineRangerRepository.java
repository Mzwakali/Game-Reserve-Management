package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface MarineRangerRepository extends InterfaceRepository<MarineRanger, Integer> {

    Set<MarineRanger> getAll();
}
