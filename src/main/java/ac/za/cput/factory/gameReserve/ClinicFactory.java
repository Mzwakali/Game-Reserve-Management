package ac.za.cput.factory.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.util.Misc;

import java.util.List;

public class ClinicFactory {

    public static Clinic getClinic(int clinicId, String clinicName, List<Department> departments){
        return new Clinic.ClinicBuilder()
                .clinicId(Misc.generateId())
                .clinicName(clinicName)
                .departments(departments)
                .build();
    }
}
