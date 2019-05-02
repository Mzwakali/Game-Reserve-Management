package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.ClinicNurse;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ClinicNurseService extends IService<ClinicNurse, Integer> {
    Set<ClinicNurse> getAll();
}
