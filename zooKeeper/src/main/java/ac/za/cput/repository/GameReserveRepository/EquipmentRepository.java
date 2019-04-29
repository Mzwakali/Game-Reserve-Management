package ac.za.cput.repository.GameReserveRepository;

import ac.za.cput.domain.GameReserve.Equipment;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface EquipmentRepository extends InterfaceRepository<Equipment, String> {

    Set<Equipment> getAll();
}
