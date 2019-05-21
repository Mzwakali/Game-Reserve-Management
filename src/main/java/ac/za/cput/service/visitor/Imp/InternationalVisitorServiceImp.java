package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.repository.visitor.Imp.InternationalVisitorRepositoryImp;
import ac.za.cput.repository.visitor.InternationalVisitorRepository;
import ac.za.cput.service.visitor.InternationalVisitorService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class InternationalVisitorServiceImp implements InternationalVisitorService {
    private static InternationalVisitorServiceImp internationalVisitorService = null;
    private InternationalVisitorRepository repository;

    InternationalVisitorServiceImp(){
        this.repository = InternationalVisitorRepositoryImp.getInternationalVisitorRepo();
    }

    public static InternationalVisitorServiceImp getInternationalVisitorService(){
        if (internationalVisitorService == null){
            internationalVisitorService = new InternationalVisitorServiceImp();
        }
        return internationalVisitorService;
    }

    @Override
    public Set<InternationalVisitor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public InternationalVisitor create(InternationalVisitor visitor) {
        return this.repository.create(visitor);
    }

    @Override
    public InternationalVisitor update(InternationalVisitor visitor) {
        return this.repository.update(visitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public InternationalVisitor read(int id) {
        return this.repository.read(id);
    }
}
