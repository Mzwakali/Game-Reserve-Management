package ac.za.cput.service.visitor;

import ac.za.cput.service.IService;
import ac.za.cput.domain.visitor.Visitor;

import java.util.List;

public interface VisitorService extends IService<Visitor, Integer> {
    List<Visitor> getAll();
}
