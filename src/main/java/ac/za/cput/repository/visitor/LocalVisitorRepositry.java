package ac.za.cput.repository.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface LocalVisitorRepositry extends InterfaceRepository<LocalVisitor, Integer> {

    Set<LocalVisitor> getAll();
}
