package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicRepository extends InterfaceRepository<Clinic, Integer> {

    Set<Clinic> getAll();
}
