package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.domain.Employee.Employee;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface CaretakerRepository extends InterfaceRepository<Caretaker, Integer> {

    Set<Caretaker> getAll();
}
