package ac.za.cput.repository.GameReserveRepository;

import ac.za.cput.domain.GameReserve.Department;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface DepartmentRepository extends InterfaceRepository<Department, Integer> {

    Set<Department> getAll();
}
