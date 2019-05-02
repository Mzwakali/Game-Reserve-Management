package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ClinicDocService extends IService<ClinicDoc, Integer> {
    Set<ClinicDoc> getAll();
}
