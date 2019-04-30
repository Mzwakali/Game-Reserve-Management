package ac.za.cput.service.VisitorService;

import ac.za.cput.service.IService;
import ac.za.cput.domain.Visitor.Visitor;

import java.util.Set;

public interface VisitorService extends IService<Visitor, Integer> {
    Set<Visitor> getAll();
}
