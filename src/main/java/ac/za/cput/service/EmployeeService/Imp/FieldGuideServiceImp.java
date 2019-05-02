package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.repository.EmployeeRepository.FieldGuideRepository;
import ac.za.cput.repository.EmployeeRepository.Imp.FieldGuideRepositoryImp;
import ac.za.cput.service.EmployeeService.FieldGuideService;

import java.util.Set;

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
    public Set<FieldGuide> getALl() {
        return this.repository.getAll();
    }

}
