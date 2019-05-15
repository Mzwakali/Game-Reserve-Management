package ac.za.cput.repository.visitor;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface InternationalVisitorRepository extends InterfaceRepository<InternationalVisitor, Integer> {

    Set<InternationalVisitor> getAll();
}
