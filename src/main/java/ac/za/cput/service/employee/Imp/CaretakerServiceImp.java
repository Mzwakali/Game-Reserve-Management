package ac.za.cput.service.employee.Imp;

import ac.za.cput.service.employee.CaretakerService;
import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.repository.employee.CaretakerRepository;
import ac.za.cput.repository.employee.Imp.CaretakerRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CaretakerServiceImp implements CaretakerService {

    private static CaretakerServiceImp caretakerService = null;
    private CaretakerRepository repository;

    CaretakerServiceImp(){
        this.repository = CaretakerRepositoryImp.getRepository();
    }

    public static CaretakerServiceImp getService(){
        if(caretakerService == null){
            caretakerService = new CaretakerServiceImp();
        }
        return caretakerService;
    }

    @Override
    public Caretaker create(Caretaker caretaker) {
        return this.repository.create(caretaker);
    }

    @Override
    public Caretaker update(Caretaker caretaker) {
        return this.repository.update(caretaker);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public Caretaker read(int id) {
        return this.repository.read(id);
    }

    @Override
    public Set<Caretaker> getAll() {
        return this.repository.getAll();
    }
}
