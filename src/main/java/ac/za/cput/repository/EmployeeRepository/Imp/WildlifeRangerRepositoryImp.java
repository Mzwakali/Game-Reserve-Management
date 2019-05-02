package ac.za.cput.repository.EmployeeRepository.Imp;

import ac.za.cput.domain.Employee.WildlifeRanger;
import ac.za.cput.repository.EmployeeRepository.WildlifeRangerRepository;

import java.util.Set;

public class WildlifeRangerRepositoryImp implements WildlifeRangerRepository {
    private static WildlifeRangerRepositoryImp wildlifeRangerRepo = null;
    private Set<WildlifeRanger> wildlifeRangers;

    public static WildlifeRangerRepositoryImp getRepository(){
        if (wildlifeRangerRepo == null){
            return new WildlifeRangerRepositoryImp();
        }
        return wildlifeRangerRepo;
    }

    public WildlifeRanger find(int id){
        return wildlifeRangers.stream().filter(wildlifeRanger -> wildlifeRanger.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public Set<WildlifeRanger> getAll() {
        return wildlifeRangers;
    }

    @Override
    public WildlifeRanger create(WildlifeRanger wildlifeRanger) {
        wildlifeRangers.add(wildlifeRanger);
        return wildlifeRanger;
    }

    @Override
    public WildlifeRanger update(WildlifeRanger wildlifeRanger) {
        WildlifeRanger wildlifeRanger1 = find(wildlifeRanger.getEmpId());
        if (wildlifeRangers.contains(wildlifeRanger1)){
            wildlifeRangers.remove(wildlifeRanger1);
            wildlifeRangers.add(wildlifeRanger);
        }
        return wildlifeRanger1;
    }

    @Override
    public void delete(Integer id) {
        WildlifeRanger wildlifeRanger = find(id);
        wildlifeRangers.remove(wildlifeRanger);
    }

    @Override
    public WildlifeRanger read(int id) {
        WildlifeRanger wildlifeRanger = find(id);
        if (wildlifeRanger == null){
            return null;
        }
        return wildlifeRanger;
    }
}
