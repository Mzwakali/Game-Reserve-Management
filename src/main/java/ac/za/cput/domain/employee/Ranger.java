package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Ranger extends Employee{

    private List<Department> departments;
    private List<Qualification> qualifications;

    public Ranger(MarineRanger.MarineRangerBuilder builder) {
    }
    public Ranger(RangerBuilder builder){
        super(builder);
        this.departments = builder.departments;
        this.qualifications = builder.qualifications;
    }

    public Ranger(WildlifeRanger.WildlifeRangerBuilder builder) {

    }

    public Ranger() {

    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public static class RangerBuilder extends Employee.Builder{
        private List<Department> departments;
        private List<Qualification> qualifications;

        public RangerBuilder(){
            super();
        }

        public RangerBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }

        public RangerBuilder qualifications(List<Qualification> qualifications){
            this.qualifications = qualifications;
            return this;
        }

        public Employee build(){
            return new Ranger(this);
        }

        @Override
        public String toString(){
            return super.toString();
        }

    }
}
