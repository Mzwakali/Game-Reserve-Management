package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.LocalVisitor;
//import ac.za.cput.repository.visitor.Imp.LocalVisitorRepositoryImp;
import ac.za.cput.repository.visitor.LocalVisitorRepositry;
import ac.za.cput.service.visitor.LocalVisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalVisitorServiceImp implements LocalVisitorService {

    private static LocalVisitorService localVisitorService = null;

    @Autowired
    private LocalVisitorRepositry repository;

   /* protected LocalVisitorServiceImp(){
        this.repository = LocalVisitorRepositoryImp.getLocalVisitorRepository();
    }*/

    public static LocalVisitorService getLocalVisitorService(){
        if (localVisitorService == null){
            localVisitorService = new LocalVisitorServiceImp();
        }
        return localVisitorService;
    }

    @Override
    public List<LocalVisitor> getAll() {
        return this.repository.findAll();
    }

    @Override
    public LocalVisitor create(LocalVisitor localVisitor) {
        return this.repository.save(localVisitor);
    }

    @Override
    public LocalVisitor update(LocalVisitor localVisitor) {
        return this.repository.save(localVisitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public LocalVisitor read(int id) {
        Optional<LocalVisitor> optionalLocalVisitor = this.repository.findById(id);
        return optionalLocalVisitor.orElse(null);
    }
}
