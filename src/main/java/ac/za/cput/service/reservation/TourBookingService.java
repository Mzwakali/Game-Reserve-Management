package ac.za.cput.service.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.service.IService;

import java.util.Set;

public interface TourBookingService extends IService<TourBooking, Integer> {
    Set<TourBooking> getAll();
}
