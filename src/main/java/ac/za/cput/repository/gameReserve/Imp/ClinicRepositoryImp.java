package ac.za.cput.repository.gameReserve.Imp;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.repository.gameReserve.ClinicRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClinicRepositoryImp implements ClinicRepository {
    private static ClinicRepositoryImp clinicRepository = null;
    private Map<Integer, Clinic> clinics;

    private ClinicRepositoryImp(){
        this.clinics = new HashMap<>();
    }

    public static ClinicRepositoryImp getRepository(){
        if (clinicRepository == null){
            clinicRepository = new ClinicRepositoryImp();
        }
        return clinicRepository;
    }

    @Override
    public Set<Clinic> getAll() {
        return new HashSet<>(clinics.values());
    }

   /* public Clinic find(int id){
        return clinics.stream().filter(clinic -> clinic.getClinicId() == id).findAny().orElse(null);
    }*/

    @Override
    public Clinic create(Clinic clinic) {
        this.clinics.put(clinic.getClinicId(), clinic);
        return clinic;
    }

    @Override
    public Clinic update(Clinic clinic) {
        /*Clinic clinic1 = find(clinic.getClinicId());
        if (clinics.contains(clinic1)){
            clinics.remove(clinic1);
            clinics.add(clinic);
        }*/
        clinics.replace(clinic.getClinicId(), clinic);
        return clinics.get(clinic.getClinicId());
    }

    @Override
    public void delete(Integer id) {
        //Clinic clinic = find(id);
        clinics.remove(id);

    }

    @Override
    public Clinic read(int id) {
        /*Clinic clinic = find(id);
        if (clinic == null){
            return null;
        }
        else{
            return clinic;
        }*/
        return clinics.get(id);
    }
}
