package ac.za.cput.factory;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.util.Misc;

public class CareTakerFactory {
    public static Caretaker getCareTaker(String firstName, String lastName,String jobTitle,  int age) {
        return new Caretaker.Builder().age(age)
                .firstName(firstName)
                .lastName(lastName)
                .jobTitle(jobTitle)
                .keeperId(Misc.generateId())
                .build();
    }
}
