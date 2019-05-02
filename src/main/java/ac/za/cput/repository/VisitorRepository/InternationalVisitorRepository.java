package ac.za.cput.repository.VisitorRepository;

import ac.za.cput.domain.Visitor.InternationalVisitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface InternationalVisitorRepository extends InterfaceRepository<InternationalVisitor, Integer> {

    Set<InternationalVisitor> getAll();
}
