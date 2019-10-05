package ac.za.cput.repository.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SecurityRepository extends JpaRepository<Security, Integer> {

    //Set<Security> getAll();
}
