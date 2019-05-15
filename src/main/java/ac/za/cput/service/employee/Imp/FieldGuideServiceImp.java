package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.repository.employee.FieldGuideRepository;
import ac.za.cput.repository.employee.Imp.FieldGuideRepositoryImp;
import ac.za.cput.service.employee.FieldGuideService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class FieldGuideServiceImp implements FieldGuideService {
    private static FieldGuideServiceImp fieldGuideService = null;
    private FieldGuideRepository repository;

    private FieldGuideServiceImp(){
        this.repository = FieldGuideRepositoryImp.getFieldGuideRepository();
    }

    public static FieldGuideServiceImp getFieldGuideService(){
        if (fieldGuideService == null){
            fieldGuideService = new FieldGuideServiceImp();
        }
        return fieldGuideService;
    }

    @Override
    public FieldGuide create(FieldGuide guide) {
        return this.repository.create(guide);
    }

    @Override
    public FieldGuide update(FieldGuide guide) {
        return this.repository.update(guide);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public FieldGuide read(int id) {
        return this.repository.read(id);
    }

    @Override
    public Set<FieldGuide> getAll() {
        return this.repository.getAll();
    }

}
