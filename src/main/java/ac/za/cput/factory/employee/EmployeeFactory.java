package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.Employee;

public class EmployeeFactory {
    public static Employee buildEmployee(int empID, String firstName, String lastName, String position, int age) {
        return new Employee.Builder()
                .empId(empID)
                .firstName(firstName)
                .lastName(lastName)
                .position(position)
                .age(age)
                .build();
    }
}
