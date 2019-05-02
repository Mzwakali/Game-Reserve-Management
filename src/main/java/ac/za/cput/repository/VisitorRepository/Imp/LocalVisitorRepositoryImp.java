package ac.za.cput.repository.VisitorRepository.Imp;

import ac.za.cput.domain.Visitor.LocalVisitor;
import ac.za.cput.repository.VisitorRepository.LocalVisitorRepositry;

import java.util.HashSet;
import java.util.Set;

public class LocalVisitorRepositoryImp implements LocalVisitorRepositry {
    private static LocalVisitorRepositoryImp localVisitorRepository = null;
    private Set<LocalVisitor> locals;

    private LocalVisitorRepositoryImp(){
        this.locals = new HashSet<>();
    }

    public static LocalVisitorRepositoryImp getLocalVisitorRepository(){
        if (localVisitorRepository == null){
            localVisitorRepository = new LocalVisitorRepositoryImp();
        }
        return localVisitorRepository;
    }

    @Override
    public Set<LocalVisitor> getAll() {
        return locals;
    }

    public LocalVisitor find(int id){
        return locals.stream().filter(localVisitor -> localVisitor.getVisitorId() == id).findAny().orElse(null);
    }

    @Override
    public LocalVisitor create(LocalVisitor localVisitor) {
        this.locals.add(localVisitor);
        return localVisitor;
    }

    @Override
    public LocalVisitor update(LocalVisitor localVisitor) {
        LocalVisitor localVisitor1 = find(localVisitor.getVisitorId());
        if (locals.contains(localVisitor1)){
            locals.remove(localVisitor1);
            locals.add(localVisitor);
        }
        return localVisitor1;
    }

    @Override
    public void delete(Integer id) {
        LocalVisitor localVisitor = find(id);
        this.locals.remove(localVisitor);
    }

    @Override
    public LocalVisitor read(int id) {
        LocalVisitor localVisitor = find(id);
        if (localVisitor == null){
            return null;
        }
        else {
            return localVisitor;
        }

    }
}
