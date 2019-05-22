package ac.za.cput.factory.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.domain.visitor.Visitor;
import ac.za.cput.util.Misc;

public class TourBookingFactory {

    public static TourBooking getBooking(int bookingId, String tourDate, String visitor){
        return new TourBooking.TourBookingBuilder()
                .bookingId(bookingId)
                .tourDate(tourDate)
                //.visitor(visitor)
                .build();
    }
}
