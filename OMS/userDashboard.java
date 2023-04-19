/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userDashboard extends dataFetch {
    private static Scanner sc;
    static dataFetch data = new dataFetch();
    static Bill bill = new Bill();

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

        Employee employee = new Employee();
        // Manager mngr = new Manager();
        // Menu menu = new Menu();
        // Order or = new Order();
        // Bill bill = new Bill();

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
                    // addUserName=user.getName();

                    if (flaguser == 3) {
                        System.out.println("Entered incorect username and password 3 times!");
                    }
                    break;
                case 2:
                    flagemp = employee.login();
                    empID = employee.getId();
                    // System.out.println(flagemp);
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
        if (flaguser == 2) {
            viewUserDashboard(userID);

        }

    }

     static void viewUserDashboard(int userID) {
        int ch;
        Scanner sc;
        while (true) {

            System.out.println("\n1)Add new order");
            System.out.println("2)View List of Self Order");
            System.out.println("3)View Specific Order details");
            System.out.println("4)View Self Profile");
            System.out.println("5)Edit Profile");
            System.out.println("6)Exit");
            System.out.print("Enter Choice = ");
            sc = new Scanner(System.in);
           try {
             ch = sc.nextInt();
             switch (ch) {
                case 1:
                    Bill.orderFood(userID);

                    break;
                case 2:
                System.out.println("User ID | NAME | ORDER ID ");
                    for (User ur : userItem) {
                        // System.out.println(userID);
                        if (userID == ur.getUserID()) {
                            System.out.println(ur.getUserID() + ", " + ur.getName() + ", " + ur.getOrderID());
                        }

                    }
                    break;
                case 3:
                    System.out.print("\nEnter the order id :");
                    int orId = sc.nextInt();
                    for(Order or: orderItem)
                    {
                        if(orId==or.getOrderID()){
                            System.out.println(or.getOrderID()+","+or.getArr()+","+or.getDt()+","+or.getPrice()+","+or.getOrderStatus());
                        }
                    }

                    break;
                case 4:
                for (User ur : userItem) {
                  
                    if (userID == ur.getUserID()) {
                        System.out.println(ur.getUserID() + ", " + ur.getName() + ", " + ur.getPhone()+ ", " +ur.getAddress()+ ", " +ur.getMember());
                        break;
                    }

                }
                   break;
                case 5:
                    System.out.println("Enter the new phone no ");
                    String newPhone = sc.next();
                    System.out.println("enter the new address ");
                    String newAdd = sc.next();
                    for(User ur : userItem )
                    {
                        if (userID == ur.getUserID()) {

                            ur.setPhone(newPhone);
                            ur.setAddress(newAdd);
                            System.out.println("Changed details");
                            System.out.println(ur.getUserID() + ", " + ur.getName() + ", " + ur.getPhone()+ ", " +ur.getAddress()+ ", " +ur.getMember());
                            
                            Writer writer;

                            String file = "userData.txt";
                            File temp = new File(file);
                            try {
                                FileWriter fr = new FileWriter(temp, true);
                                writer = new BufferedWriter(fr);
                    
                                    writer.write(ur.getUserID()+ "," +ur.getName()+ "," +ur.getPhone()+ "," +ur.getAddress()+ "," +ur.getUsername()+ "," +ur.getPassword()+ "," +ur.getMember()+ "," +ur.getOrderID()+ "\n");
                    
                                writer.flush();
                                writer.close();
                    
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                            
                            break;
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
               
            }

           } catch (InputMismatchException e) {
                System.out.println("Enter correct input ");
           }
            
                      // sc.close();
        }
    }
}
