package JavaP2.P001.entity;

public class SalariedEmployee extends Employee {
    private double commisionRate;
    private double grossSales;
    private double basicSalary;

    public SalariedEmployee() {
    }

    @Override
    public void display() {
        System.out.println(this.toString() + super .toString());
    }

    public SalariedEmployee(String ssn, String firstName, String lastName, double commisionRate, double grossSales, double basicSalary) {
        super(ssn, firstName, lastName);
        this.commisionRate = commisionRate;
        this.grossSales = grossSales;
        this.basicSalary = basicSalary;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
