package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.repository.gameReserve.ClinicRepository;
import ac.za.cput.repository.gameReserve.Imp.ClinicRepositoryImp;
import ac.za.cput.service.gameReserve.ClinicService;

import java.util.Set;

public class ClinicServiceImp implements ClinicService {
    private static ClinicServiceImp clinicService = null;
    private ClinicRepository repository;

    private ClinicServiceImp(){
        this.repository = ClinicRepositoryImp.getRepository();
    }

    public static ClinicServiceImp getClinicService(){
        if (clinicService == null){
            clinicService = new ClinicServiceImp();
        }
        return clinicService;
    }

    @Override
    public Set<Clinic> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Clinic create(Clinic clinic) {
        return this.repository.create(clinic);
    }

    @Override
    public Clinic update(Clinic clinic) {
        return this.repository.update(clinic);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public Clinic read(int id) {
        return this.repository.read(id);
    }
}
