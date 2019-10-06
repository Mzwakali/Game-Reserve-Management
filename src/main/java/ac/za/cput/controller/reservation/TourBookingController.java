package ac.za.cput.controller.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.service.reservation.Imp.TourBookingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/game/tourBooking")
public class TourBookingController {

    @Autowired
    private TourBookingServiceImp bookingService;

    @PostMapping("/create")
    @ResponseBody
    public TourBooking create(TourBooking booking){
        return bookingService.create(booking);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public TourBooking update(TourBooking booking){
        return bookingService.update(booking);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        bookingService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public TourBooking read(@PathVariable int id){
        return bookingService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<TourBooking> getAll(){
        return bookingService.getAll();
    }
}
