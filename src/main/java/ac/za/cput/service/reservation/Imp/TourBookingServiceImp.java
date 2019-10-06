package ac.za.cput.service.reservation.Imp;

import ac.za.cput.domain.reservation.TourBooking;
//import ac.za.cput.repository.reservation.Imp.TourBookingRepositoryImp;
import ac.za.cput.repository.reservation.TourBookingRepository;
import ac.za.cput.service.reservation.TourBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourBookingServiceImp implements TourBookingService {

    private static TourBookingService tourBookingService = null;

    @Autowired
    private TourBookingRepository repository;

    /*TourBookingServiceImp(){
        this.repository = TourBookingRepositoryImp.getBookingRepository();
    }*/

    public static TourBookingService getTourBookingService(){
        if (tourBookingService == null){
            tourBookingService = new TourBookingServiceImp();
        }
        return tourBookingService;
    }

    @Override
    public List<TourBooking> getAll() {
        return this.repository.findAll();
    }

    @Override
    public TourBooking create(TourBooking booking) {
        return this.repository.save(booking);
    }

    @Override
    public TourBooking update(TourBooking booking) {
        return this.repository.save(booking);
    }

    @Override
    public void delete(Integer id) {
        this.repository.deleteById(id);
    }

    @Override
    public TourBooking read(int id) {
        Optional<TourBooking> optionalBooking = this.repository.findById(id);
        return optionalBooking.orElse(null);
    }
}
