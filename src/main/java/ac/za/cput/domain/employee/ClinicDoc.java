package ac.za.cput.domain.employee;

import java.util.*;

public class ClinicDoc extends Employee{
    private List<Qualification> qualifications;
    private String position;

    public ClinicDoc() {
    }

    public ClinicDoc(ClinicDocBuilder builder) {
        super(builder);
        this.position = builder.position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<Qualification> getQualifications() {
        return qualifications;
    }

    public void setQualifications(List<Qualification> qualifications) {
        this.qualifications = qualifications;
    }

    public static class ClinicDocBuilder extends Employee.Builder{
        private String position;
        private List<Qualification> qualifications;

        public ClinicDocBuilder(){
            super();
        }
        public ClinicDocBuilder position(String postion){
            this.position = postion;
            return this;
        }
        public ClinicDocBuilder qualifications(List<Qualification> qualifications){
            this.qualifications = qualifications;
            return this;
        }
        @Override
        public Employee build(){
            return new ClinicDoc(this);
        }

        @Override
        public String toString() {
            return "ClinicDocBuilder{" +
                    "position='" + position + '\'' +
                    ", qualifications=" + qualifications +
                    '}';
        }
    }



}
