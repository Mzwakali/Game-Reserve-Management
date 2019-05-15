package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ProtectedAreaRepository extends InterfaceRepository<ProtectedArea, Integer> {

    Set<ProtectedArea> getAll();
}
