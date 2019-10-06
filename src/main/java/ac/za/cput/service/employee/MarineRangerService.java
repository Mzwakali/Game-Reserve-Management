package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.service.IService;

import java.util.List;

public interface MarineRangerService extends IService<MarineRanger, Integer> {
    List<MarineRanger> getAll();
}
