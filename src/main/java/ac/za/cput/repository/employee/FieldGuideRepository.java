package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface FieldGuideRepository extends InterfaceRepository<FieldGuide, Integer> {

    Set<FieldGuide> getAll();
}
