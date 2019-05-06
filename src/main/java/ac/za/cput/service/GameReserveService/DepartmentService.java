package ac.za.cput.service.GameReserveService;

import ac.za.cput.domain.GameReserve.Department;
import ac.za.cput.service.IService;

import java.util.Set;

public interface DepartmentService extends IService<Department, Integer> {
    Set<Department> getAll();
}
