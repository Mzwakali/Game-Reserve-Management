package ac.za.cput.domain.Employee;

public class FieldGuide {

    private int guideId;
    private String firstName, lastName, title;

    public FieldGuide() {
    }

    public FieldGuide(Builder builder) {
        this.firstName = builder.firstName;
    }

    public FieldGuide setFirstName(String firstName) {
        this.firstName = firstName;
        return null;
    }

    public static class Builder {
        private int guideId;
        private String firstName;

        public Builder visitorId(int guideId){
            this.guideId = guideId;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
    }
}




