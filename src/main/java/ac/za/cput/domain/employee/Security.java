package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;

import javax.persistence.Entity;
import java.util.List;
import java.util.Map;

@Entity
public class Security extends Employee{
    //private int securityId;
    private Map<Integer,Department> departments;

    public Security() {
    }
     public Security(SecurityBuilder builder){
        super(builder);
        //this.securityId = builder.securityId;
        this.departments = builder.departments;
     }

   /* public int getSecurityId() {
        return securityId;
    }

    public void setSecurityId(int securityId) {
        this.securityId = securityId;
    }*/

    public Map<Integer,Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<Integer,Department> departments) {
        this.departments = departments;
    }

    public static class SecurityBuilder extends Employee.Builder{
        //private int securityId;
        private Map<Integer,Department> departments;

        public SecurityBuilder(){
            super();
        }

        /*public SecurityBuilder securityId(int securityId){
            this.securityId = securityId;
            return this;
        }*/

        public SecurityBuilder departments(Map<Integer,Department> departments){
            this.departments = departments;
            return this;
        }
        @Override
        public Employee build(){
            return new Security(this);
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
}
