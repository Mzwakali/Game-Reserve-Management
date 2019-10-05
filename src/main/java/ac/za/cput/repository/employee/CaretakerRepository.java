package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CaretakerRepository extends JpaRepository<Caretaker, Integer> {
    //Set<Caretaker> getAll();
}
