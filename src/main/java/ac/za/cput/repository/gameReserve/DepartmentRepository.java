package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface DepartmentRepository extends InterfaceRepository<Department, Integer> {

    Set<Department> getAll();
}
