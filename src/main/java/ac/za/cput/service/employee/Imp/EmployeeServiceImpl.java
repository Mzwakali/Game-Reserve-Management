package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.employee.EmployeeRepository;
import ac.za.cput.repository.employee.Imp.EmployeeRepositoryImpl;
import ac.za.cput.service.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl employeeService = null;
    private EmployeeRepository employeeRepository;

    EmployeeServiceImpl(){
        this.employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getEmployeeService(){
        if (employeeService == null){
            employeeService = new EmployeeServiceImpl();
        }
        return employeeService;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employeeRepository.getAll();
    }

    @Override
    public Employee create(Employee t) {
        return this.employeeRepository.create(t);
    }

    @Override
    public Employee update(Employee t) {
        return this.employeeRepository.update(t);
    }

    @Override
    public void delete(Integer id) {
        this.employeeRepository.delete(id);
    }

    @Override
    public Employee read(int id) {
        return this.employeeRepository.read(id);
    }
}
