package ac.za.cput.domain.Visitor;

import ac.za.cput.domain.Reservation.TourBooking;

public class LocalVisitor extends Visitor {

    private TourBooking booking;

    /*public LocalVisitor() {
    }*/
    public LocalVisitor(LocalVisitorBuilder builder){
        super(builder);
        this.booking = builder.booking;
    }

    public TourBooking getBooking() {
        return booking;
    }

    public void setBooking(TourBooking booking) {
        this.booking = booking;
    }
    public static class LocalVisitorBuilder extends Visitor.Builder{
        private TourBooking booking;

        public LocalVisitorBuilder(){
            super();
        }
        public LocalVisitorBuilder booking(TourBooking booking){
            this.booking = booking;
            return this;
        }
        @Override
        public Visitor build(){
            return new LocalVisitor(this);
        }

        @Override
        public String toString() {
            return "InternationalVisitorBuilder{" +
                    "booking=" + booking +
                    '}' +super.toString();
        }
    }
}
