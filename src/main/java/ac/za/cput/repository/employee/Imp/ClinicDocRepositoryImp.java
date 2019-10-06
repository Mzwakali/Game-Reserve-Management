/*package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.repository.employee.ClinicDocRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("ClinicDocInMemory")
public class ClinicDocRepositoryImp implements ClinicDocRepository {
    private static ClinicDocRepositoryImp clinicDocRepository = null;
    private Map<Integer, ClinicDoc> clinicDocs;

    public ClinicDocRepositoryImp() {

        this.clinicDocs = new HashMap<>();
    }

    public static ClinicDocRepositoryImp getRepository(){
        if (clinicDocRepository == null){
            return new ClinicDocRepositoryImp();
        }
        return clinicDocRepository;
    }

    /*public ClinicDoc find(Integer id){
        return clinicDocs.stream().filter(clinicDoc -> clinicDoc.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public ClinicDoc create(ClinicDoc clinicDoc) {
        clinicDocs.put(clinicDoc.getEmpId(), clinicDoc);
        return clinicDoc;
    }

    @Override
    public ClinicDoc update(ClinicDoc clinicDoc) {

       /* ClinicDoc doc = find(clinicDoc.getEmpId());
        if (clinicDocs.contains(doc)){
            clinicDocs.remove(doc);
            clinicDocs.add(clinicDoc);
        }
       clinicDocs.replace(clinicDoc.getEmpId(), clinicDoc);
        return clinicDocs.get(clinicDoc.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //ClinicDoc clinicDoc = find(id);
        clinicDocs.remove(id);
    }

    @Override
    public ClinicDoc read(int id) {
       /* ClinicDoc clinicDoc = find(id);
        if (clinicDoc == null){
            return null;
        }
        else {
            return clinicDoc;
        }
       return clinicDocs.get(id);
    }

    @Override
    public Set<ClinicDoc> getAll() {
        return new HashSet<>(clinicDocs.values());
    }
}*/
