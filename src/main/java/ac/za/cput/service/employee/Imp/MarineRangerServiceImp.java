package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.repository.employee.Imp.MarineRangerRepositoryImp;
import ac.za.cput.repository.employee.MarineRangerRepository;
import ac.za.cput.service.employee.MarineRangerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class MarineRangerServiceImp implements MarineRangerService {
    private static MarineRangerServiceImp marineRangerService = null;
    private MarineRangerRepository repository;

    MarineRangerServiceImp(){
        this.repository = MarineRangerRepositoryImp.getMarineRangerRepository();
    }

    public static MarineRangerServiceImp getMarineRangerService(){
        if (marineRangerService == null){
            marineRangerService = new MarineRangerServiceImp();
        }
        return marineRangerService;
    }

    @Override
    public Set<MarineRanger> getAll() {
        return this.repository.getAll();
    }

    @Override
    public MarineRanger create(MarineRanger marineRanger) {
        return this.repository.create(marineRanger);
    }

    @Override
    public MarineRanger update(MarineRanger marineRanger) {
        return this.repository.update(marineRanger);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public MarineRanger read(int id) {
        return this.repository.read(id);
    }
}
