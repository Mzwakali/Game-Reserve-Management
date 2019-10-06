package ac.za.cput.factory.visitor;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.util.Misc;

public class VisitorFactory {

    public static Visitor getVisitor(int visitorId, String firstName, String lastName, String cellphone, String guide){
        return new Visitor.Builder()
                .visitorId(Misc.generateId())
                .firstName(firstName)
                .lastName(lastName)
                .cellphone(cellphone)
                .guide(guide)
                .build();


    }
}
