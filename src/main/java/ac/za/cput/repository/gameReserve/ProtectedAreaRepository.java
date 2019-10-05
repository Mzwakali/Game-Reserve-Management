package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ProtectedAreaRepository extends JpaRepository<ProtectedArea, Integer> {

    //Set<ProtectedArea> getAll();
}
