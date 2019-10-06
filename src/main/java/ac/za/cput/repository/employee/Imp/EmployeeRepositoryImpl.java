/*package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.repository.employee.EmployeeRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("EmployeeInMemory")
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private Map<Integer, Employee> employees;
    private static EmployeeRepository employeeRepository = null;

    public EmployeeRepositoryImpl(){
        this.employees = new HashMap<>();
    }


    public static EmployeeRepository getEmployeeRepository(){
        if (employeeRepository == null) employeeRepository = new EmployeeRepositoryImpl();
        return employeeRepository;
    }

    @Override
    public Set<Employee> getAll() {
        return new HashSet<>(employees.values());
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.put(employee.getEmpId(), employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        employees.replace(employee.getEmpId(), employee);
        return employees.get(employee.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        employees.remove(id);
    }

    @Override
    public Employee read(int id) {
        return employees.get(id);
    }
}*/
