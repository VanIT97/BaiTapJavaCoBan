package JavaP1.P001.ex2.entity.main;

import JavaP1.P001.ex2.entity.Employee;

public class Test {
    public static void main(String[] args){
        Employee a = new Employee("Do", "Van", 1000.22);
        Employee b = new Employee("Do", "Trang", 1200.00);
        System.out.println(a.toString() +"\n" + b.toString());

        a.setMonthlySalary(a.getMonthlySalary()*1.1);
        b.setMonthlySalary(b.getMonthlySalary()*1.1);

        System.out.println(a.toString() +"\n" + b.toString());
    }
}
