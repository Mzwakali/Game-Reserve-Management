package ac.za.cput.service.visitor.Imp;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.repository.visitor.Imp.LocalVisitorRepositoryImp;
import ac.za.cput.repository.visitor.LocalVisitorRepositry;
import ac.za.cput.service.visitor.LocalVisitorService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class LocalVisitorServiceImp implements LocalVisitorService {
    private static LocalVisitorServiceImp localVisitorService = null;
    private LocalVisitorRepositry repository;

    private LocalVisitorServiceImp(){
        this.repository = LocalVisitorRepositoryImp.getLocalVisitorRepository();
    }

    public static LocalVisitorServiceImp getLocalVisitorService(){
        if (localVisitorService == null){
            localVisitorService = new LocalVisitorServiceImp();
        }
        return localVisitorService;
    }

    @Override
    public Set<LocalVisitor> getAll() {
        return this.repository.getAll();
    }

    @Override
    public LocalVisitor create(LocalVisitor localVisitor) {
        return this.repository.create(localVisitor);
    }

    @Override
    public LocalVisitor update(LocalVisitor localVisitor) {
        return this.repository.update(localVisitor);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public LocalVisitor read(int id) {
        return this.repository.read(id);
    }
}
