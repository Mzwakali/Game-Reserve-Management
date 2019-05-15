package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.repository.employee.Imp.WildlifeRangerRepositoryImp;
import ac.za.cput.repository.employee.WildlifeRangerRepository;
import ac.za.cput.service.employee.WildlifeRangerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class WildlifeRangerServiceImp implements WildlifeRangerService {
    private static WildlifeRangerServiceImp wildlifeRangerService = null;
    private WildlifeRangerRepository repository;

    private WildlifeRangerServiceImp(){
        this.repository = WildlifeRangerRepositoryImp.getRepository();
    }

    public static WildlifeRangerServiceImp getWildlifeRangerService(){
        if (wildlifeRangerService == null){
            return new WildlifeRangerServiceImp();
        }
        return wildlifeRangerService;
    }

    @Override
    public Set<WildlifeRanger> getAll() {
        return this.repository.getAll();
    }

    @Override
    public WildlifeRanger create(WildlifeRanger wildlifeRanger) {
        return this.repository.create(wildlifeRanger);
    }

    @Override
    public WildlifeRanger update(WildlifeRanger wildlifeRanger) {
        return this.repository.update(wildlifeRanger);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public WildlifeRanger read(int id) {
        return this.repository.read(id);
    }
}
