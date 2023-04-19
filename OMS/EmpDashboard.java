/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EmpDashboard extends dataFetch {
    private static Scanner sc;
    static dataFetch data = new dataFetch();
    static Bill bill = new Bill();
    static Menu menu = new Menu();
    static Employee employee = new Employee();

    public static void main(String[] args) {
 
        Scanner sc;
        dataFetch data = new dataFetch();
        int load = 1;
        int flaguser = 0;
        int flagemp = 0;

        int userID = 0;
        int empID =0;
        int choice;

        User user = new User();

        Employee emp = new Employee();
    

        sc = new Scanner(System.in);
        System.out.println("\n**********Welcome to TASTY BITES**********\n");

        if (load == 1) {
            load = 0;
            data.menuFile();
            data.employeeFile();
          
            data.userFile();
            data.addOrderItem();
        }

        try {
            System.out.println("1) User Login \n2) Employee Login \n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    flaguser = user.login();

                    userID = user.getUserID();

                    if (flaguser == 3) {
                        System.out.println("Entered incorect username and password 3 times!");
                    }
                    break;
                case 2:
                    flagemp = emp.login();
                    empID = employee.getId();
                  
                    if (flagemp == 3) {
                        System.out.println("Entered incorect username and password 3 times!");
                    }
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Correct Input.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter Correct Input**.");
        }
        // Switch block end
        if (flaguser == 2 || flagemp == 2) {
            System.out.println("Succesful login!!");

        }
        if (flagemp == 2) {
            viewEmpDashboard(userID,empID);

        }

    }

     static void viewEmpDashboard(int userID,int empID)
    {
        Scanner sc;
        while (true) {

            System.out.println("\n1)View Menu");
            System.out.println("2)Edit Menu");
            System.out.println("3)Add New menu");
            System.out.println("4)Create New order");
            System.out.println("5)View Consolidated Collection of the day");
            System.out.println("6)View List of Customer");
            System.out.println("7)View list orders of individual user");
            System.out.println("8)Order specific details");
            System.out.println("9)View Self profile details");
            System.out.println("10)Edit profile");
            System.out.println("11)Exit");
            System.out.print("Enter Choice = ");
            sc = new Scanner(System.in);
            try {
                int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    menu.viewMenu();

                    break;
                case 2:
                    sc = new Scanner(System.in);
                    System.out.println("Enter id");
                    int idsearch = sc.nextInt();

                    System.out.println("enter Item name ");
                    String itemName = sc.next();

                    System.out.println("Enter qty");
                    int qty = sc.nextInt();

                    System.out.println("Enter price");
                    int price = sc.nextInt();
                    menu.editMenuFile(idsearch, itemName, qty, price);

                    data.updateMenuFile();
                    System.out.println("Update Sucessfull");
                    break;
                case 3:
                    menu.addItem();
                    data.updateMenuFile();

                    break;
                case 4:
                    Bill.orderFood(userID);
                    break;
                case 5:
                    double total = 0.0;
                    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    String currentDate = dateFormat.format(date);
                    System.out.println(currentDate);
                    for (Order or : orderItem) {

                        if (currentDate.contains(or.getDt())) {
                            total = total + or.getPrice();
                        }
                    }
                    System.out.println("Consolidated Collection of " + currentDate + " : " + total);
                    break;
                case 6:
                    List<String> arr = new ArrayList<>();

                    for (User ur : userItem) {
                        arr.add(ur.getUserID() + ", " + ur.getName() + ", " + ur.getPhone() + ", " + ur.getAddress()
                                + ", " + ur.getMember() + "\n");

                    }
                    Set<String> uniqueName = new HashSet<String>(arr);
                    System.out.println(uniqueName.toString());

                    break;
                case 7:
                    System.out.println("Enter User id :");
                    int userIDSearch = sc.nextInt();

                    System.out.println("Order ID | MenuID-Qty | Date | Price | Status");
                    for (Order or : orderItem) {
                        if (or.getUserId() == userIDSearch) {

                            if (userIDSearch == or.getUserId()) {
                                System.out.println(or.getOrderID() + " | " + or.getArr() + " | " + or.getDt() + " | "
                                        + or.getPrice() + " | " + or.getOrderStatus());
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Enter Order id :");
                    int orderIDSearch = sc.nextInt();
                    for (Order or : orderItem) {

                        if (orderIDSearch == or.getOrderID()) {
                            System.out.println(
                                    "\n" + or.getOrderID() + "," + or.getArr() + "," + or.getDt() + "," + or.getPrice()
                                            + "," + or.getOrderStatus());
                        }
                    }

                    break;
                case 9:
                    System.out.println("enter Id ");
                    int idEmpSearch = sc.nextInt();
                    for (Employee emp : employees) {
                        if (idEmpSearch == emp.getId()) {
                            System.out.println("" + emp.getId() + "," + emp.getName() + "," + emp.getShift() + ","
                                    + emp.getContact() + "");
                        }
                    }

                    break;
                case 10:
                    sc = new Scanner(System.in);
                    System.out.println("Enter id");
                    int idempsearch = sc.nextInt();

                    System.out.println("enter employee name ");
                    String empName = sc.next();

                    System.out.println("Enter shift");
                    int shift = sc.nextInt();

                    System.out.println("Enter contact");
                    String contact = sc.next();
                    employee.editEmpFile(idempsearch, empName, shift, contact);
                    employee.updateEmpFile();

                case 11:
                    System.exit(0);
                    break;

            }
            } catch (InputMismatchException e) {
                System.out.println("Enter correct input");
            }
           //  sc.close();
        }
    }

  

}
