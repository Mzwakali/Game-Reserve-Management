package ac.za.cput.domain.request;

import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.gameReserve.GameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class NewEmployee {

    @Id
    private int empId;
    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private Set<GameReserve> gameReserve;

    public NewEmployee() {
    }

    public NewEmployee(NewEmployee.Builder builder) {
        this.empId = builder.employeeId;
        this.age = builder.age;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.position = builder.position;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGameReserve(Set<GameReserve> gameReserve) {
        this.gameReserve = gameReserve;
    }

    public int getEmpId() {
        return empId;
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

    public String getPosition() {
        return position;
    }

    public static class Builder {

        private String  firstName, lastName, position;
        private int employeeId, age;
        private Set<GameReserve> gameReserve;

        public Builder() {
        }

        public NewEmployee.Builder empId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public NewEmployee.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public NewEmployee.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public NewEmployee.Builder age(int age) {
            this.age = age;
            return this;
        }

        public NewEmployee.Builder position(String postion) {
            this.position = postion;
            return this;
        }

        public NewEmployee build() {
            return new NewEmployee();
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "employeeId='" + employeeId + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", position='" + position + '\'' +
                    ", age=" + age +
                    ", gameReserve=" + gameReserve +
                    '}';
        }


    }
}
