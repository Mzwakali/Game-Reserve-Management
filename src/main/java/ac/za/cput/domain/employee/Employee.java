
package ac.za.cput.domain.employee;

import ac.za.cput.domain.gameReserve.GameReserve;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Employee {

    @Id
    private int empId;
    private String firstName;
    private String lastName;
    private String position;
    private int age;
    @OneToMany
    private List<GameReserve> gameReserve;

    public Employee() {
    }

    public Employee(Builder builder) {
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

    public void setGameReserve(List<GameReserve> gameReserve) {
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

    @OneToMany
    public List<GameReserve> getGameReserve() {
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

        public Builder empId( int employeeId) {
            this.employeeId = employeeId;
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

        public Builder position(String postion) {
            this.position = postion;
            return this;
        }

        public Employee build() {
            return new Employee();
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
