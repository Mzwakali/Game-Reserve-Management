package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.FoodCourtStaff;
import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class FoodCourtStaffFactory {

    public static FoodCourtStaff getStaff(int foodCourtId, List<Department> departments){
        return (FoodCourtStaff) new FoodCourtStaff.FoodCourtStaffBuilder()
                .foodCourtId(foodCourtId)
                .departments(departments)
                .build();
    }
}
