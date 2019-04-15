package JavaP1.P001.ex2.entity;

public class Employee {
    private String firstName;
    private String lastName;
    private Double monthlySalary;

    public Employee(String firstName, String lastName, Double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(Double monthlySalary) {
        if(monthlySalary <= 0.0) {
            this.monthlySalary = 0.0;
        }
        else{
            this.monthlySalary = monthlySalary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }
}
