package ac.za.cput.repository.GameReserveRepository.Imp;

import ac.za.cput.domain.GameReserve.Clinic;
import ac.za.cput.repository.EmployeeRepository.Imp.ClinicNurseRepositoryImp;
import ac.za.cput.repository.GameReserveRepository.ClinicRepository;

import java.util.HashSet;
import java.util.Set;

public class ClinicRepositoryImp implements ClinicRepository {
    private static ClinicRepositoryImp clinicRepository = null;
    private Set<Clinic> clinics;

    private ClinicRepositoryImp(){
        this.clinics = new HashSet<>();
    }

    public static ClinicRepositoryImp getRepository(){
        if (clinicRepository == null){
            clinicRepository = new ClinicRepositoryImp();
        }
        return clinicRepository;
    }

    @Override
    public Set<Clinic> getAll() {
        return clinics;
    }

    public Clinic find(int id){
        return clinics.stream().filter(clinic -> clinic.getClinicId() == id).findAny().orElse(null);
    }

    @Override
    public Clinic create(Clinic clinic) {
        this.clinics.add(clinic);
        return clinic;
    }

    @Override
    public Clinic update(Clinic clinic) {
        Clinic clinic1 = find(clinic.getClinicId());
        if (clinics.contains(clinic1)){
            clinics.remove(clinic1);
            clinics.add(clinic);
        }
        return clinic1;
    }

    @Override
    public void delete(Integer id) {
        Clinic clinic = find(id);
        clinics.remove(clinic);

    }

    @Override
    public Clinic read(int id) {
        Clinic clinic = find(id);
        if (clinic == null){
            return null;
        }
        else{
            return clinic;
        }
    }
}
