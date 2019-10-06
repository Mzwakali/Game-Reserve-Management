package ac.za.cput.service.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.service.IService;

import java.util.List;

public interface LocalVisitorService extends IService<LocalVisitor, Integer> {
    List<LocalVisitor> getAll();
}
