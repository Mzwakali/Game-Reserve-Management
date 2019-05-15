package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.repository.employee.ClinicDocRepository;
import ac.za.cput.repository.employee.Imp.ClinicDocRepositoryImp;
import ac.za.cput.service.employee.ClinicDocService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
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
