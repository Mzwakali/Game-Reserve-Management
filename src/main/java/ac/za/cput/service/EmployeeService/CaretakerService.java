package ac.za.cput.service.EmployeeService;

import ac.za.cput.service.IService;
import ac.za.cput.domain.Employee.Caretaker;

import java.util.Set;

public interface CaretakerService extends IService<Caretaker, Integer> {
    Set<Caretaker> getAll();
}
