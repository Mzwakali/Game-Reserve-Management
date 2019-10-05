package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ClinicNurseRepository extends JpaRepository<ClinicNurse, Integer> {

    //Set<ClinicNurse> getAll();
}
