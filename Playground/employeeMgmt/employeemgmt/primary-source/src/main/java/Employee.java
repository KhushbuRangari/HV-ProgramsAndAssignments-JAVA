
import java.sql.Date;

/**
 * Employee
 */
public class Employee {

    private int EmpCode;
    private String EmpFName;
    private String EmpLName;
    private String job;
    private String Manager;
    private String Hiredate;
    private int salary;
    private int commission;
    private int DeptCode;

    
    public Employee() {
    }
    
    public Employee(int empCode, String empFName, String empLName, String job, String manager, String hiredate,
            int salary, int commission, int deptCode) {
        EmpCode = empCode;
        EmpFName = empFName;
        EmpLName = empLName;
        this.job = job;
        Manager = manager;
        Hiredate = hiredate;
        this.salary = salary;
        this.commission = commission;
        DeptCode = deptCode;
    }
    public int getEmpCode() {
        return EmpCode;
    }
    public void setEmpCode(int empCode) {
        EmpCode = empCode;
    }
    public String getEmpFName() {
        return EmpFName;
    }
    public void setEmpFName(String empFName) {
        EmpFName = empFName;
    }
    public String getEmpLName() {
        return EmpLName;
    }
    public void setEmpLName(String empLName) {
        EmpLName = empLName;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getManager() {
        return Manager;
    }
    public void setManager(String manager) {
        Manager = manager;
    }
    public String getHiredate() {
        return Hiredate;
    }
    public void setHiredate(String hiredate) {
        Hiredate = hiredate;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getCommission() {
        return commission;
    }
    public void setCommission(int commission) {
        this.commission = commission;
    }
    public int getDeptCode() {
        return DeptCode;
    }
    public void setDeptCode(int deptCode) {
        DeptCode = deptCode;
    }

    @Override
    public String toString() {
        return "Employee [EmpCode=" + EmpCode + ", EmpFName=" + EmpFName + ", EmpLName=" + EmpLName + ", job=" + job
                + ", Manager=" + Manager + ", Hiredate=" + Hiredate + ", salary=" + salary + ", commission="
                + commission + ", DeptCode=" + DeptCode + "]";
    }



}