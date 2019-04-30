package ac.za.cput.service.VisitorService.Imp;

import ac.za.cput.service.VisitorService.VisitorService;
import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.repository.VisitorRepository.Imp.VisitorRepositoryImpl;
import ac.za.cput.repository.VisitorRepository.VisitorRepository;

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
