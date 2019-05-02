package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.domain.Employee.ClinicNurse;
import ac.za.cput.repository.EmployeeRepository.ClinicNurseRepository;
import ac.za.cput.repository.EmployeeRepository.Imp.ClinicNurseRepositoryImp;
import ac.za.cput.service.EmployeeService.ClinicNurseService;

import java.util.Set;

public class ClinicNurseServiceImp implements ClinicNurseService {
    private static ClinicNurseServiceImp clinicNurseService = null;
    private ClinicNurseRepository repository;

    private ClinicNurseServiceImp(){
        this.repository = ClinicNurseRepositoryImp.getRepository();
    }

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
