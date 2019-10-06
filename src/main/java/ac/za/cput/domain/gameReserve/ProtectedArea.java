package ac.za.cput.domain.gameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.Set;

@Entity
public class ProtectedArea extends Grounds{


    private int areaId;
    private List<Department> departments;

    public ProtectedArea(ProtectedAreaBuilder protectedAreaBuilder) {
    }

   public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class ProtectedAreaBuilder {
        private int areaId;
        private List<Department> departments;

        public ProtectedAreaBuilder() {
        }

       public ProtectedAreaBuilder areaId(int areaId) {
            this.areaId = areaId;
            return this;
        }

        public ProtectedAreaBuilder department(List<Department> departments) {
            this.departments = departments;
            return this;
        }
        public ProtectedArea build(){
            return new ProtectedArea(this);
        }

        @Override
        public String toString() {
            return "ProtectedAreaBuilder{" +
                    //"areaId=" + areaId +
                    ", departments=" + departments +
                    '}';
        }
    }
}
