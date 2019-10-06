package ac.za.cput.domain.gameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class Department extends GameReserve{


    private int deptId;
    private int clinicId;
    @OneToMany
    private List<ProtectedArea> protectedAreas;

    public Department() {

    }
    public Department(DepartmentBuilder builder){}

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    @OneToMany
    public List<ProtectedArea> getProtectedAreas() {
        return protectedAreas;
    }

    public void setProtectedAreas(List<ProtectedArea> protectedAreas) {
        this.protectedAreas = protectedAreas;
    }

    public static class DepartmentBuilder{
        private int deptId;
        private int clinicId;
        private List<ProtectedArea> protectedAreas;

        public DepartmentBuilder(){}
        public DepartmentBuilder departmentId(int deptId){
            this.deptId = deptId;
            return this;
        }

        public DepartmentBuilder clinicId(int clinicId){
            this.clinicId = clinicId;
            return this;
        }

        public DepartmentBuilder protectedArea(List<ProtectedArea> protectedAreas){
            this.protectedAreas = protectedAreas;
            return  this;
        }

        public Department build(){
            return new Department(this);
        }

        @Override
        public String toString() {
            return "DepartmentBuilder{" +
                    "deptId=" + deptId +
                    ", clinicId=" + clinicId +
                    ", protectedAreas=" + protectedAreas +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof DepartmentBuilder)) return false;
            DepartmentBuilder that = (DepartmentBuilder) o;
            return deptId == that.deptId &&
                    clinicId == that.clinicId &&
                    protectedAreas.equals(that.protectedAreas);
        }

        @Override
        public int hashCode() {
            return Objects.hash(deptId, clinicId, protectedAreas);
        }
    }
}
