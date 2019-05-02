package ac.za.cput.repository.VisitorRepository;

import ac.za.cput.domain.Visitor.LocalVisitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface LocalVisitorRepositry extends InterfaceRepository<LocalVisitor, Integer> {

    Set<LocalVisitor> getAll();
}
