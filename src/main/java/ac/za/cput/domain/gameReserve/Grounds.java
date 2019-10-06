package ac.za.cput.domain.gameReserve;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Grounds {

    @Id
    private int sectionId;
    private double size;
    @ElementCollection
    private List<Department> departments;

    public Grounds() {
    }

    public Grounds(GroundsBuilder groundsBuilder) {

    }

    public int getSectionId() {
        return sectionId;
    }

    public void setSectionId(int sectionId) {
        this.sectionId = sectionId;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class GroundsBuilder{
        private int sectionId;
        private double size;
        private List<Department> departments;

        public GroundsBuilder(){}
        public GroundsBuilder sectionId(int sectionId){
            this.sectionId = sectionId;
            return this;
        }
        public GroundsBuilder size(double size){
            this.size = size;
            return this;
        }
        public GroundsBuilder department(List<Department> departments){
            this.departments = departments;
            return this;
        }
        public Grounds build(){
            return new Grounds(this);
        }

        @Override
        public String toString() {
            return "GroundsBuilder{" +
                    "sectionId=" + sectionId +
                    ", size=" + size +
                    ", departments=" + departments +
                    '}';
        }
    }
}
