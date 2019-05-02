package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.MarineRanger;
import ac.za.cput.service.IService;

import java.util.Set;

public interface MarineRangerService extends IService<MarineRanger, Integer> {
    Set<MarineRanger> getAll();
}
