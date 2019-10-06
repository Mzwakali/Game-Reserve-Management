package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.repository.gameReserve.ClinicRepository;
//import ac.za.cput.repository.gameReserve.Imp.ClinicRepositoryImp;
import ac.za.cput.service.gameReserve.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicServiceImp implements ClinicService {

    private static ClinicService clinicService = null;

    @Autowired
    private ClinicRepository repository;

   /* ClinicServiceImp(){
        this.repository = ClinicRepositoryImp.getRepository();
    }*/

    public static ClinicService getClinicService(){
        if (clinicService == null){
            clinicService = new ClinicServiceImp();
        }
        return clinicService;
    }

    @Override
    public List<Clinic> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Clinic create(Clinic clinic) {
        return this.repository.save(clinic);
    }

    @Override
    public Clinic update(Clinic clinic) {
        return this.repository.save(clinic);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public Clinic read(int id) {
        Optional<Clinic> optionalClinic = this.repository.findById(id);
        return optionalClinic.orElse(null);
    }
}
