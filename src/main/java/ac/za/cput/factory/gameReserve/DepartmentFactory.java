package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.util.Misc;

import java.util.List;

public class DepartmentFactory {

    public static Department getDepartment(int deptId, int clinicId, List<ProtectedArea>protectedAreas){
        return new Department.DepartmentBuilder()
                .departmentId(Misc.generateId())
                .clinicId(clinicId)
                .protectedArea(protectedAreas)
                .build();
    }

}
