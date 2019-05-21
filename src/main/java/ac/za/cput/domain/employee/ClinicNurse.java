package ac.za.cput.domain.employee;

import java.util.List;

public class ClinicNurse extends Employee{
    private String position;
    private List<Qualification> qualifications;

    public ClinicNurse() {
    }

    public ClinicNurse(ClinicNurseBuilder builder) {
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

    public static class ClinicNurseBuilder extends Employee.Builder{
        private String position;
        private List<Qualification> qualifications;

        public ClinicNurseBuilder(){
            super();
        }
        public ClinicNurseBuilder position(String postion){
            this.position = postion;
            return this;
        }
        public ClinicNurseBuilder qualifications(List<Qualification> qualifications){
            this.qualifications = qualifications;
            return this;
        }
        @Override
        public Employee build(){
            return new ClinicNurse(this);
        }

        @Override
        public String toString() {
            return "ClinicNurseBuilder{" +
                    "position='" + position + '\'' +
                    ", qualifications=" + qualifications +
                    '}';
        }
    }

}
