package ac.za.cput.repository.visitor;

import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
    //Set<Visitor> getAll();
}
