package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.service.IService;

import java.util.List;

public interface ClinicDocService extends IService<ClinicDoc, Integer> {
    List<ClinicDoc> getAll();
}
