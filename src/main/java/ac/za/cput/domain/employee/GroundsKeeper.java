package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.Department;
import ac.za.cput.domain.gameReserve.GameReserve;
import ac.za.cput.domain.gameReserve.Grounds;

import java.util.List;
import java.util.Set;

public class GroundsKeeper extends Employee{

    private int groundsKeepId;
    private List<Department> departmentList;

    public GroundsKeeper() {
    }
    public GroundsKeeper(GroundsKeeperBuilder builder){
        super(builder);
        this.groundsKeepId = builder.groundskeepId;
        this.departmentList = builder.departments;
    }

    public int getGroundsKeepId() {
        return groundsKeepId;
    }

    public void setGroundsKeepId(int groundsKeepId) {
        this.groundsKeepId = groundsKeepId;
    }

    public static class GroundsKeeperBuilder extends Employee.Builder{
        private int groundskeepId;
        private List<Department> departments;

        public GroundsKeeperBuilder(){
            super();
        }

        public GroundsKeeperBuilder groundsKeepId(int groundskeepId){
            this.groundskeepId = groundskeepId;
            return this;
        }

        public GroundsKeeperBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }
        @Override
        public Employee build(){
            return new GroundsKeeper(this);
        }
        @Override
        public String toString(){
            return super.toString();
        }
    }
}
