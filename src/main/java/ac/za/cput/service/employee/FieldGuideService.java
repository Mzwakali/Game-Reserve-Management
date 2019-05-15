package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.service.IService;

import java.util.Set;

public interface FieldGuideService extends IService<FieldGuide, Integer> {
    Set<FieldGuide> getAll();
}
