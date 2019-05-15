package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface CaretakerRepository extends InterfaceRepository<Caretaker, Integer> {

    Set<Caretaker> getAll();
}
