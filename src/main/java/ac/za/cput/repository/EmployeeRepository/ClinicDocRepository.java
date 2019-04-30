package ac.za.cput.repository.EmployeeRepository;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicDocRepository extends InterfaceRepository<ClinicDoc, Integer> {

    Set<ClinicDoc> getAll();
}
