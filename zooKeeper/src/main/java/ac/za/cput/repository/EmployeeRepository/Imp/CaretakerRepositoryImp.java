package ac.za.cput.repository.EmployeeRepository.Imp;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.repository.EmployeeRepository.CaretakerRepository;

import java.util.HashSet;
import java.util.Set;

public class CaretakerRepositoryImp implements CaretakerRepository {

    private static CaretakerRepositoryImp caretakerRepo = null;
    private Set<Caretaker> caretakers;

    public CaretakerRepositoryImp() {
        this.caretakers = new HashSet<>();
    }

    public static CaretakerRepository getRepository(){
        if(caretakerRepo == null) caretakerRepo = new CaretakerRepositoryImp();
        return caretakerRepo;
    }

    public Caretaker find(int id){
        return caretakers.stream().filter(caretaker -> caretaker.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public Caretaker create(Caretaker caretaker) {
        this.caretakers.add(caretaker);
        return caretaker;
    }

    @Override
    public Caretaker read(int id) {
        Caretaker caretaker = find(id);

        if (caretaker == null){
            return null;
        }
        else {
            return caretaker;
        }
    }

    @Override
    public Caretaker update(Caretaker caretaker) {

        Caretaker caretaker1 = find(caretaker.getEmpId());
        if (caretakers.contains(caretaker1)){
            caretakers.remove(caretaker1);
            caretakers.add(caretaker);
        }
        return caretaker1;
    }

    @Override
    public void delete(Integer id) {
        Caretaker caretaker = find(id);
        caretakers.remove(caretaker);
    }


    @Override
    public Set<Caretaker> getAll() {
        return this.caretakers;
    }

}
