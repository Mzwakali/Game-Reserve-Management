package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.WildlifeRanger;
//import ac.za.cput.repository.employee.Imp.WildlifeRangerRepositoryImp;
import ac.za.cput.repository.employee.WildlifeRangerRepository;
import ac.za.cput.service.employee.WildlifeRangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WildlifeRangerServiceImp implements WildlifeRangerService {

    private static WildlifeRangerService wildlifeRangerService = null;

    @Autowired
    private WildlifeRangerRepository repository;

    /*WildlifeRangerServiceImp(){
        this.repository = WildlifeRangerRepositoryImp.getRepository();
    }*/

    public static WildlifeRangerService getWildlifeRangerService(){
        if (wildlifeRangerService == null){
            return new WildlifeRangerServiceImp();
        }
        return wildlifeRangerService;
    }

    @Override
    public List<WildlifeRanger> getAll() {
        return this.repository.findAll();
    }

    @Override
    public WildlifeRanger create(WildlifeRanger wildlifeRanger) {
        return this.repository.save(wildlifeRanger);
    }

    @Override
    public WildlifeRanger update(WildlifeRanger wildlifeRanger) {
        return this.repository.save(wildlifeRanger);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public WildlifeRanger read(int id) {
        Optional<WildlifeRanger> optionalWildlifeRanger = this.repository.findById(id);
        return optionalWildlifeRanger.orElse(null);
    }
}
