package ac.za.cput.service.visitor.Imp;

import ac.za.cput.service.visitor.VisitorService;
import ac.za.cput.domain.visitor.Visitor;
//import ac.za.cput.repository.visitor.Imp.VisitorRepositoryImpl;
import ac.za.cput.repository.visitor.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitorServiceImp implements VisitorService {

    private static VisitorService visitorService = null;

    @Autowired
    private VisitorRepository repository;

   /* VisitorServiceImp(){
        this.repository = VisitorRepositoryImpl.getRepository();
    }*/

    public static VisitorService getVisitorService(){
        if (visitorService == null){
            visitorService = new VisitorServiceImp();
        }
        return visitorService;
    }

    @Override
    public Visitor create(Visitor visitor) {
        return this.repository.save(visitor);
    }

    @Override
    public Visitor update(Visitor visitor) {
        return this.repository.save(visitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public Visitor read(int id) {
        Optional<Visitor> optionalVisitor = this.repository.findById(id);
        return optionalVisitor.orElse(null);
    }

    @Override
    public List<Visitor> getAll() {
        return this.repository.findAll();
    }
}
