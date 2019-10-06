package ac.za.cput.service.gameReserve;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.service.IService;

import java.util.List;

public interface EquipmentService extends IService<Equipment, Integer> {
    List<Equipment> getAll();
}
