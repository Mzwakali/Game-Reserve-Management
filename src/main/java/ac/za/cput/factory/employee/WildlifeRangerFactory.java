package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.Qualification;
import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class WildlifeRangerFactory {

    public static WildlifeRanger getWildlifeRanger(int wildlifeRangerId, String department, String qualification){
        return (WildlifeRanger) new WildlifeRanger.WildlifeRangerBuilder()
                .empId(wildlifeRangerId)
                //.departments(department)
                //.qualification(qualifications)
                .build();
    }
}
