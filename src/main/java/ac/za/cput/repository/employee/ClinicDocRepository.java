package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ClinicDocRepository extends JpaRepository<ClinicDoc, Integer> {

    //Set<ClinicDoc> getAll();
}
