package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.repository.employee.FieldGuideRepository;
//mport ac.za.cput.repository.employee.Imp.FieldGuideRepositoryImp;
import ac.za.cput.service.employee.FieldGuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FieldGuideServiceImp implements FieldGuideService {

    private static FieldGuideService fieldGuideService = null;
    @Autowired
    private FieldGuideRepository repository;

    /*FieldGuideServiceImp(){
        this.repository = FieldGuideRepositoryImp.getFieldGuideRepository();
    }*/

    public static FieldGuideService getFieldGuideService(){
        if (fieldGuideService == null){
            fieldGuideService = new FieldGuideServiceImp();
        }
        return fieldGuideService;
    }

    @Override
    public FieldGuide create(FieldGuide guide) {
        return this.repository.save(guide);
    }

    @Override
    public FieldGuide update(FieldGuide guide) {
        return this.repository.save(guide);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public FieldGuide read(int id) {
        Optional<FieldGuide> optionalGuide = this.repository.findById(id);
        return optionalGuide.orElse(null);
    }

    @Override
    public List<FieldGuide> getAll() {
        return this.repository.findAll();
    }

}
