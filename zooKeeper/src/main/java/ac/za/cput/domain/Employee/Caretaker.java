package ac.za.cput.domain.Employee;

import ac.za.cput.domain.GameReserve.GameReserve;

import java.util.Set;

public class Caretaker {

    private int careTakerId;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int age;
    private Set<GameReserve> gameReserve;

    public Caretaker() {
    }

    public Caretaker(Builder builder) {
        this.careTakerId = builder.careTakerId;
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobTitle = builder.jobTitle;
    }

    public void setCareTakerId(int careTakerId) {
        this.careTakerId = careTakerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGameReserve(Set<GameReserve> gameReserve) {
        this.gameReserve = gameReserve;
    }

    public int getCareTakerId() {
        return careTakerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Set<GameReserve> getGameReserve() {
        return gameReserve;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public static class Builder {

        private String  firstName, lastName, jobTitle;
        private int careTakerId, age;
        private Set<GameReserve> gameReserve;

        public Builder() {
        }

        public Builder keeperId( int keeperId) {
            this.careTakerId = keeperId;
            return this;
        }

        public Builder firstName( String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName( String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Builder jobTitle( String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Caretaker build() {
            return new Caretaker();
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "careTakerId='" + careTakerId + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", age=" + age +
                    ", gameReserve=" + gameReserve +
                    '}';
        }
    }


}
