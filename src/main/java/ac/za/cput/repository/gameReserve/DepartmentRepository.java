package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    //Set<Department> getAll();
}
