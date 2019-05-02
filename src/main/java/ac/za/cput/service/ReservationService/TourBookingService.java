package ac.za.cput.service.ReservationService;

import ac.za.cput.domain.Reservation.TourBooking;
import ac.za.cput.service.IService;

import java.util.Set;

public interface TourBookingService extends IService<TourBooking, Integer> {
    Set<TourBooking> getAll();
}
