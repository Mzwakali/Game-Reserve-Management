package ac.za.cput.repository.Implementation;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.repository.EmployeeRepository.ClinicDocRepository;

import java.util.HashSet;
import java.util.Set;

public class ClinicDocRepositoryImp implements ClinicDocRepository {
    private static ClinicDocRepositoryImp clinicDocRepository = null;
    private Set<ClinicDoc> clinicDocs;

    public ClinicDocRepositoryImp() {

        this.clinicDocs = new HashSet<>();
    }

    public static ClinicDocRepositoryImp getRepository(){
        if (clinicDocRepository == null){
            return new ClinicDocRepositoryImp();
        }
        return clinicDocRepository;
    }

    public ClinicDoc find(Integer id){
        return clinicDocs.stream().filter(clinicDoc -> clinicDoc.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public ClinicDoc create(ClinicDoc clinicDoc) {
        clinicDocs.add(clinicDoc);
        return clinicDoc;
    }

    @Override
    public ClinicDoc update(ClinicDoc clinicDoc) {

        ClinicDoc doc = find(clinicDoc.getEmpId());
        if (clinicDocs.contains(doc)){
            clinicDocs.remove(doc);
            clinicDocs.add(clinicDoc);
        }
        return doc;
    }

    @Override
    public void delete(Integer id) {
        ClinicDoc clinicDoc = find(id);
        clinicDocs.remove(clinicDoc);
    }

    @Override
    public ClinicDoc read(int id) {
        ClinicDoc clinicDoc = find(id);
        if (clinicDoc == null){
            return null;
        }
        else {
            return clinicDoc;
        }
    }

    @Override
    public Set<ClinicDoc> getAll() {
        return clinicDocs;
    }
}
