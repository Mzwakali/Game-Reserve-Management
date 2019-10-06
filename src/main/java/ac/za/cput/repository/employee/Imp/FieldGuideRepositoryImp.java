/*package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.repository.employee.FieldGuideRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("FieldGuideInMemory")
public class FieldGuideRepositoryImp implements FieldGuideRepository {
    private static FieldGuideRepositoryImp fieldGuideRepository = null;
    private Map<Integer, FieldGuide> guides;

    public FieldGuideRepositoryImp(){
        guides = new HashMap<>();
    }

    public static FieldGuideRepositoryImp getFieldGuideRepository(){
        if (fieldGuideRepository == null){
           return new FieldGuideRepositoryImp();
        }
        return fieldGuideRepository;
    }

    /*public FieldGuide find(int id){
        return guides.stream().filter(guide -> guide.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public FieldGuide create(FieldGuide guide) {
        guides.put(guide.getEmpId(), guide);
        return guide;
    }

    @Override
    public FieldGuide update(FieldGuide guide) {
       /* FieldGuide guide1 = find(guide.getEmpId());
        if (guides.contains(guide1)){
            guides.remove(guide1);
            guides.add(guide);
        }
       guides.replace(guide.getEmpId(), guide);
        return guides.get(guide.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //FieldGuide guide = find(id);
        guides.remove(id);

    }

    @Override
    public FieldGuide read(int id) {
        /*FieldGuide guide = find(id);
        if (guide == null){
            return null;
        }
        return guides.get(id);
    }

    @Override
    public Set<FieldGuide> getAll() {
        return new HashSet<>(guides.values());
    }

}*/
