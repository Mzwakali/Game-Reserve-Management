package ac.za.cput.repository.VisitorRepository;

import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface VisitorRepository extends InterfaceRepository<Visitor, Integer> {
    Set<Visitor> getAll();
}
