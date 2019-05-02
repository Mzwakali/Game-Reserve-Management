package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface FieldGuideRepository extends InterfaceRepository<FieldGuide, Integer> {

    Set<FieldGuide> getAll();
}
