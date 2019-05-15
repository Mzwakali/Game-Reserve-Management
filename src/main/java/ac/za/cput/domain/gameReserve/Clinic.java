package ac.za.cput.domain.gameReserve;

import java.awt.*;
import java.util.List;

public class Clinic {

    private int clinicId;
    private String clinicName;
    private List<Department> departments;

    public Clinic() {
    }
    public Clinic(ClinicBuilder builder){
        this.clinicId = builder.clinicId;
        this.clinicName = builder.clinicName;
        this.departments = builder.departments;
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public static class ClinicBuilder{
        private int clinicId;
        private String clinicName;
        private List<Department> departments;

        public ClinicBuilder(){}

        public ClinicBuilder clinicId(int clinicId){
            this.clinicId = clinicId;
            return this;
        }

        public ClinicBuilder clinicName(String clinicName){
            this.clinicName = clinicName;
            return this;
        }

        public ClinicBuilder departments(List<Department> departments){
            this.departments = departments;
            return this;
        }

        public Clinic build(){
            return new Clinic(this);
        }
    }
}
