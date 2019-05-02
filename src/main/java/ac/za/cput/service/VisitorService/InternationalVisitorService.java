package ac.za.cput.service.VisitorService;

import ac.za.cput.domain.Visitor.InternationalVisitor;
import ac.za.cput.service.IService;

import java.util.Set;

public interface InternationalVisitorService extends IService<InternationalVisitor, Integer> {
    Set<InternationalVisitor> getAll();
}
