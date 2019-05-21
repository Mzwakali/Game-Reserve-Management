package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class FoodCourtStaff extends Employee{

    private int foodCourtId;
    private List<Department> departments;
    //private String firstName, lastName, title;


    public FoodCourtStaff() {
    }
     public FoodCourtStaff(FoodCourtStaffBuilder builder){
        super(builder);
        this.foodCourtId = builder.foodCourtId;
        this.departments = builder.departments;
     }

    public int getFoodCourtId() {
        return foodCourtId;
    }

    public void setFoodCourtId(int foodCourtId) {
        this.foodCourtId = foodCourtId;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class FoodCourtStaffBuilder extends Employee.Builder{
        private int foodCourtId;
        private List<Department> departments;

        public FoodCourtStaffBuilder(){
            super();
        }

        public FoodCourtStaffBuilder foodCourtId(int foodCourtId){
            this.foodCourtId = foodCourtId;
            return this;
        }

        public FoodCourtStaffBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }
        @Override
        public Employee build(){
            return new FoodCourtStaff(this);
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
}
