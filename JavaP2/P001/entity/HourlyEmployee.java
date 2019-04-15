package JavaP2.P001.entity;

public class HourlyEmployee extends Employee {
    @Override
    public void display() {
        System.out.println(this.toString() + super.toString());
    }
    private double wage;
    private double workingHours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String ssn, String firstName, String lastName, double wage, double workingHours) {
        super(ssn, firstName, lastName);
        this.wage = wage;
        this.workingHours = workingHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
