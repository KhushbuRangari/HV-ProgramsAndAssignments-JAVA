/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.util.Scanner;

public class User extends dataFetch {
    private int userID;
    private  String name;
    private  String phone;
    private  String address;
    private  String member;

    private String username;
    private String password;
    private  int orderID;
    private Scanner sc = new Scanner(System.in);

    public User(int userID, String name, String phone, String address, String userName, String password,
            String member, int orderID) {

        this.userID = userID;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.member = member;
        this.username = userName;
        this.password = password;
        this.orderID = orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public User() {
    }

    public void viewUser() {
        loadUserFile();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addOrderID(int idsearch, int newOrderID) {

        for (int i = 0; i < userItem.size(); i++) {

            if (userItem.get(i).getUserID() == idsearch) {

                userItem.get(i).setOrderID(newOrderID);
                userItem.get(i).setName(userItem.get(i).getName());
            }
        }
    }
    public int lastLine() {
        addOrderItem();

        return  (orderItem.get(orderItem.size() - 1).getOrderID());
    }
    public boolean isValidUser(String usernamecheck, String passwordcheck) {
        boolean check = false;
        userFile();
        for (User user : userItem) {
            try {

                if (usernamecheck.equals(user.username)) {

                    if (user.password.equals(passwordcheck)) {
                        userID = user.getUserID();
                        check = true;
                        return check;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return check;
    }

    public int login() {
        int flag = 0;
        String usernames, passwords;
        while (flag < 3) {
            System.out.println("Enter your username to login  ");
            usernames = sc.next();
            System.out.println("Enter your password to login");
            passwords = sc.next();
            boolean log = isValidUser(usernames, passwords);

            if (log) {
                flag = 2;
                break;
            }
            flag++;
        }
        return flag;
    }

}
