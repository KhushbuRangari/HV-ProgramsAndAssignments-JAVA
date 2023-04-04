package EMPLOYEEMANGEMNET.EMS;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Menu{
    public void menuList()
    {
        System.out.println("1)enter the details");
        System.out.println("2)to view employee details");
        System.out.println("3)update detaisl");
        System.out.println("4)Delete the details of employee");

    }
}
class ReadDetails{
    String name;
    String empID;
    String salary;
    String email;

    public void enterDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name = sc.nextLine();
                System.out.print("Enter Employee's ID ----------: ");
        empID = sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email = sc.nextLine();
              System.out.print("Enter Employee contact Info --: ");
        email = sc.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        salary = sc.nextLine();
    }

}

 class Enter{
    void addEmp(){
        Scanner sc = new Scanner(System.in);
        ReadDetails ord = new ReadDetails();
        ord.enterDetails();
        try {
            File file = new File("EMP"+ord.empID+".txt");
            if(file.createNewFile()){
                FileWriter fw = new FileWriter("EMP"+ord.empID+".txt");
               fw.write("EMployee id "+ord.empID+"\nName"+ord.name+"\nEmail"+ord.email+"\nSalary"+ord.salary);
                fw.close();
                sc.close();
                System.out.println("File Created");
            }
            else{
                System.out.println("File Already Exist");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
 }


public class Employee {
  
public static void main(String[] args) {
    Menu om = new Menu();
    om.menuList();
  System.out.println("Please enter choice");
  Scanner sc = new Scanner(System.in);
  int choice  = sc.nextInt();
    switch (choice) {
        case 1:
        Enter enter = new Enter();
        enter.addEmp();
            
            break;
    
        default:
            break;
    }

}
}
