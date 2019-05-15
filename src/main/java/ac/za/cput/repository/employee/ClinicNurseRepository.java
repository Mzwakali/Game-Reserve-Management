package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicNurseRepository extends InterfaceRepository<ClinicNurse, Integer> {

    Set<ClinicNurse> getAll();
}
