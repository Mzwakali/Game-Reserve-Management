package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.Caretaker;
import ac.za.cput.repository.employee.CaretakerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("CaretakerInMemory")
public class CaretakerRepositoryImp implements CaretakerRepository {

    private static CaretakerRepositoryImp caretakerRepo = null;
    private Map<Integer, Caretaker> caretakers;

    public CaretakerRepositoryImp() {
        this.caretakers = new HashMap<>();
    }

    public static CaretakerRepository getRepository(){
        if(caretakerRepo == null) caretakerRepo = new CaretakerRepositoryImp();
        return caretakerRepo;
    }

    /*public Caretaker find(int id){
        return caretakers.stream().filter(caretaker -> caretaker.getEmpId() == id).findAny().orElse(null);
    }*/

    @Override
    public Caretaker create(Caretaker caretaker) {
        this.caretakers.put(caretaker.getEmpId(), caretaker);
        return caretaker;
    }

    @Override
    public Caretaker read(int id) {
        return caretakers.get(id);
    }

    @Override
    public Caretaker update(Caretaker caretaker) {

       /* Caretaker caretaker1 = find(caretaker.getEmpId());
        if (caretakers.contains(caretaker1)){
            caretakers.remove(caretaker1);
            caretakers.add(caretaker);
        }*/
       caretakers.replace(caretaker.getEmpId(), caretaker);
        return caretakers.get(caretaker.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //Caretaker caretaker = find(id);
        caretakers.remove(id);
    }


    @Override
    public Set<Caretaker> getAll() {
        return new HashSet<>(caretakers.values());
    }

}
