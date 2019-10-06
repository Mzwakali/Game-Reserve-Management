package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.service.IService;

import java.util.List;

public interface WildlifeRangerService extends IService<WildlifeRanger, Integer> {
    List<WildlifeRanger> getAll();
}

