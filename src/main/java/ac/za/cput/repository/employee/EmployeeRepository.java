package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Set<Employee>getAll();
}
