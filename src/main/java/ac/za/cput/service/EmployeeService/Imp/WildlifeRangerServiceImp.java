package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.domain.Employee.WildlifeRanger;
import ac.za.cput.repository.EmployeeRepository.Imp.WildlifeRangerRepositoryImp;
import ac.za.cput.repository.EmployeeRepository.WildlifeRangerRepository;
import ac.za.cput.service.EmployeeService.WildlifeRangerService;

import java.util.Set;

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
