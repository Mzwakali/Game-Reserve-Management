package ac.za.cput.repository.GameReserveRepository;

import ac.za.cput.domain.GameReserve.Clinic;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface ClinicRepository extends InterfaceRepository<Clinic, Integer> {

    Set<Clinic> getAll();
}
