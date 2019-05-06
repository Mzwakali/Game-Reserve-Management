package ac.za.cput.repository.GameReserveRepository.Imp;

import ac.za.cput.domain.GameReserve.ProtectedArea;
import ac.za.cput.repository.GameReserveRepository.ProtectedAreaRepository;

import java.util.HashSet;
import java.util.Set;

public class ProtectedAreaRepositoryImp implements ProtectedAreaRepository {
    private static ProtectedAreaRepositoryImp protectedAreaRepository = null;
    private Set<ProtectedArea> protectedAreas;

    private ProtectedAreaRepositoryImp(){
        this.protectedAreas = new HashSet<>();
    }

    public static ProtectedAreaRepositoryImp getProtectedAreaRepository(){
        if (protectedAreaRepository == null){
            protectedAreaRepository = new ProtectedAreaRepositoryImp();
        }
        return protectedAreaRepository;
    }

    public ProtectedArea find(int id){
        return protectedAreas.stream().filter(protectedArea -> protectedArea.getAreaId() == id).findAny().orElse(null);
    }

    @Override
    public Set<ProtectedArea> getAll() {
        return protectedAreas;
    }

    @Override
    public ProtectedArea create(ProtectedArea protectedArea) {
        this.protectedAreas.add(protectedArea);
        return protectedArea;
    }

    @Override
    public ProtectedArea update(ProtectedArea protectedArea) {
        ProtectedArea protectedArea1 = find(protectedArea.getAreaId());
        if (protectedAreas.contains(protectedArea1)){
            protectedAreas.remove(protectedArea1);
            protectedAreas.add(protectedArea);
        }
        return protectedArea1;
    }

    @Override
    public void delete(Integer id) {
        ProtectedArea protectedArea = find(id);
        this.protectedAreas.remove(protectedArea);

    }

    @Override
    public ProtectedArea read(int id) {
        ProtectedArea protectedArea = find(id);
        if (protectedArea == null){
            return null;
        }
        return protectedArea;
    }
}
