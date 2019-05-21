package ac.za.cput.repository.reservation.Imp;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.repository.reservation.TourBookingRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository("TourBookingInMemory")
public class TourBookingRepositoryImp implements TourBookingRepository {
    private static TourBookingRepositoryImp bookingRepository = null;
    private Map<Integer, TourBooking> bookings;

    public TourBookingRepositoryImp(){
        this.bookings = new HashMap<>();
    }

    public static TourBookingRepositoryImp getBookingRepository(){
        if (bookingRepository == null){
            return new TourBookingRepositoryImp();
        }
        return bookingRepository;
    }

    /*public TourBooking find(int id){
        return bookings.stream().filter(booking -> booking.getTourId() == id).findAny().orElse(null);
    }*/

    @Override
    public TourBooking create(TourBooking booking) {
        this.bookings.put(booking.getTourId(), booking);
        return booking;
    }

    @Override
    public TourBooking update(TourBooking booking) {
        /*TourBooking booking1 = find(booking.getTourId());
        if (bookings.contains(booking1)){
            bookings.remove(booking1);
            bookings.add(booking);
        }*/
        bookings.replace(booking.getTourId(), booking);
        return bookings.get(booking.getTourId());
    }

    @Override
    public void delete(Integer id) {
        //TourBooking booking = find(id);
        bookings.remove(id);
    }

    @Override
    public TourBooking read(int id) {
       /*TourBooking booking = find(id);
        if (booking == null){
            return null;
        }
        else {
            return booking;
        }*/
       return bookings.get(id);
    }

    @Override
    public Set<TourBooking> getAll() {
        return new HashSet<>(bookings.values());
    }
}
