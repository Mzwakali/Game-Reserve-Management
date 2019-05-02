package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.domain.Employee.MarineRanger;
import ac.za.cput.repository.EmployeeRepository.Imp.FieldGuideRepositoryImp;
import ac.za.cput.repository.EmployeeRepository.Imp.MarineRangerRepositoryImp;
import ac.za.cput.repository.EmployeeRepository.MarineRangerRepository;
import ac.za.cput.service.EmployeeService.MarineRangerService;

import java.util.Set;

public class MarineRangerServiceImp implements MarineRangerService {
    private static MarineRangerServiceImp marineRangerService = null;
    private MarineRangerRepository repository;

    private MarineRangerServiceImp(){
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
