package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class SecurityFactory {

    public static Security getSecurity(int securityId ){
        return (Security) new Security.SecurityBuilder()
                .empId(securityId)
                //.departments(departments)
                .build();
    }
}
