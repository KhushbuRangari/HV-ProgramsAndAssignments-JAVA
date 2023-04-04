package EMPLOYEEMANGEMNET;

public class EmployeeDetail {
    private String name;
    private String joiningDate;
    private int employeeID;
    private double salary;

    public EmployeeDetail(String eName, String empJD, int empid, double empsal) {
        this.name = eName;
        this.joiningDate = empJD;
        this.employeeID = empid;
        this.salary = empsal;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
