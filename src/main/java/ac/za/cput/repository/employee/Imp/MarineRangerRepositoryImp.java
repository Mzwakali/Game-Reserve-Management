package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.repository.employee.MarineRangerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class MarineRangerRepositoryImp implements MarineRangerRepository {

    private static MarineRangerRepositoryImp marineRangerRepo = null;
    private Map<Integer, MarineRanger> marineRangers;

    public MarineRangerRepositoryImp(){
        marineRangers = new HashMap<>();
    }

    public static MarineRangerRepositoryImp getMarineRangerRepository(){
        if (marineRangerRepo == null){
            return new MarineRangerRepositoryImp();
        }
        return marineRangerRepo;
    }

    /*public MarineRanger find(int id){
        return marineRangers.stream().filter(marineRanger -> marineRanger.getEmpId() == id).findAny().orElse(null);
    }*/

    @Override
    public Set<MarineRanger> getAll() {
        return new HashSet<>(marineRangers.values());
    }

    @Override
    public MarineRanger create(MarineRanger marineRanger) {
        marineRangers.put(marineRanger.getEmpId(), marineRanger);
        return marineRanger;
    }

    @Override
    public MarineRanger update(MarineRanger marineRanger) {
        /*MarineRanger marineRanger1 = find(marineRanger.getEmpId());
        if (marineRangers.contains(marineRanger)){
            marineRangers.remove(marineRanger);
            marineRangers.add(marineRanger);
        }*/
        marineRangers.replace(marineRanger.getEmpId(), marineRanger);
        return marineRangers.get(marineRanger.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //MarineRanger marineRanger = find(id);
        marineRangers.remove(id);

    }

    @Override
    public MarineRanger read(int id) {
       /* MarineRanger marineRanger = find(id);
        if (marineRanger == null){
            return null;
        }*/
        return marineRangers.get(id);
    }
}
