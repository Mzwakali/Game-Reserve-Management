package ac.za.cput.domain.GameReserve;

public class Department {

    private int deptId;
    private String section;

    public Department() {

    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", section='" + section + '\'' +
                '}';
    }
}
