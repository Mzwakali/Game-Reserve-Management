package ac.za.cput.service.EmployeeService.Imp;

import ac.za.cput.service.EmployeeService.CaretakerService;
import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.repository.EmployeeRepository.CaretakerRepository;
import ac.za.cput.repository.EmployeeRepository.Imp.CaretakerRepositoryImp;

import java.util.Set;

public class CaretakerServiceImp implements CaretakerService {

    private static CaretakerServiceImp caretakerService = null;
    private CaretakerRepository repository;

    private CaretakerServiceImp(){
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
