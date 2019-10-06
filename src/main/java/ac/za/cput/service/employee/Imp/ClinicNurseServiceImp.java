package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.repository.employee.ClinicNurseRepository;
//import ac.za.cput.repository.employee.Imp.ClinicNurseRepositoryImp;
import ac.za.cput.service.employee.ClinicNurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicNurseServiceImp implements ClinicNurseService {

    private static ClinicNurseService clinicNurseService = null;

    @Autowired
    private ClinicNurseRepository repository;

    /*ClinicNurseServiceImp(){
        this.repository = ClinicNurseRepositoryImp.getRepository();
    }*/

    public static ClinicNurseService getClinicNurseService(){
        if (clinicNurseService == null){
            clinicNurseService = new ClinicNurseServiceImp();
        }
        return clinicNurseService;
    }

    @Override
    public ClinicNurse create(ClinicNurse clinicNurse) {
        return this.repository.save(clinicNurse);
    }

    @Override
    public ClinicNurse update(ClinicNurse clinicNurse) {
        return this.repository.save(clinicNurse);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public ClinicNurse read(int id) {
        Optional<ClinicNurse> optionalNurse = this.repository.findById(id);
        return optionalNurse.orElse(null);
    }

    @Override
    public List<ClinicNurse> getAll() {
        return this.repository.findAll();
    }
}
