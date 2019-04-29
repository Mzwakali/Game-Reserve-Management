package ac.za.cput.factory;

import ac.za.cput.domain.Visitor.LocalVisitor;
import ac.za.cput.util.Misc;

public class LocalVisitorFactory {
    public static LocalVisitor getLocalVisitor(String firstName, String lastName, String telephone) {
        return (LocalVisitor) new LocalVisitor.LocalVisitorBuilder()
                //.visitorId(Misc.visitorId())
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
