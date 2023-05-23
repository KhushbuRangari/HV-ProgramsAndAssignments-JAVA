


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeInterface emp = new EmployeeImpl();

        System.out.println("Welcome to EMS");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1) Add Employee");

            System.out.println("2) show all Employee");

            System.out.println("3) show single Employee");

            System.out.println("4) update Employee");

            System.out.println("5) delete Employee");
            System.out.println("Enter the choice`");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:

                    Employee e = new Employee();
                    System.out.println("enter id ");
                    int id = sc.nextInt();
                    System.out.println("enter first name");
                    String fname = sc.next();
                    System.out.println("enter last name");
                    String lname = sc.next();
                    System.out.println("Enter job");
                    String job = sc.next();
                    System.out.println("Enter manager");
                    String Manager = sc.next();
                    System.out.println("enter Hire date YYYY-MM-DD");
                    String Hiredate = sc.next();
                    System.out.println("Enter Salary");
                    int salary = sc.nextInt();
                    System.out.println("enter Commision");
                    int commission = sc.nextInt();
                    System.out.println("Enter department code");
                    int DeptCode = sc.nextInt();

                    e.setEmpCode(id);  
                    e.setEmpFName(fname);
                    e.setEmpLName(lname);
                    e.setJob(job);
                    e.setManager(Manager);
                    e.setHiredate(Hiredate);
                    e.setSalary(salary);
                    e.setCommission(commission);
                    e.setDeptCode(DeptCode);

                    emp.createEmp(e);
                    break;
                case 2:
                    emp.showAllEmp();

                    break;
                case 3:
                    System.out.println("enter Employee id ");
                    int empid = sc.nextInt();
                    emp.ShowEmp(empid);
                    break;
                case 4:
                System.out.println("enter the id to update ");
                int empid2 = sc.nextInt();
                System.out.println("enter the first name to update");
                String fname1= sc.next();
                System.out.println("enter the last name to update");
                String lname1= sc.next();
                 emp.updateEmp(empid2, fname1, lname1);
                break;
                case 5:
                    System.out.println("enter Employee id to delete. ");
                    int empid1 = sc.nextInt();
                    emp.deleteEmp(empid1);
                case 6:
                    System.out.println("Thankyou for visiting !!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid Choice");
                    break;
            }

        } while (true);
    }
}
