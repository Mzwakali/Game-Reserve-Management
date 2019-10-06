package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.repository.gameReserve.EquipmentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
@Repository("EquipmentInMemory")
public class EquipmentRepositoryImp implements EquipmentRepository {
    private static EquipmentRepositoryImp equipmentRepository = null;
    private Map<Integer, Equipment> equipment;

    public EquipmentRepositoryImp(){
        this.equipment = new HashMap<>();
    }

    public static EquipmentRepositoryImp getEquipmentRepository(){
        if (equipmentRepository == null){
            equipmentRepository = new EquipmentRepositoryImp();
        }
        return equipmentRepository;
    }

    /*public Equipment find(int id){
        return equipment.stream().filter(equip -> equip.getEquipId() == id).findAny().orElse(null);
    }

    @Override
    public Set<Equipment> getAll() {
        return new HashSet<>(equipment.values());
    }

    @Override
    public Equipment create(Equipment equip) {
        this.equipment.put(equip.getEquipId(), equip);
        return equip;
    }

    @Override
    public Equipment update(Equipment equip) {
        /*Equipment equipment1 = find(equip.getEquipId());
        if (equipment.contains(equipment1)){
            equipment.remove(equipment1);
            equipment.add(equip);
        }
        equipment.replace(equip.getEquipId(), equip);
        return equipment.get(equip.getEquipId());
    }

    @Override
    public void delete(Integer id) {
        //Equipment equip = find(id);
        this.equipment.remove(id);
    }

    @Override
    public Equipment read(int id) {
        /*Equipment equip = find(id);
        if (equip == null){
            return null;
        }
        return equipment.get(id);
    }
}*/
