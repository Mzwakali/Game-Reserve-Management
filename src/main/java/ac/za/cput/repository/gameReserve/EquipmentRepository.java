package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

   // Set<Equipment> getAll();
}
