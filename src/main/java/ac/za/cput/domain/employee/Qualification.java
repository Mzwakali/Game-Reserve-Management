package ac.za.cput.domain.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Qualification {

    @Id
    private int qualificationId;
    private String qualificationName;
    private String instituteName;

    public Qualification() {
    }
    public Qualification(QualificationBuilder builder){

        this.qualificationId = builder.qualificationId;
        this.qualificationName = builder.qualificationName;
        this.instituteName = builder.instituteName;

    }

    public int getQualifictionId() {
        return qualificationId;
    }

    public void setQualifictionId(int qualificationId) {
        this.qualificationId = qualificationId;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
    public static class QualificationBuilder {

        private int qualificationId;
        private String qualificationName;
        private String instituteName;

        public QualificationBuilder() {

        }

        public QualificationBuilder qualificationId(int qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }

        public QualificationBuilder qualificationName(String qualificationName) {
            this.qualificationName = qualificationName;
            return this;
        }

        public QualificationBuilder instituteName(String instituteName) {
            this.instituteName = instituteName;
            return this;
        }

        public Qualification build() {
            return new Qualification(this);
        }


        @Override
        public String toString() {
            return "QualificationBuilder{" +
                    "qualificationId=" + qualificationId +
                    ", qualificationName='" + qualificationName + '\'' +
                    ", instituteName='" + instituteName + '\'' +
                    '}';
        }
    }
}
