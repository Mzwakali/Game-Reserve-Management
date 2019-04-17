package ac.za.cput.factory;

import ac.za.cput.domain.Employee.FieldGuide;
import ac.za.cput.domain.Visitor.Visitor;
import ac.za.cput.util.Misc;

public class VisitorFactory {

    public static Visitor getVisitor(int visitorId, String firstName, String lastName, String cellphone, FieldGuide guide){
        return new Visitor.Builder().visitorId(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .cellphone(cellphone)
                .guide(guide)
                .build();


    }
}
