package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.service.IService;

import java.util.List;

public interface ClinicNurseService extends IService<ClinicNurse, Integer> {
    List<ClinicNurse> getAll();
}
