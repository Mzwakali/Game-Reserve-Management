package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.repository.gameReserve.Imp.ProtectedAreaRepositoryImp;
import ac.za.cput.repository.gameReserve.ProtectedAreaRepository;
import ac.za.cput.service.gameReserve.ProtectedAreaService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProtectedAreaServiceImp implements ProtectedAreaService {
    private static ProtectedAreaServiceImp protectedAreaService = null;
    private ProtectedAreaRepository repository;

    ProtectedAreaServiceImp(){
        this.repository = ProtectedAreaRepositoryImp.getProtectedAreaRepository();
    }

    public static ProtectedAreaServiceImp getProtectedAreaService(){
        if (protectedAreaService == null){
            protectedAreaService = new ProtectedAreaServiceImp();
        }
        return protectedAreaService;
    }

    @Override
    public Set<ProtectedArea> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ProtectedArea create(ProtectedArea protectedArea) {
        return this.repository.create(protectedArea);
    }

    @Override
    public ProtectedArea update(ProtectedArea protectedArea) {
        return this.repository.update(protectedArea);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);

    }

    @Override
    public ProtectedArea read(int id) {
        return this.repository.read(id);
    }
}
