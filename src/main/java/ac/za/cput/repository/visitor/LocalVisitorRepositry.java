package ac.za.cput.repository.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface LocalVisitorRepositry extends JpaRepository<LocalVisitor, Integer> {

    //Set<LocalVisitor> getAll();
}
