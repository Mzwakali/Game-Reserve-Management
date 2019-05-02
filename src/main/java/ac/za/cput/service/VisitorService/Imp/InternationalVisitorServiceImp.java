package ac.za.cput.service.VisitorService.Imp;

import ac.za.cput.domain.Visitor.InternationalVisitor;
import ac.za.cput.repository.VisitorRepository.Imp.InternationalVisitorRepositoryImp;
import ac.za.cput.repository.VisitorRepository.InternationalVisitorRepository;
import ac.za.cput.service.VisitorService.InternationalVisitorService;

import java.util.Set;

public class InternationalVisitorServiceImp implements InternationalVisitorService {
    private static InternationalVisitorServiceImp internationalVisitorService = null;
    private InternationalVisitorRepository repository;

    private InternationalVisitorServiceImp(){
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
