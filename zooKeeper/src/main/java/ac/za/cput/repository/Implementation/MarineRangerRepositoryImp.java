package ac.za.cput.repository.Implementation;

import ac.za.cput.domain.Employee.MarineRanger;
import ac.za.cput.repository.EmployeeRepository.MarineRangerRepository;

import java.util.HashSet;
import java.util.Set;

public class MarineRangerRepositoryImp implements MarineRangerRepository {

    private static MarineRangerRepositoryImp marineRangerRepo = null;
    private Set<MarineRanger> marineRangers;

    public MarineRangerRepositoryImp(){
        marineRangers = new HashSet<>();
    }

    public static MarineRangerRepositoryImp getMarineRangerRepository(){
        if (marineRangerRepo == null){
            return new MarineRangerRepositoryImp();
        }
        return marineRangerRepo;
    }

    public MarineRanger find(int id){
        return marineRangers.stream().filter(marineRanger -> marineRanger.getEmpId() == id).findAny().orElse(null);

    }

    @Override
    public Set<MarineRanger> getAll() {
        return marineRangers;
    }

    @Override
    public MarineRanger create(MarineRanger marineRanger) {
        marineRangers.add(marineRanger);
        return marineRanger;
    }

    @Override
    public MarineRanger update(MarineRanger marineRanger) {
        MarineRanger marineRanger1 = find(marineRanger.getEmpId());
        if (marineRangers.contains(marineRanger)){
            marineRangers.remove(marineRanger);
            marineRangers.add(marineRanger);
        }
        return marineRanger;
    }

    @Override
    public void delete(Integer id) {
        MarineRanger marineRanger = find(id);
        marineRangers.remove(marineRanger);

    }

    @Override
    public MarineRanger read(int id) {
        MarineRanger marineRanger = find(id);
        if (marineRanger == null){
            return null;
        }
        return marineRanger;
    }
}
