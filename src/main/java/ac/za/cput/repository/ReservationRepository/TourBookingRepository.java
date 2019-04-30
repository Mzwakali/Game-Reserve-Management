package ac.za.cput.repository.ReservationRepository;

import ac.za.cput.domain.Reservation.TourBooking;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface TourBookingRepository extends InterfaceRepository<TourBooking, Integer> {

    Set<TourBooking> getAll();
}
