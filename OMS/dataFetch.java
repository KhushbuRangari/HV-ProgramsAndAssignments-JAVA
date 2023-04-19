import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;


/**
 *  ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI 
 * dataFetch
 */
public class dataFetch {

    public static final ArrayList<Menu> menuItem = new ArrayList<Menu>();
    public static final ArrayList<Employee> employees = new ArrayList<Employee>();
    public static final ArrayList<Order> orderItem = new ArrayList<Order>();
    public static final ArrayList<User> userItem = new ArrayList<User>();

    public void loadMenuFile() {

       
        System.out.println(menuItem);
    }

    public void loadEmpFile() {

        System.out.println(employees);

    }

    public void loadOrderFile() {

        System.out.println(orderItem);

    }
    public void loadUserFile() {

        System.out.println(userItem);

    }


    int search(int id) {
        for (int i = 0; i < menuItem.size(); i++) {
            if (menuItem.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    int searchOrderid(int id) {
        for (int i = 0; i < orderItem.size(); i++) {
            if (orderItem.get(i).getOrderID() == id) {
                return i;
            }
        }
        return -1;
    }


    int searchUserid(int id) {
        for (int i = 0; i < orderItem.size(); i++) {
            if (orderItem.get(i).getUserId() == id) {
                return 1;
            }
        }
        return -1;
    }



    void menuFile() {
        try {
            FileReader file = new FileReader("menu.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            // System.out.println(line);
            while (line != null) {
                String[] arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String qty1 = arr[2];
                String qty = qty1.replaceAll("[^0-9]", "");
                String price = arr[3];
                // System.out.println(Arrays.toString(arr));
                Menu mt = new Menu(Integer.parseInt(id), name, Integer.parseInt(qty), Double.parseDouble(price));
                menuItem.add(mt);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void employeeFile() {
        try {
            FileReader file = new FileReader("employee.csv");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {
                String[] arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String shift = arr[2];
                String phone = arr[3];
                String username = arr[4];
                String password = arr[5];

                // System.out.println(Arrays.toString(arr));
                Employee ep = new Employee(Integer.parseInt(id), name, Integer.parseInt(shift), phone, username,
                        password);
                employees.add(ep);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateUserFile() {
        Writer writer;

        String tempFileName = "userData.txt";
        File temp = new File(tempFileName);
        try {
            FileWriter fr = new FileWriter(temp, true);
            writer = new BufferedWriter(fr);

            for (User user : userItem) {

                writer.write(user.getUserID()+ "," +user.getName()+ "," +user.getPhone()+ "," +user.getAddress()+ "," +user.getUsername()+ "," +user.getPassword()+ "," +user.getMember()+ "," +user.getOrderID()+ "\n");

            }
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void userFile() {
        try {
            FileReader file = new FileReader("userData.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();

            while (line != null) {
                String[] arr = line.split(",");
                String id = arr[0];
                String name = arr[1];
                String phone = arr[2];
                String address = arr[3];
                String username = arr[4];
                String password = arr[5];
                String member = arr[6];
                String orderID = arr[7];

                // System.out.println(Arrays.toString(arr));
                User user = new User(Integer.parseInt(id), name, phone,address,username,password,member, Integer.parseInt(orderID));
                     
                userItem.add(user);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    

    public void updateEmpFile() {
        Writer writer;

        String tempFileName = "datafile.txt";
        File temp = new File(tempFileName);
        try {
            FileWriter fr = new FileWriter(temp);
            writer = new BufferedWriter(fr);

            for (Employee emp : employees) {
                writer.write(emp.getId() + "," + emp.getName() + "," + emp.getShift() + "," + emp.getContact() + ","
                        + emp.getUsername() + "," + emp.getPassword() + "\n");

            }
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        File delF = new File("employee.csv");
        delF.delete();
        File newF = new File("employee.csv");
        temp.renameTo(newF);
    }

    public void updateMenuFile() {
        Writer writer;

        String tempFileName = "data.csv";
        File temp = new File(tempFileName);
        try {
            FileWriter fr = new FileWriter(temp, true);
            writer = new BufferedWriter(fr);

            for (Menu mn : menuItem) {

                writer.write(mn.getId() + "," + mn.getName() + "," + mn.getQty() + "," + mn.getPrice() + "\n");

            }
            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        File delF = new File("menu.csv");
        delF.delete();
        File newF = new File("menu.csv");
        temp.renameTo(newF);

    }
  public  void addOrderItem() {
        try {
            FileReader file = new FileReader("orderdTest.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
             //System.out.println(line);
            while (line != null) {
                String[] arr = line.split(",");
                int orid = Integer.parseInt(arr[0]);
                String date = arr[1];
                String ord = arr[2];
                double sum = Double.parseDouble(arr[3]);
                String status = arr[4];
                int userid = Integer.parseInt(arr[5]);
                // System.out.println(Arrays.toString(arr));
                Order order = new Order( orid, date, ord,  sum,  status,  userid) ;
                orderItem.add(order);

                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   
}