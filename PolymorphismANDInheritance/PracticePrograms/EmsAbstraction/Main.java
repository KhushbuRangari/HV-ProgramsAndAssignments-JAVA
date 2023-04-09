package EmsAbstraction;

public class Main {
    public static void main(String[] args) {
        EmpDetails emp = new EmpDetails("Khushbu", "24-JAN-2024", 1001, 22000, 0, "Software",
        250, "Tuesday",89.99);

        System.out.println(emp.getName());
        System.out.println(emp.getEmployeeID());
        System.out.println(emp.getSalary());
        System.out.println(emp.getShift());
        System.out.println(emp.getTechSkills());
    }
}
