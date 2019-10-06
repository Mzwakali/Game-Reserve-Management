package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.service.IService;

import java.util.List;

public interface EmployeeService extends IService<Employee, Integer> {
    List<Employee> getAll();
}
