package ac.za.cput.repository.ReservationRepository.Imp;

import ac.za.cput.domain.Reservation.TourBooking;
import ac.za.cput.repository.ReservationRepository.TourBookingRepository;

import java.util.HashSet;
import java.util.Set;

public class TourBookingRepositoryImp implements TourBookingRepository {
    private static TourBookingRepositoryImp bookingRepository = null;
    private Set<TourBooking> bookings;

    public TourBookingRepositoryImp(){
        this.bookings = new HashSet<>();
    }

    public static TourBookingRepositoryImp getBookingRepository(){
        if (bookingRepository == null){
            return new TourBookingRepositoryImp();
        }
        return bookingRepository;
    }

    public TourBooking find(int id){
        return bookings.stream().filter(booking -> booking.getTourId() == id).findAny().orElse(null);
    }

    @Override
    public TourBooking create(TourBooking booking) {
        this.bookings.add(booking);
        return booking;
    }

    @Override
    public TourBooking update(TourBooking booking) {
        TourBooking booking1 = find(booking.getTourId());
        if (bookings.contains(booking1)){
            bookings.remove(booking1);
            bookings.add(booking);
        }
        return booking1;
    }

    @Override
    public void delete(Integer id) {
        TourBooking booking = find(id);
        bookings.remove(booking);
    }

    @Override
    public TourBooking read(int id) {
        TourBooking booking = find(id);
        if (booking == null){
            return null;
        }
        else {
            return booking;
        }
    }

    @Override
    public Set<TourBooking> getAll() {
        return this.bookings;
    }
}
