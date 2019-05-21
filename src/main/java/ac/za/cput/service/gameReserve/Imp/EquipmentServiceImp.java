package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.repository.gameReserve.EquipmentRepository;
import ac.za.cput.repository.gameReserve.Imp.EquipmentRepositoryImp;
import ac.za.cput.service.gameReserve.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EquipmentServiceImp implements EquipmentService {
    private static EquipmentServiceImp equipmentService = null;
    private EquipmentRepository repository;

    EquipmentServiceImp(){
        this.repository = EquipmentRepositoryImp.getEquipmentRepository();
    }

    @Override
    public Set<Equipment> getAll() {
        return null;
    }

    @Override
    public Equipment create(Equipment equipment) {
        return this.repository.create(equipment);
    }

    @Override
    public Equipment update(Equipment equipment) {
        return this.repository.update(equipment);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public Equipment read(int id) {
        return this.repository.read(id);
    }
}
