package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface EmployeeRepository extends InterfaceRepository<Employee, Integer> {
    Set<Employee>getAll();
}
