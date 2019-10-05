package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface FieldGuideRepository extends JpaRepository<FieldGuide, Integer> {

    //Set<FieldGuide> getAll();
}
