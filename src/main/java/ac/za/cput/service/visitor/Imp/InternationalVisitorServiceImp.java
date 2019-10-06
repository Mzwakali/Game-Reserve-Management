package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.InternationalVisitor;
//import ac.za.cput.repository.visitor.Imp.InternationalVisitorRepositoryImp;
import ac.za.cput.repository.visitor.InternationalVisitorRepository;
import ac.za.cput.service.visitor.InternationalVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternationalVisitorServiceImp implements InternationalVisitorService {

    private static InternationalVisitorService internationalVisitorService = null;

    @Autowired
    private InternationalVisitorRepository repository;

    /*InternationalVisitorServiceImp(){
        this.repository = InternationalVisitorRepositoryImp.getInternationalVisitorRepo();
    }*/

    public static InternationalVisitorService getInternationalVisitorService(){
        if (internationalVisitorService == null){
            internationalVisitorService = new InternationalVisitorServiceImp();
        }
        return internationalVisitorService;
    }

    @Override
    public List<InternationalVisitor> getAll() {
        return this.repository.findAll();
    }

    @Override
    public InternationalVisitor create(InternationalVisitor visitor) {
        return this.repository.save(visitor);
    }

    @Override
    public InternationalVisitor update(InternationalVisitor visitor) {
        return this.repository.save(visitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public InternationalVisitor read(int id) {
        Optional<InternationalVisitor> optionalInternationalVisitor = this.repository.findById(id);
        return optionalInternationalVisitor.orElse(null);
    }
}
