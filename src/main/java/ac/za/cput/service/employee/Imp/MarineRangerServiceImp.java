package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
//import ac.za.cput.repository.employee.Imp.MarineRangerRepositoryImp;
import ac.za.cput.repository.employee.MarineRangerRepository;
import ac.za.cput.service.employee.MarineRangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarineRangerServiceImp implements MarineRangerService {

    private static MarineRangerService marineRangerService = null;

    @Autowired
    private MarineRangerRepository repository;

    /*MarineRangerServiceImp(){
        this.repository = MarineRangerRepositoryImp.getMarineRangerRepository();
    }*/

    public static MarineRangerService getMarineRangerService(){
        if (marineRangerService == null){
            marineRangerService = new MarineRangerServiceImp();
        }
        return marineRangerService;
    }

    @Override
    public List<MarineRanger> getAll() {
        return this.repository.findAll();
    }

    @Override
    public MarineRanger create(MarineRanger marineRanger) {
        return this.repository.save(marineRanger);
    }

    @Override
    public MarineRanger update(MarineRanger marineRanger) {
        return this.repository.save(marineRanger);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public MarineRanger read(int id) {
        Optional<MarineRanger> optionalRanger = this.repository.findById(id);
        return optionalRanger.orElse(null);
    }
}
