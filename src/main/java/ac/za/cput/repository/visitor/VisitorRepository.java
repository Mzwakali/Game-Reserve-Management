package ac.za.cput.repository.visitor;

import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface VisitorRepository extends InterfaceRepository<Visitor, Integer> {
    Set<Visitor> getAll();
}
