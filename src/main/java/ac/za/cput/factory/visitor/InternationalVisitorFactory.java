package ac.za.cput.factory.visitor;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.domain.visitor.InternationalVisitor;

public class InternationalVisitorFactory {

    public static InternationalVisitor getInternationalVisitor(String booking){
        return (InternationalVisitor) new InternationalVisitor.InternationalVisitorBuilder()
                //.booking(booking)
                .build();

    }
}
