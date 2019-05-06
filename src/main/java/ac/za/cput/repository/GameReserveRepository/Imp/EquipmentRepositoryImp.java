package ac.za.cput.repository.GameReserveRepository.Imp;

import ac.za.cput.domain.GameReserve.Equipment;
import ac.za.cput.repository.GameReserveRepository.EquipmentRepository;

import java.util.HashSet;
import java.util.Set;

public class EquipmentRepositoryImp implements EquipmentRepository {
    private static EquipmentRepositoryImp equipmentRepository = null;
    private Set<Equipment> equipment;

    private EquipmentRepositoryImp(){
        this.equipment = new HashSet<>();
    }

    public static EquipmentRepositoryImp getEquipmentRepository(){
        if (equipmentRepository == null){
            equipmentRepository = new EquipmentRepositoryImp();
        }
        return equipmentRepository;
    }

    public Equipment find(int id){
        return equipment.stream().filter(equip -> equip.getEquipId() == id).findAny().orElse(null);
    }

    @Override
    public Set<Equipment> getAll() {
        return equipment;
    }

    @Override
    public Equipment create(Equipment equip) {
        this.equipment.add(equip);
        return equip;
    }

    @Override
    public Equipment update(Equipment equip) {
        Equipment equipment1 = find(equip.getEquipId());
        if (equipment.contains(equipment1)){
            equipment.remove(equipment1);
            equipment.add(equip);
        }
        return equipment1;
    }

    @Override
    public void delete(Integer id) {
        Equipment equip = find(id);
        this.equipment.remove(equip);
    }

    @Override
    public Equipment read(int id) {
        Equipment equip = find(id);
        if (equip == null){
            return null;
        }
        return equip;
    }
}
