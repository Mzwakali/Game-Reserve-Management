package ac.za.cput.repository.EmployeeRepository.Imp;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.repository.EmployeeRepository.FieldGuideRepository;

import java.util.HashSet;
import java.util.Set;

public class FieldGuideRepositoryImp implements FieldGuideRepository {
    private static FieldGuideRepositoryImp fieldGuideRepository = null;
    private Set<FieldGuide> guides;

    public FieldGuideRepositoryImp(){
        guides = new HashSet<>();
    }

    public static FieldGuideRepositoryImp getFieldGuideRepository(){
        if (fieldGuideRepository == null){
           return new FieldGuideRepositoryImp();
        }
        return fieldGuideRepository;
    }

    public FieldGuide find(int id){
        return guides.stream().filter(guide -> guide.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public FieldGuide create(FieldGuide guide) {
        guides.add(guide);
        return guide;
    }

    @Override
    public FieldGuide update(FieldGuide guide) {
        FieldGuide guide1 = find(guide.getEmpId());
        if (guides.contains(guide1)){
            guides.remove(guide1);
            guides.add(guide);
        }
        return guide1;
    }

    @Override
    public void delete(Integer id) {
        FieldGuide guide = find(id);
        guides.remove(id);

    }

    @Override
    public FieldGuide read(int id) {
        FieldGuide guide = find(id);
        if (guide == null){
            return null;
        }
        return guide;
    }

    @Override
    public Set<FieldGuide> getAll() {
        return null;
    }

}
