package ac.za.cput.repository.GameReserveRepository;

import ac.za.cput.domain.GameReserve.ProtectedArea;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ProtectedAreaRepository extends InterfaceRepository<ProtectedArea, Integer> {

    Set<ProtectedArea> getAll();
}
