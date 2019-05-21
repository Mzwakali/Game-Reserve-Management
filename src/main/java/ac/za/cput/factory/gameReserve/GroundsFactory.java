package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.gameReserve.Grounds;

import java.util.List;

public class GroundsFactory {

    public static Grounds getGrounds(int sectionId, double size, List<Department> departments){
        return new Grounds.GroundsBuilder()
                .sectionId(sectionId)
                .size(size)
                .department(departments)
                .build();
    }
}
