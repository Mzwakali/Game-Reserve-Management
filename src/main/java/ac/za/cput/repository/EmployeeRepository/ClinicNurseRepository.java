package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.ClinicNurse;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicNurseRepository extends InterfaceRepository<ClinicNurse, Integer> {

    Set<ClinicNurse> getAll();
}
