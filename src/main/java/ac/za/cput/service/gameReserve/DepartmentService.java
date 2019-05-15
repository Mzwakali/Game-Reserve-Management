package ac.za.cput.service.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.service.IService;

import java.util.Set;

public interface DepartmentService extends IService<Department, Integer> {
    Set<Department> getAll();
}
