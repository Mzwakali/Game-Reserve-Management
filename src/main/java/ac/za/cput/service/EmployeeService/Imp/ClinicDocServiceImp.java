package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.repository.EmployeeRepository.ClinicDocRepository;
import ac.za.cput.repository.EmployeeRepository.Imp.ClinicDocRepositoryImp;
import ac.za.cput.service.EmployeeService.ClinicDocService;

import java.util.Set;

public class ClinicDocServiceImp implements ClinicDocService {
    private static ClinicDocServiceImp clinicDocService = null;
    private ClinicDocRepository repository;

    private ClinicDocServiceImp(){
        this.repository = ClinicDocRepositoryImp.getRepository();
    }

    public static ClinicDocServiceImp getClinicDocService(){
        if (clinicDocService == null){
            clinicDocService = new ClinicDocServiceImp();
        }
        return clinicDocService;
    }
    @Override
    public ClinicDoc create(ClinicDoc clinicDoc) {
        return this.repository.create(clinicDoc);
    }

    @Override
    public ClinicDoc update(ClinicDoc clinicDoc) {
        return this.repository.update(clinicDoc);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public ClinicDoc read(int id) {
        return this.repository.read(id);
    }

    @Override
    public Set<ClinicDoc> getAll() {
        return this.repository.getAll();
    }
}
