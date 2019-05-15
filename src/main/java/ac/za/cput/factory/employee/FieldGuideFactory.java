package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.domain.visitor.Visitor;

import java.util.List;

public class FieldGuideFactory {

    public static FieldGuide getGuide(int guideId, TourBooking booking, Visitor visitor, List<Department> departments) {
        return new FieldGuide.FieldGuideBuilder()
                .guideId(guideId)
                .booking(booking)
                .department(departments)
                .build();
    }
}
