package ac.za.cput.service.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.ProtectedArea;
//import ac.za.cput.repository.gameReserve.Imp.ProtectedAreaRepositoryImp;
import ac.za.cput.repository.gameReserve.ProtectedAreaRepository;
import ac.za.cput.service.gameReserve.ProtectedAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProtectedAreaServiceImp implements ProtectedAreaService {

    private static ProtectedAreaService protectedAreaService = null;

    @Autowired
    private ProtectedAreaRepository repository;

   /* ProtectedAreaServiceImp(){
        this.repository = ProtectedAreaRepositoryImp.getProtectedAreaRepository();
    }*/

    public static ProtectedAreaService getProtectedAreaService(){
        if (protectedAreaService == null){
            protectedAreaService = new ProtectedAreaServiceImp();
        }
        return protectedAreaService;
    }

    @Override
    public List<ProtectedArea> getAll() {
        return this.repository.findAll();
    }

    @Override
    public ProtectedArea create(ProtectedArea protectedArea) {
        return this.repository.save(protectedArea);
    }

    @Override
    public ProtectedArea update(ProtectedArea protectedArea) {
        return this.repository.save(protectedArea);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);

    }

    @Override
    public ProtectedArea read(int id) {
        Optional<ProtectedArea> optional = this.repository.findById(id);
        return optional.orElse(null);
    }
}
