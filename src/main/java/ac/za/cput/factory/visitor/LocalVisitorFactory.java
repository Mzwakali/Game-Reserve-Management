package ac.za.cput.factory.visitor;

import ac.za.cput.domain.visitor.LocalVisitor;

public class LocalVisitorFactory {
    public static LocalVisitor getLocalVisitor(String firstName, String lastName, String telephone) {
        return (LocalVisitor) new LocalVisitor.LocalVisitorBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
