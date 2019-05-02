package ac.za.cput.repository.VisitorRepository.Imp;

import ac.za.cput.domain.Visitor.InternationalVisitor;
import ac.za.cput.repository.VisitorRepository.InternationalVisitorRepository;

import java.util.HashSet;
import java.util.Set;

public class InternationalVisitorRepositoryImp implements InternationalVisitorRepository {
    private static InternationalVisitorRepositoryImp internationalVisitorRepo = null;
    private Set<InternationalVisitor> internationalVisitors;

    private InternationalVisitorRepositoryImp(){
        this.internationalVisitors = new HashSet<>();
    }

    public static InternationalVisitorRepositoryImp getInternationalVisitorRepo(){
        if (internationalVisitorRepo == null){
            internationalVisitorRepo = new InternationalVisitorRepositoryImp();
        }
        return internationalVisitorRepo;
    }

    @Override
    public Set<InternationalVisitor> getAll() {
        return internationalVisitors;
    }

    public InternationalVisitor find(int id){
        return internationalVisitors.stream().filter(internationalVisitor -> internationalVisitor.getVisitorId() == id).findAny().orElse(null);
    }

    @Override
    public InternationalVisitor create(InternationalVisitor internationalVisitor) {
        this.internationalVisitors.add(internationalVisitor);
        return internationalVisitor;
    }

    @Override
    public InternationalVisitor update(InternationalVisitor internationalVisitor) {
        InternationalVisitor internationalVisitor1 = find(internationalVisitor.getVisitorId());
        if (internationalVisitors.contains(internationalVisitor1)){
            internationalVisitors.remove(internationalVisitor1);
            internationalVisitors.add(internationalVisitor);
        }
        return internationalVisitor1;
    }

    @Override
    public void delete(Integer id) {
        InternationalVisitor internationalVisitor = find(id);
        this.internationalVisitors.remove(internationalVisitor);

    }

    @Override
    public InternationalVisitor read(int id) {
        InternationalVisitor internationalVisitor = find(id);
        if (internationalVisitor == null){
            return null;
        }
        else {
            return internationalVisitor;
        }

    }
}
