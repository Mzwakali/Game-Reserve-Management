package ac.za.cput.repository.visitor.Imp;

import ac.za.cput.domain.visitor.InternationalVisitor;
import ac.za.cput.repository.visitor.InternationalVisitorRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InternationalVisitorRepositoryImp implements InternationalVisitorRepository {
    private static InternationalVisitorRepositoryImp internationalVisitorRepo = null;
    private Map<Integer, InternationalVisitor> internationalVisitors;

    private InternationalVisitorRepositoryImp(){
        this.internationalVisitors = new HashMap<>();
    }

    public static InternationalVisitorRepositoryImp getInternationalVisitorRepo(){
        if (internationalVisitorRepo == null){
            internationalVisitorRepo = new InternationalVisitorRepositoryImp();
        }
        return internationalVisitorRepo;
    }

    @Override
    public Set<InternationalVisitor> getAll() {
        return new HashSet<>(internationalVisitors.values());
    }

    /*public InternationalVisitor find(int id){
        return internationalVisitors.stream().filter(internationalVisitor -> internationalVisitor.getVisitorId() == id).findAny().orElse(null);
    }*/

    @Override
    public InternationalVisitor create(InternationalVisitor internationalVisitor) {
        this.internationalVisitors.put(internationalVisitor.getVisitorId(), internationalVisitor);
        return internationalVisitor;
    }

    @Override
    public InternationalVisitor update(InternationalVisitor internationalVisitor) {
        /*InternationalVisitor internationalVisitor1 = find(internationalVisitor.getVisitorId());
        if (internationalVisitors.contains(internationalVisitor1)){
            internationalVisitors.remove(internationalVisitor1);
            internationalVisitors.add(internationalVisitor);
        }*/
        internationalVisitors.replace(internationalVisitor.getVisitorId(), internationalVisitor);
        return internationalVisitors.get(internationalVisitor.getVisitorId());
    }

    @Override
    public void delete(Integer id) {
        //InternationalVisitor internationalVisitor = find(id);
        this.internationalVisitors.remove(id);

    }

    @Override
    public InternationalVisitor read(int id) {
        /*InternationalVisitor internationalVisitor = find(id);
        if (internationalVisitor == null){
            return null;
        }
        else {
            return internationalVisitor;
        }*/
        return internationalVisitors.get(id);

    }
}
