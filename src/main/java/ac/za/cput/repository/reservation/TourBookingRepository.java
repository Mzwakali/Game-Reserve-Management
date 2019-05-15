package ac.za.cput.repository.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface TourBookingRepository extends InterfaceRepository<TourBooking, Integer> {

    Set<TourBooking> getAll();
}
