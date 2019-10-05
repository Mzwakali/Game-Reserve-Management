package ac.za.cput.repository.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.repository.InterfaceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface TourBookingRepository extends JpaRepository<TourBooking, Integer> {

    //Set<TourBooking> getAll();
}
