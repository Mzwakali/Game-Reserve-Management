package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class GeneralWorker extends Employee{


    private int generalWorkId;
    private List<Department> departments;
    //private String firstName, lastName, title;

    public GeneralWorker() {
    }
     public GeneralWorker(GeneralWorkerBuilder builder){
        super(builder);
        this.generalWorkId = builder.generalWorkId;
        this.departments = builder.departments;
     }

    public int getGeneralWorkId() {
        return generalWorkId;
    }

    public void setGeneralWorkId(int generalWorkId) {
        this.generalWorkId = generalWorkId;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class GeneralWorkerBuilder extends Employee.Builder{
        private int generalWorkId;
        private List<Department> departments;

        public GeneralWorkerBuilder(){
            super();
        }

        public GeneralWorkerBuilder generalWorkId(int generalWorkId){
            this.generalWorkId = generalWorkId;
            return this;
        }

        public GeneralWorkerBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }
        @Override
        public Employee build(){
            return new GeneralWorker(this);
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
}
