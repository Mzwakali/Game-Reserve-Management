package ac.za.cput.repository.reservation.Imp;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.factory.reservation.TourBookingFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/*
@RunWith(SpringRunner.class)
@SpringBootTest
public class TourBookingRepositoryImpTest {

    TourBookingRepositoryImp bookingRepository;

    @Before
    public void setUp() throws Exception {
        bookingRepository = TourBookingRepositoryImp.getBookingRepository();
    }

    @Test
    public void create() {
        TourBooking booking = TourBookingFactory.getBooking(2,"07/06/19", "Jacksons");
        bookingRepository.create(booking);

        Assert.assertNotNull(bookingRepository.getAll());
    }

    @Test
    public void update() {
        TourBooking booking = TourBookingFactory.getBooking(2,"07/06/19", "Jacksons");
        bookingRepository.create(booking);

        Assert.assertNotNull(bookingRepository.getAll());

        TourBooking booking1 = TourBookingFactory.getBooking(2, "07/06/19", "Micheals");
        booking1.setBookingId(booking.getBookingId());
        bookingRepository.update(booking1);

        TourBooking bookingUpdate = bookingRepository.read(booking1.getBookingId());
        Assert.assertEquals(booking1, bookingUpdate);
    }

    @Test
    public void delete() {
        TourBooking booking = TourBookingFactory.getBooking(2,"07/06/19", "Jacksons");
        bookingRepository.create(booking);

        Assert.assertNotNull(bookingRepository.getAll());

        bookingRepository.delete(booking.getBookingId());

        TourBooking bookingDeleted = bookingRepository.read(booking.getBookingId());
        Assert.assertNull(bookingDeleted);
    }

    @Test
    public void read() {
        TourBooking booking = TourBookingFactory.getBooking(2,"07/06/19", "Jacksons");
        bookingRepository.create(booking);

        Assert.assertNotNull(bookingRepository.getAll());

        TourBooking bookingRead = bookingRepository.read(booking.getBookingId());
        Assert.assertEquals(booking, bookingRead);
    }
}*/