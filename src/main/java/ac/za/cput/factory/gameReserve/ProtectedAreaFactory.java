package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.gameReserve.ProtectedArea;

import java.util.List;

public class ProtectedAreaFactory {

    public static ProtectedArea getProtectedArea(int areaId, List<Department> departments){
        return  new ProtectedArea.ProtectedAreaBuilder()
                .areaId(areaId)
                .department(departments)
                .build();
    }
}
