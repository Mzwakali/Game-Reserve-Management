package ac.za.cput.service.GameReserveService;

import ac.za.cput.domain.GameReserve.Equipment;
import ac.za.cput.service.IService;

import java.util.Set;

public interface EquipmentService extends IService<Equipment, Integer> {
    Set<Equipment> getAll();
}
