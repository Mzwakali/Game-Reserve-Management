package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.employee.EmployeeRepository;
//import ac.za.cput.repository.employee.Imp.EmployeeRepositoryImpl;
import ac.za.cput.service.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeService employeeService = null;

    @Autowired
    private EmployeeRepository employeeRepository;

    /*EmployeeServiceImpl(){
        this.employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
    }*/

    public static EmployeeService getEmployeeService(){
        if (employeeService == null){
            employeeService = new EmployeeServiceImpl();
        }
        return employeeService;
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee create(Employee t) {
        return this.employeeRepository.save(t);
    }

    @Override
    public Employee update(Employee t) {
        return this.employeeRepository.save(t);
    }

    @Override
    public void delete(Integer id) {
        this.employeeRepository.deleteById(id);
    }

    @Override
    public Employee read(int id) {
        Optional<Employee> optionalEmployee = this.employeeRepository.findById(id);
        return optionalEmployee.orElse(null);
    }
}
