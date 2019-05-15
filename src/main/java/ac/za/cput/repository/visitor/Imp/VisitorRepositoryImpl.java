package ac.za.cput.repository.visitor.Imp;

import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.repository.visitor.VisitorRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VisitorRepositoryImpl implements VisitorRepository {

    private static VisitorRepositoryImpl  visitorRepo = null;
    private Map<Integer, Visitor> visitors;

    public VisitorRepositoryImpl() {
        this.visitors = new HashMap<>();
    }

    public static VisitorRepositoryImpl getRepository(){
        if(visitorRepo == null) visitorRepo = new VisitorRepositoryImpl();
        return visitorRepo;
    }


    @Override
    public Visitor create(Visitor visitor) {
        this.visitors.put(visitor.getVisitorId(), visitor);
        return visitor;
    }
    /*public visitor find(int id){
        return visitors.stream().filter(visitor -> visitor.getVisitorId() == id).findAny().orElse(null);
    }*/

    @Override
    public Visitor update(Visitor visitor) {
        /*visitor visits = find(visitor.getVisitorId());
        if (visitors.contains(visits)){
            visitors.remove(visits);
            visitors.add(visitor);
        }*/
        visitors.replace(visitor.getVisitorId(), visitor);
        return visitors.get(visitor.getVisitorId());
    }

    @Override
    public void delete(Integer id) {
        //visitor visitor = find(id);
        visitors.remove(id);
    }


    @Override
    public Visitor read(int id) {
        /*visitor visitor = find(id);
        if (visitor == null){
            return null;
        }
        else {
            return visitor;
        }*/
        return visitors.get(id);
    }

    @Override
    public Set<Visitor> getAll() {
        return new HashSet<>(visitors.values());
    }
}
