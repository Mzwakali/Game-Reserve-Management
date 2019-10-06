package ac.za.cput.service.employee.Imp;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.repository.employee.ClinicDocRepository;
import ac.za.cput.service.employee.ClinicDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClinicDocServiceImp implements ClinicDocService {

    private static ClinicDocService clinicDocService = null;

    @Autowired
    private ClinicDocRepository docRepository;

   /* ClinicDocServiceImp(){
        this.repository = ClinicDocRepositoryImp.getRepository();
    }*/

    public static ClinicDocService getClinicDocService(){
        if (clinicDocService == null){
            clinicDocService = new ClinicDocServiceImp();
        }
        return clinicDocService;
    }
    @Override
    public ClinicDoc create(ClinicDoc clinicDoc) {
        return this.docRepository.save(clinicDoc);
    }

    @Override
    public ClinicDoc update(ClinicDoc clinicDoc) {
        return this.docRepository.save(clinicDoc);
    }

    @Override
    public void delete(Integer id) {
        this.docRepository.deleteById(id);
    }

    @Override
    public ClinicDoc read(int id) {
        Optional<ClinicDoc> optionalDoc = this.docRepository.findById(id);
        return optionalDoc.orElse(null);
    }

    @Override
    public List<ClinicDoc> getAll() {
        return this.docRepository.findAll();
    }
}
