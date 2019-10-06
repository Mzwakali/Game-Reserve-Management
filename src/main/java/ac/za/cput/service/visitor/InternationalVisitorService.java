package ac.za.cput.service.visitor;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.service.IService;

import java.util.List;

public interface InternationalVisitorService extends IService<InternationalVisitor, Integer> {
    List<InternationalVisitor> getAll();
}
