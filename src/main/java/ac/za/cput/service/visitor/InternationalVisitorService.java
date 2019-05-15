package ac.za.cput.service.visitor;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.service.IService;

import java.util.Set;

public interface InternationalVisitorService extends IService<InternationalVisitor, Integer> {
    Set<InternationalVisitor> getAll();
}
