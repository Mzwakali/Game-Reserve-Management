package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.domain.employee.Qualification;
import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class MarineRangerFactory {

    public static MarineRanger getMarineRanger(int marineRangerId/*, String department*/){
        return (MarineRanger) new MarineRanger.MarineRangerBuilder()
                .empId(marineRangerId)
                //.departments(department)
                //.qualification(qualificationList)
                .build();
    }
}
