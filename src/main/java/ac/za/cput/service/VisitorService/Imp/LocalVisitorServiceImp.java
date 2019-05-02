package ac.za.cput.service.VisitorService.Imp;

import ac.za.cput.domain.Visitor.LocalVisitor;
import ac.za.cput.repository.VisitorRepository.Imp.LocalVisitorRepositoryImp;
import ac.za.cput.repository.VisitorRepository.LocalVisitorRepositry;
import ac.za.cput.service.VisitorService.LocalVisitorService;

import java.util.Set;

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
