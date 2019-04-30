package ac.za.cput.Service.VisitorService;

import ac.za.cput.Service.IService;
import ac.za.cput.domain.Visitor.Visitor;

import java.util.Set;

public interface VisitorService extends IService<Visitor, Integer> {
    Set<Visitor> getAll();
}
