package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.service.IService;

import java.util.Set;

public interface MarineRangerService extends IService<MarineRanger, Integer> {
    Set<MarineRanger> getAll();
}
