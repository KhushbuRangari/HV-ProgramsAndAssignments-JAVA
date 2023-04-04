package EMPLOYEEMANGEMNET;
public class Main {
    public static void main(String[] args) {
        TechEmp t= new TechEmp("khushbu","11/2/2013",1101,250000);
        t.getShift();
        t.getTechSkills();

        System.out.println(t.getName());
        System.out.println(t.getEmployeeID());
        System.out.println(t.getSalary());
        System.out.println(t.getShift());
        System.out.println(t.getTechSkills());

        

    }
}
