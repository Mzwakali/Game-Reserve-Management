package ac.za.cput.service.employee.Imp;

import ac.za.cput.service.employee.CaretakerService;
import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.repository.employee.CaretakerRepository;
//import ac.za.cput.repository.employee.Imp.CaretakerRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaretakerServiceImp implements CaretakerService {

    private static CaretakerService caretakerService = null;

    @Autowired
    private CaretakerRepository repository;

    /*CaretakerServiceImp(){
        this.repository = CaretakerRepositoryImp.getRepository();
    }*/

    public static CaretakerService getService(){
        if(caretakerService == null){
            caretakerService = new CaretakerServiceImp();
        }
        return caretakerService;
    }

    @Override
    public Caretaker create(Caretaker caretaker) {
        return this.repository.save(caretaker);
    }

    @Override
    public Caretaker update(Caretaker caretaker) {
        return this.repository.save(caretaker);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public Caretaker read(int id) {
        Optional<Caretaker> optionalCaretaker = this.repository.findById(id);
        return optionalCaretaker.orElse(null);
    }

    @Override
    public List<Caretaker> getAll() {
        return this.repository.findAll();
    }
}
