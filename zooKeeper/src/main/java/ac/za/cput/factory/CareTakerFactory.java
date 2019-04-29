package ac.za.cput.factory;

import ac.za.cput.domain.Employee.Caretaker;
import ac.za.cput.util.Misc;

public class CareTakerFactory {
    public static Caretaker getCareTaker(String firstName, String lastName, String position, int age) {
        return (Caretaker) new Caretaker.CaretakerBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .position(position)
                .empId(Misc.generateId())
                .build();
    }
}
