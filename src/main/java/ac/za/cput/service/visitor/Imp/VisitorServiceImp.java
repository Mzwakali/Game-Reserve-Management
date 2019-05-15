package ac.za.cput.service.visitor.Imp;

import ac.za.cput.service.visitor.VisitorService;
import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.repository.visitor.Imp.VisitorRepositoryImpl;
import ac.za.cput.repository.visitor.VisitorRepository;

import java.util.Set;

public class VisitorServiceImp implements VisitorService {
    private static VisitorServiceImp visitorService = null;
    private VisitorRepository repository;

    private VisitorServiceImp(){
        this.repository = VisitorRepositoryImpl.getRepository();
    }

    public static VisitorServiceImp getVisitorService(){
        if (visitorService == null){
            visitorService = new VisitorServiceImp();
        }
        return visitorService;
    }

    @Override
    public Visitor create(Visitor visitor) {
        return this.repository.create(visitor);
    }

    @Override
    public Visitor update(Visitor visitor) {
        return this.repository.update(visitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public Visitor read(int id) {
        return this.repository.read(id);
    }

    @Override
    public Set<Visitor> getAll() {
        return this.repository.getAll();
    }
}
