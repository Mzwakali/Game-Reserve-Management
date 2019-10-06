package ac.za.cput.repository.visitor.Imp;

import ac.za.cput.domain.visitor.LocalVisitor;
import ac.za.cput.repository.visitor.LocalVisitorRepositry;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
@Repository("LocalVisitorInMemory")
public class LocalVisitorRepositoryImp implements LocalVisitorRepositry {
    private static LocalVisitorRepositoryImp localVisitorRepository = null;
    private Map<Integer, LocalVisitor> locals;

    public LocalVisitorRepositoryImp(){
        this.locals = new HashMap<>();
    }

    public static LocalVisitorRepositoryImp getLocalVisitorRepository(){
        if (localVisitorRepository == null){
            localVisitorRepository = new LocalVisitorRepositoryImp();
        }
        return localVisitorRepository;
    }

    @Override
    public Set<LocalVisitor> getAll() {
        return new HashSet<>(locals.values());
    }

   /* public LocalVisitor find(int id){
        return locals.stream().filter(localVisitor -> localVisitor.getVisitorId() == id).findAny().orElse(null);
    }

    @Override
    public LocalVisitor create(LocalVisitor localVisitor) {
        this.locals.put(localVisitor.getVisitorId(), localVisitor);
        return localVisitor;
    }

    @Override
    public LocalVisitor update(LocalVisitor localVisitor) {
        /*LocalVisitor localVisitor1 = find(localVisitor.getVisitorId());
        if (locals.contains(localVisitor1)){
            locals.remove(localVisitor1);
            locals.add(localVisitor);
        }
        locals.replace(localVisitor.getVisitorId(), localVisitor);
        return locals.get(localVisitor.getVisitorId());
    }

    @Override
    public void delete(Integer id) {
        //LocalVisitor localVisitor = find(id);
        this.locals.remove(id);
    }

    @Override
    public LocalVisitor read(int id) {
        /*LocalVisitor localVisitor = find(id);
        if (localVisitor == null){
            return null;
        }
        else {
            return localVisitor;
        }
        return locals.get(id);

    }
}*/
