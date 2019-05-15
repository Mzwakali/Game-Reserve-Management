package ac.za.cput.service.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.service.IService;

import java.util.Set;

public interface LocalVisitorService extends IService<LocalVisitor, Integer> {
    Set<LocalVisitor> getAll();
}
