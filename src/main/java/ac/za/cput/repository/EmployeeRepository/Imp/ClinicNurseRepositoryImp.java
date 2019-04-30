package ac.za.cput.repository.EmployeeRepository.Imp;

import ac.za.cput.domain.Employee.ClinicNurse;
import ac.za.cput.repository.EmployeeRepository.ClinicNurseRepository;

import java.util.HashSet;
import java.util.Set;

public class ClinicNurseRepositoryImp implements ClinicNurseRepository {

    private static ClinicNurseRepositoryImp clicNurseRepo = null;
    private Set<ClinicNurse> clinicNurses;

    public ClinicNurseRepositoryImp(){
        clinicNurses = new HashSet<>();
    }
    public static ClinicNurseRepositoryImp getRepository(){
        if (clicNurseRepo == null){
            return new ClinicNurseRepositoryImp();
        }
        return clicNurseRepo;
    }

    public ClinicNurse find(int id){
        return clinicNurses.stream().filter(clinicNurse -> clinicNurse.getEmpId() == id).findAny().orElse(null);
    }

    @Override
    public Set<ClinicNurse> getAll() {
        return clinicNurses;
    }

    @Override
    public ClinicNurse create(ClinicNurse clinicNurse) {
        clinicNurses.add(clinicNurse);
        return clinicNurse;
    }

    @Override
    public ClinicNurse update(ClinicNurse clinicNurse) {
        ClinicNurse clinicNurse1 = find(clinicNurse.getEmpId());
        if (clinicNurses.contains(clinicNurse1)){
            clinicNurses.remove(clinicNurse1);
            clinicNurses.add(clinicNurse);
        }
        return clinicNurse1;
    }

    @Override
    public void delete(Integer id) {
        ClinicNurse clinicNurse = find(id);
        clinicNurses.remove(clinicNurse);
    }

    @Override
    public ClinicNurse read(int id) {
        ClinicNurse clinicNurse = find(id);
        if (clinicNurse == null){
            return null;
        }
        return clinicNurse;
    }
}
