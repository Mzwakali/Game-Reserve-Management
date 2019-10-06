/*package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.repository.employee.WildlifeRangerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("WildlifeRangerInMemory")
public class WildlifeRangerRepositoryImp implements WildlifeRangerRepository {
    private static WildlifeRangerRepositoryImp wildlifeRangerRepo = null;
    private Map<Integer, WildlifeRanger> wildlifeRangers;

    public static WildlifeRangerRepositoryImp getRepository(){
        if (wildlifeRangerRepo == null){
            return new WildlifeRangerRepositoryImp();
        }
        return wildlifeRangerRepo;
    }

    public WildlifeRangerRepositoryImp(){
        this.wildlifeRangers = new HashMap<>();
    }

    /*public WildlifeRanger find(int id){
        return wildlifeRangers.stream().filter(wildlifeRanger -> wildlifeRanger.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public Set<WildlifeRanger> getAll() {
        return new HashSet<>(wildlifeRangers.values());
    }

    @Override
    public WildlifeRanger create(WildlifeRanger wildlifeRanger) {
        wildlifeRangers.put(wildlifeRanger.getEmpId(), wildlifeRanger);
        return wildlifeRanger;
    }

    @Override
    public WildlifeRanger update(WildlifeRanger wildlifeRanger) {
        /*WildlifeRanger wildlifeRanger1 = find(wildlifeRanger.getEmpId());
        if (wildlifeRangers.contains(wildlifeRanger1)){
            wildlifeRangers.remove(wildlifeRanger1);
            wildlifeRangers.add(wildlifeRanger);
        }
        wildlifeRangers.replace(wildlifeRanger.getEmpId(), wildlifeRanger);
        return wildlifeRangers.get(wildlifeRanger.getEmpId());
    }

    @Override
    public void delete(Integer id) {
       // WildlifeRanger wildlifeRanger = find(id);
        wildlifeRangers.remove(id);
    }

    @Override
    public WildlifeRanger read(int id) {
        /*WildlifeRanger wildlifeRanger = find(id);
        if (wildlifeRanger == null){
            return null;
        }
        return wildlifeRangers.get(id);
    }
}*/
