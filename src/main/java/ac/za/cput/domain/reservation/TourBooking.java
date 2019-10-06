package ac.za.cput.domain.reservation;

import ac.za.cput.domain.visitor.Visitor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;

@Entity
public class TourBooking extends Tour{


    private int bookingId;
    private String tourDate;
    @OneToOne
    private Visitor visitor;

    public TourBooking(TourBookingBuilder tourBookingBuilder) {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public static class TourBookingBuilder{
        private int bookingId;
        private String tourDate;
        private Visitor visitor;

        public TourBookingBuilder bookingId(int bookingId){
            this.bookingId = bookingId;
            return this;
        }

        public TourBookingBuilder tourDate(String tourDate){
            this.tourDate = tourDate;
            return this;
        }

        public TourBookingBuilder visitor(Visitor visitor){
            this.visitor = visitor;
            return this;
        }

        public TourBooking build(){
            return new TourBooking(this);
        }

        @Override
        public String toString() {
            return "TourBookingBuilder{" +
                    "bookingId=" + bookingId +
                    ", tourDate='" + tourDate + '\'' +
                    ", visitor=" + visitor +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof TourBookingBuilder)) return false;
            TourBookingBuilder that = (TourBookingBuilder) o;
            return bookingId == that.bookingId &&
                    Objects.equals(tourDate, that.tourDate) &&
                    Objects.equals(visitor, that.visitor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookingId, tourDate, visitor);
        }
    }
}
