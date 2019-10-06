//package ac.za.cput.repository.employee.Imp;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.repository.employee.ClinicNurseRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
@Repository("ClinicNurseInMemory")
public class ClinicNurseRepositoryImp implements ClinicNurseRepository {

    private static ClinicNurseRepositoryImp clicNurseRepo = null;
    private Map<Integer, ClinicNurse> clinicNurses;

    public ClinicNurseRepositoryImp(){
        clinicNurses = new HashMap<>();
    }
    public static ClinicNurseRepositoryImp getRepository(){
        if (clicNurseRepo == null){
            return new ClinicNurseRepositoryImp();
        }
        return clicNurseRepo;
    }

    /*public ClinicNurse find(int id){
        return clinicNurses.stream().filter(clinicNurse -> clinicNurse.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public Set<ClinicNurse> getAll() {
        return new HashSet<>(clinicNurses.values());
    }

    @Override
    public ClinicNurse create(ClinicNurse clinicNurse) {
        clinicNurses.put(clinicNurse.getEmpId(), clinicNurse);
        return clinicNurse;
    }

    @Override
    public ClinicNurse update(ClinicNurse clinicNurse) {
       /* ClinicNurse clinicNurse1 = find(clinicNurse.getEmpId());
        if (clinicNurses.contains(clinicNurse1)){
            clinicNurses.remove(clinicNurse1);
            clinicNurses.add(clinicNurse);
        }
       clinicNurses.replace(clinicNurse.getEmpId(), clinicNurse);
        return clinicNurses.get(clinicNurse.getEmpId());
    }

    @Override
    public void delete(Integer id) {
        //ClinicNurse clinicNurse = find(id);
        clinicNurses.remove(id);
    }

    @Override
    public ClinicNurse read(int id) {
        /*ClinicNurse clinicNurse = find(id);
        if (clinicNurse == null){
            return null;
        }
        return clinicNurses.get(id);
    }
}*/
