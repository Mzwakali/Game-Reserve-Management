package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.repository.gameReserve.EquipmentRepository;
//import ac.za.cput.repository.gameReserve.Imp.EquipmentRepositoryImp;
import ac.za.cput.service.gameReserve.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentServiceImp implements EquipmentService {

    private static EquipmentService equipmentService = null;

    @Autowired
    private EquipmentRepository repository;

    /*EquipmentServiceImp(){
        this.repository = EquipmentRepositoryImp.getEquipmentRepository();
    }*/

    @Override
    public List<Equipment> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Equipment create(Equipment equipment) {
        return this.repository.save(equipment);
    }

    @Override
    public Equipment update(Equipment equipment) {
        return this.repository.save(equipment);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public Equipment read(int id) {
        Optional<Equipment> optionalEquipment = this.repository.findById(id);
        return optionalEquipment.orElse(null);
    }
}
