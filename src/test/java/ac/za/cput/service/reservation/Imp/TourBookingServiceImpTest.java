package ac.za.cput.service.reservation.Imp;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.factory.reservation.TourBookingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TourBookingServiceImpTest {

    private TourBookingServiceImp bookingService;

    @Before
    public void setUp() throws Exception {
        bookingService = new TourBookingServiceImp();
    }

    @Test
    public void create() {
        TourBooking booking = TourBookingFactory.getBooking(4, "16/06/19", "Jackson");
        bookingService.create(booking);
        Assert.assertNotNull(bookingService.getAll());

    }

    @Test
    public void update() {
        TourBooking booking = TourBookingFactory.getBooking(4, "16/06/19", "Jackson");
        bookingService.create(booking);
        Assert.assertNotNull(bookingService.getAll());

        TourBooking bookingUpdate = TourBookingFactory.getBooking(4, "16/07/19", "Gorden");
        bookingUpdate.setBookingId(booking.getBookingId());
        bookingService.update(bookingUpdate);

        TourBooking bookingNew = bookingService.read(bookingUpdate.getBookingId());
        Assert.assertEquals(bookingUpdate, bookingNew);
    }

    @Test
    public void delete() {
        TourBooking booking = TourBookingFactory.getBooking(4, "16/06/19", "Jackson");
        bookingService.create(booking);
        Assert.assertNotNull(bookingService.getAll());

        bookingService.delete(booking.getBookingId());

        TourBooking excluded = bookingService.read(booking.getBookingId());
        Assert.assertNull(excluded);
    }

    @Test
    public void read() {
        TourBooking booking = TourBookingFactory.getBooking(4, "16/06/19", "Jackson");
        bookingService.create(booking);
        Assert.assertNotNull(bookingService.getAll());

        TourBooking bookingNew = bookingService.read(booking.getBookingId());
        Assert.assertEquals(booking,bookingNew);
    }
}