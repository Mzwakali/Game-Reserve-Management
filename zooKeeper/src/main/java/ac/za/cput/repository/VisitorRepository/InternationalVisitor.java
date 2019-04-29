package ac.za.cput.repository.VisitorRepository;

import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface InternationalVisitor extends InterfaceRepository<InternationalVisitor, String> {

    Set<InternationalVisitor> getAll();
}
