package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.domain.employee.Qualification;
import ac.za.cput.util.Misc;

import java.util.List;

public class ClinicNurseFactory {
    public static ClinicNurse getClinicNurse(String firstName, String lastName, String position) {
        return (ClinicNurse) new ClinicNurse.ClinicNurseBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .empId(Misc.generateId())
                .build();
    }
}
