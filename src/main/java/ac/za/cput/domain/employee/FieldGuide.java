package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.reservation.TourBooking;
import ac.za.cput.domain.visitor.Visitor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Entity
public class FieldGuide extends Employee{


    private int guideId;
    private TourBooking booking;
    private Visitor visitor;
    private Map<Integer, Department> departments;

    public FieldGuide(FieldGuideBuilder fieldGuideBuilder) {
    }

    public int getGuideId() {
        return guideId;
    }

    public void setGuideId(int guideId) {
        this.guideId = guideId;
    }

    public TourBooking getBooking() {
        return booking;
    }

    public void setBooking(TourBooking booking) {
        this.booking = booking;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Map<Integer,Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<Integer,Department> departments) {
        this.departments = departments;
    }

    public static class FieldGuideBuilder{
        private int guideId;
        private TourBooking booking;
        private Visitor visitor;
        private Map<Integer,Department> department;

        public FieldGuideBuilder guideId(int guideId){
            this.guideId = guideId;
            return this;
        }

        public FieldGuideBuilder booking(TourBooking booking){
            this.booking = booking;
            return this;
        }

        public FieldGuideBuilder visitor(Visitor visitor){
            this.visitor = visitor;
            return this;
        }
        public FieldGuideBuilder department(Map<Integer, Department> department){
            this.department = department;
            return this;
        }
        public FieldGuide build(){
            return new FieldGuide(this);
        }

        @Override
        public String toString() {
            return "FieldGuideBuilder{" +
                    "guideId=" + guideId +
                    ", booking=" + booking +
                    ", visitor=" + visitor +
                    ", department=" + department +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof FieldGuideBuilder)) return false;
            FieldGuideBuilder that = (FieldGuideBuilder) o;
            return guideId == that.guideId &&
                    booking.equals(that.booking) &&
                    visitor.equals(that.visitor) &&
                    department.equals(that.department);
        }

        @Override
        public int hashCode() {
            return Objects.hash(guideId, booking, visitor, department);
        }
    }
}




