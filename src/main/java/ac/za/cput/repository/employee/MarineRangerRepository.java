package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface MarineRangerRepository extends JpaRepository<MarineRanger, Integer> {

    //Set<MarineRanger> getAll();
}
