package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.WildlifeRanger;
import ac.za.cput.service.IService;

import java.util.Set;

public interface WildlifeRangerService extends IService<WildlifeRanger, Integer> {
    Set<WildlifeRanger> getAll();
}

