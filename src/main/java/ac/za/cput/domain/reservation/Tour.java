package ac.za.cput.domain.reservation;

import ac.za.cput.domain.employee.FieldGuide;

import java.util.Set;

public class Tour {
    private int tourId;
    private String siteName;
    private Set<FieldGuide> guides;

    public Tour() {
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Set<FieldGuide> getGuides() {
        return guides;
    }

    public void setGuides(Set<FieldGuide> guides) {
        this.guides = guides;
    }

    public static class Builder{
        private int tourId;
        private String siteName;
        private Set<FieldGuide> guides;

        public Builder(){}

        public Builder tourId(int tourId){
            this.tourId = tourId;
            return this;
        }

        public Builder siteName(String siteName){
            this.siteName = siteName;
            return this;
        }

        public Tour build(){
            return new Tour();
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "tourId=" + tourId +
                    ", siteName='" + siteName + '\'' +
                    ", guides=" + guides +
                    '}';
        }
    }
}
