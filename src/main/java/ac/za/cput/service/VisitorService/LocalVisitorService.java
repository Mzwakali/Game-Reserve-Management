package ac.za.cput.service.VisitorService;

import ac.za.cput.domain.Visitor.LocalVisitor;
import ac.za.cput.service.IService;

import java.util.Set;

public interface LocalVisitorService extends IService<LocalVisitor, Integer> {
    Set<LocalVisitor> getAll();
}
