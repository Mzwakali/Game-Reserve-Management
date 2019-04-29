package ac.za.cput.factory;

import ac.za.cput.domain.Employee.ClinicDoc;
import ac.za.cput.util.Misc;

public class ClinicDocFactory {
    public static ClinicDoc getClinicDoc(String firstName, String lastName, String position) {
        return (ClinicDoc) new ClinicDoc.ClinicDocBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .empId(Misc.generateId())
                .build();
    }
}
