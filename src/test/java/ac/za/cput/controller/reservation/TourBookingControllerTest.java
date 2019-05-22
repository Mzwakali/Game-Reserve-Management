package ac.za.cput.controller.reservation;

import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.factory.reservation.TourBookingFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TourBookingControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    private String originUrl = "http://localhost:8080/reservation/tourBooking";

    @Test
    public void create() {
        TourBooking booking = TourBookingFactory.getBooking(2,"16/06/19",null);
        booking.setBookingId(booking.getBookingId());

        ResponseEntity<TourBooking> responseEntity = restTemplate.postForEntity(originUrl +"/create", booking, TourBooking.class);
        assertNotNull(responseEntity);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    public void find(){
        TourBooking booking = restTemplate.getForObject(originUrl +"/find/2", TourBooking.class);
        assertNotNull(booking);
    }

    @Test
    public void update() {
        int id = 2;
        TourBooking booking = restTemplate.getForObject(originUrl + "/update/" +id, TourBooking.class);
        booking.setBookingId(1);

        restTemplate.put(originUrl +"/update/"+ id, booking);
        TourBooking bookingUpdate = restTemplate.getForObject(originUrl +"/update/" +id, TourBooking.class);
        assertNotNull(bookingUpdate);
    }

    @Test
    public void delete() {
        int id = 2;
        TourBooking booking = restTemplate.getForObject(originUrl +"/find/" +id, TourBooking.class);
        restTemplate.delete(originUrl +"/delete/" +id);

        try{
            booking = restTemplate.getForObject(originUrl +"/find/" +id, TourBooking.class);
        }catch(final HttpClientErrorException x){
            assertEquals(x.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(originUrl +"/getAll", HttpMethod.GET, entity, String.class);
        assertNotNull(responseEntity.getBody());
    }
}