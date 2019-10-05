package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.repository.employee.ClinicNurseRepository;
//import ac.za.cput.repository.employee.Imp.ClinicNurseRepositoryImp;
import ac.za.cput.service.employee.ClinicNurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ClinicNurseServiceImp implements ClinicNurseService {
    private static ClinicNurseServiceImp clinicNurseService = null;

    @Autowired
    private ClinicNurseRepository repository;

    /*ClinicNurseServiceImp(){
        this.repository = ClinicNurseRepositoryImp.getRepository();
    }*/

    public static ClinicNurseServiceImp getClinicNurseService(){
        if (clinicNurseService == null){
            clinicNurseService = new ClinicNurseServiceImp();
        }
        return clinicNurseService;
    }

    @Override
    public ClinicNurse create(ClinicNurse clinicNurse) {
        return this.repository.create(clinicNurse);
    }

    @Override
    public ClinicNurse update(ClinicNurse clinicNurse) {
        return this.repository.update(clinicNurse);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public ClinicNurse read(int id) {
        return this.repository.read(id);
    }

    @Override
    public Set<ClinicNurse> getAll() {
        return this.repository.getAll();
    }
}
