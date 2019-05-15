package ac.za.cput.domain.visitor;
import ac.za.cput.domain.reservation.TourBooking;

public class InternationalVisitor extends Visitor{

    private TourBooking booking;

    /*public LocalVisitor() {
    }*/
    public InternationalVisitor(InternationalVisitorBuilder builder){
        super(builder);
        this.booking = builder.booking;
    }

    public TourBooking getBooking() {
        return booking;
    }

    public void setBooking(TourBooking booking) {
        this.booking = booking;
    }
    public static class InternationalVisitorBuilder extends Visitor.Builder{
        private TourBooking booking;

        public InternationalVisitorBuilder(){
            super();
        }
        public InternationalVisitorBuilder booking(TourBooking booking){
            this.booking = booking;
            return this;
        }
        @Override
        public Visitor build(){
            return new InternationalVisitor(this);
        }

        @Override
        public String toString() {
            return "InternationalVisitorBuilder{" +
                    "booking=" + booking +
                    '}' +super.toString();
        }
    }

}
