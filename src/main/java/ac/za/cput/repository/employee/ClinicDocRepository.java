package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicDocRepository extends InterfaceRepository<ClinicDoc, Integer> {

    Set<ClinicDoc> getAll();
}
