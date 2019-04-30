package ac.za.cput.factory;

import ac.za.cput.domain.Employee.FieldGuide;

public class FieldGuideFactory {

    public static FieldGuide getGuide(String firstName) {
        return new FieldGuide().setFirstName(firstName);

    }
}
