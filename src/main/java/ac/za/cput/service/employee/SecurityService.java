package ac.za.cput.service.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.service.IService;

import java.util.List;

public interface SecurityService extends IService<Security, Integer> {
    List<Security> getAll();
}
