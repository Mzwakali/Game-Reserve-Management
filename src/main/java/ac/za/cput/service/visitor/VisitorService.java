package ac.za.cput.service.visitor;

import ac.za.cput.service.IService;
import ac.za.cput.domain.visitor.Visitor;

import java.util.Set;

public interface VisitorService extends IService<Visitor, Integer> {
    Set<Visitor> getAll();
}
