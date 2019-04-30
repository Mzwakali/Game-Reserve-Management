package ac.za.cput.Service.EmployeeService;

import ac.za.cput.Service.IService;
import ac.za.cput.domain.Employee.Caretaker;

import java.util.Set;

public interface CaretakerService extends IService<Caretaker, Integer> {
    Set<Caretaker> getAll();
}
