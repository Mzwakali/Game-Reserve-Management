package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.repository.gameReserve.ProtectedAreaRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProtectedAreaRepositoryImp implements ProtectedAreaRepository {
    private static ProtectedAreaRepositoryImp protectedAreaRepository = null;
    private Map<Integer, ProtectedArea> protectedAreas;

    private ProtectedAreaRepositoryImp(){
        this.protectedAreas = new HashMap<>();
    }

    public static ProtectedAreaRepositoryImp getProtectedAreaRepository(){
        if (protectedAreaRepository == null){
            protectedAreaRepository = new ProtectedAreaRepositoryImp();
        }
        return protectedAreaRepository;
    }

   /* public ProtectedArea find(int id){
        return protectedAreas.stream().filter(protectedArea -> protectedArea.getAreaId() == id).findAny().orElse(null);
    }*/

    @Override
    public Set<ProtectedArea> getAll() {
        return new HashSet<>(protectedAreas.values());
    }

    @Override
    public ProtectedArea create(ProtectedArea protectedArea) {
        this.protectedAreas.put(protectedArea.getAreaId(), protectedArea);
        return protectedArea;
    }

    @Override
    public ProtectedArea update(ProtectedArea protectedArea) {
       /* ProtectedArea protectedArea1 = find(protectedArea.getAreaId());
        if (protectedAreas.contains(protectedArea1)){
            protectedAreas.remove(protectedArea1);
            protectedAreas.add(protectedArea);
        }*/
       protectedAreas.replace(protectedArea.getAreaId(), protectedArea);
        return protectedAreas.get(protectedArea.getAreaId());
    }

    @Override
    public void delete(Integer id) {
        //ProtectedArea protectedArea = find(id);
        this.protectedAreas.remove(id);

    }

    @Override
    public ProtectedArea read(int id) {
        /*ProtectedArea protectedArea = find(id);
        if (protectedArea == null){
            return null;
        }*/
        return protectedAreas.get(id);
    }
}
