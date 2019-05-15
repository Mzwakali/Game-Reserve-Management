package ac.za.cput.service.employee;

import ac.za.cput.service.IService;
import ac.za.cput.domain.employee.Caretaker;

import java.util.Set;

public interface CaretakerService extends IService<Caretaker, Integer> {
    Set<Caretaker> getAll();
}
