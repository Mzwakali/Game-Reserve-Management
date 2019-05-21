package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.gameReserve.Equipment;

import java.util.List;

public class EquipmentFactory {

    public static Equipment getEquipment(int equipId, String description, int quantity, List<Department> departments){
        return new Equipment.EquipmentBuilder()
                .equipId(equipId)
                .description(description)
                .quantity(quantity)
                .department(departments)
                .build();
    }
}
