package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface WildlifeRangerRepository extends JpaRepository<WildlifeRanger, Integer> {

    //Set<WildlifeRanger> getAll();
}
