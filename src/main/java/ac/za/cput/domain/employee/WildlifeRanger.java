package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class WildlifeRanger extends Ranger{
    //private int rangerId;
    private List<Qualification> qualificationList;
    private List<Department> departments;

    public WildlifeRanger() {
        super();
        //super(builder);
    }

    public WildlifeRanger(WildlifeRangerBuilder builder){
        super(builder);
        //this.rangerId = builder.rangerId;
        this.departments = builder.departments;
        this.qualificationList = builder.qualificationList;
    }

    /*public int getRangerId() {
        return rangerId;
    }

    public void setRangerId(int rangerId) {
        this.rangerId = rangerId;
    }*/

    public List<Qualification> getQualificationList() {
        return qualificationList;
    }

    public void setQualificationList(List<Qualification> qualificationList) {
        this.qualificationList = qualificationList;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class WildlifeRangerBuilder extends Ranger.Builder{
        //private int rangerId;
        private List<Department> departments;
        private List<Qualification> qualificationList;

        public WildlifeRangerBuilder(){
            super();
        }

        /*public WildlifeRangerBuilder rangerId(int rangerId){
            this.rangerId = rangerId;
            return this;
        }*/

        public WildlifeRangerBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }

        public WildlifeRangerBuilder qualification(List<Qualification> qualificationList){
            this.qualificationList = qualificationList;
            return this;
        }

        @Override
        public Employee build(){
            return new WildlifeRanger(this);
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
}
