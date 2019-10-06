package ac.za.cput.service.employee;

import ac.za.cput.service.IService;
import ac.za.cput.domain.employee.Caretaker;

import java.util.List;

public interface CaretakerService extends IService<Caretaker, Integer> {
    List<Caretaker> getAll();
}
