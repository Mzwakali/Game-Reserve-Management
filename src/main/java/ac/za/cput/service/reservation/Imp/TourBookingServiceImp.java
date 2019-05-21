package ac.za.cput.service.reservation.Imp;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.repository.reservation.Imp.TourBookingRepositoryImp;
import ac.za.cput.repository.reservation.TourBookingRepository;
import ac.za.cput.service.reservation.TourBookingService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TourBookingServiceImp implements TourBookingService {
    private static TourBookingServiceImp tourBookingService = null;
    private TourBookingRepository repository;

    TourBookingServiceImp(){
        this.repository = TourBookingRepositoryImp.getBookingRepository();
    }

    public static TourBookingServiceImp getTourBookingService(){
        if (tourBookingService == null){
            tourBookingService = new TourBookingServiceImp();
        }
        return tourBookingService;
    }

    @Override
    public Set<TourBooking> getAll() {
        return this.repository.getAll();
    }

    @Override
    public TourBooking create(TourBooking booking) {
        return this.repository.create(booking);
    }

    @Override
    public TourBooking update(TourBooking booking) {
        return this.repository.update(booking);
    }

    @Override
    public void delete(Integer id) {
        this.repository.delete(id);
    }

    @Override
    public TourBooking read(int id) {
        return this.repository.read(id);
    }
}
