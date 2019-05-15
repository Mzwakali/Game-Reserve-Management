package ac.za.cput.domain.visitor;

import ac.za.cput.domain.employee.FieldGuide;

public class Visitor {

    private int visitorId;
    private String firstName, lastName, cellphone;
    private FieldGuide guide;

    public Visitor(Builder builder) {
    }

    public Visitor(int visitorId, String firstName, String lastName, String cellphone, FieldGuide guide) {
       this.visitorId = visitorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.guide = guide;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public FieldGuide getGuide() {
        return guide;
    }

    public void setGuide(FieldGuide guide) {
        this.guide = guide;
    }

    public static class Builder{

        private int visitorId;
        private String firstName, lastName, cellphone;
        private String guide;

        public Builder visitorId(int visitorId){
            this.visitorId = visitorId;
            return this;
        }
        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder cellphone(String cellphone){
            this.cellphone = cellphone;
            return this;
        }
        public Builder guide(String guide){
            this.guide = guide;
            return this;
        }

        public Visitor build(){
            return new Visitor(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", cellphone='" + cellphone + '\'' +
                    ", guide=" + guide +
                    '}';
        }
    }
}
