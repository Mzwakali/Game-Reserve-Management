package ac.za.cput.service.EmployeeService;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.service.IService;

import java.util.Set;

public interface FieldGuideService extends IService<FieldGuide, Integer> {
    Set<FieldGuide> getALl();
}
