
/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner sc;
    static dataFetch data = new dataFetch();
    static Bill bill = new Bill();
    static Menu menu = new Menu();
    static Employee employee = new Employee();
    static EmpDashboard empdash = new EmpDashboard();
    static userDashboard userdash = new userDashboard();

    public static void main(String[] args) {

        Scanner sc;
        dataFetch data = new dataFetch();
        int load = 1;
        int flaguser = 0;
        int flagemp = 0;

        int userID = 0;
        int empID = 0;
        int choice;

        User user = new User();
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
                    flagemp = employee.login();
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
            EmpDashboard.viewEmpDashboard(userID, empID);

        }
        if (flaguser == 2) {
            userDashboard.viewUserDashboard(userID);
        }

    }

}
