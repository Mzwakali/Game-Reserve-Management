package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface EquipmentRepository extends InterfaceRepository<Equipment, Integer> {

    Set<Equipment> getAll();
}
