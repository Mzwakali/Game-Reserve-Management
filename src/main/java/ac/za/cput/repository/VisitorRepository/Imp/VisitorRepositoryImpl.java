package ac.za.cput.repository.VisitorRepository.Imp;

import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.repository.VisitorRepository.VisitorRepository;

import java.util.HashSet;
import java.util.Set;

public class VisitorRepositoryImpl implements VisitorRepository {

    private static VisitorRepositoryImpl  visitorRepo = null;
    private Set<Visitor> visitors;

    public VisitorRepositoryImpl() {
        this.visitors = new HashSet<>();
    }

    public static VisitorRepositoryImpl getRepository(){
        if(visitorRepo == null) visitorRepo = new VisitorRepositoryImpl();
        return visitorRepo;
    }


    @Override
    public Visitor create(Visitor visitor) {
        this.visitors.add(visitor);
        return visitor;
    }
    public Visitor find(int id){
        return visitors.stream().filter(visitor -> visitor.getVisitorId() == id).findAny().orElse(null);
    }

    @Override
    public Visitor update(Visitor visitor) {
        Visitor visits = find(visitor.getVisitorId());

        if (visitors.contains(visits)){
            visitors.remove(visits);
            visitors.add(visitor);
        }
        return visits;
    }

    @Override
    public void delete(Integer id) {
        Visitor visitor = find(id);
        visitors.remove(visitor);
    }


    @Override
    public Visitor read(int id) {

        Visitor visitor = find(id);
        if (visitor == null){
            return null;
        }
        else {
            return visitor;
        }
    }

    @Override
    public Set<Visitor> getAll() {
        return this.visitors;
    }
}
