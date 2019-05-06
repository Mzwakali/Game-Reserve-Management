package ac.za.cput.domain.GameReserve;

import java.util.Set;

public class ProtectedArea {

    private int areaId;
    private Set<Department> departments;

    public ProtectedArea() {
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "ProtectedArea{" +
                "areaId=" + areaId +
                ", departments=" + departments +
                '}';
    }
}
