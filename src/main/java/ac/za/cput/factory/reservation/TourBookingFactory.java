package ac.za.cput.factory.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.util.Misc;

public class TourBookingFactory {

    public static TourBooking getBooking(int bookingId, String tourDate, Visitor visitor){
        return new TourBooking.TourBookingBuilder()
                .bookingId(Misc.generateId())
                .tourDate(tourDate)
                .visitor(visitor)
                .build();
    }
}
