package ac.za.cput.domain.GameReserve;

public class Clinic {

    private int clinicId;
    private String clinicName;

    public Clinic() {
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

    @Override
    public String toString() {
        return "Clinic{" +
                "clinicId=" + clinicId +
                ", clinicName='" + clinicName + '\'' +
                '}';
    }
}
