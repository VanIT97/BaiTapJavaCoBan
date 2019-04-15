package JavaP2.P001.entity;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> listOfEmployee;

    public Department(String departmentName, List<Employee> listOfEmployee) {
        this.departmentName = departmentName;
        this.listOfEmployee = listOfEmployee;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(List<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public void display(){
        System.out.println(this.toString());
    }
}
