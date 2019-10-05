package ac.za.cput.repository.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ClinicRepository extends JpaRepository<Clinic, Integer> {

    //Set<Clinic> getAll();
}
