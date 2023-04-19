
/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Bill extends dataFetch {
    static double price = 0.0;
    static double sum = 0.0;
    static double total = 0.0;
    static double discount = 0.0;
    static double subtotal = 0.0;
    static double sgst, cgst = 0.0;
    static int orderId = 0;
    static String arr = "";
    static List<String> currOrder = new ArrayList<>();
    static Menu menu = new Menu();
    static dataFetch data = new dataFetch();

    public static void orderFood(int userID) {

        int id = 0;
        String productName = null;
        int qty = 0;

        // double gst, cgst, subtotal = 0, discount = 0.0;
        boolean flag = false;
        char choice = '\0';

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dt = dateFormat.format(date);
        String orderStatus = "";
        // data.menuFile();

        data.userFile();
        // generateOrderID();
        // System.out.println("\t\t\t\t--------------------Invoice-----------------");
        // System.out.println("\t\t\t\t\t\t " + " " + "Tasty Bites");
        // System.out.println("\t\t\t\t\tShop no 4 ,opposite Axis Bank");

        Scanner sc = new Scanner(System.in);

        for (User user : userItem) {
            if (userID != user.getUserID()) {

                continue;

            } else {
                System.out.println(
                        "\n\t\t\t\t*************************************************\n\t\t\t\t******** WELCOME "
                                + user.getName()
                                + " to TASTY BITES********\n\t\t\t\t*************************************************\n");
                break;

            }

        }

        List<Order> addedProduct = new ArrayList<Order>();
        menu.viewMenu();

        addedProduct.clear();
        arr = "";
        System.out.println("\n1)Add new order");

        do {

            System.out.println("Enter the product details: ");
            System.out.print("Product ID: ");
            id = sc.nextInt();
            System.out.print("Quantity: ");
            qty = sc.nextInt();

            for (Menu mn : menuItem) {
                if (id == mn.getId()) {
                    productName = mn.getName();
                    price = mn.getPrice();
                    sum = price * qty;
                    total = total + sum;
                    break;
                }
                // System.out.println(total);
            }
            for (Order or : orderItem) {

                orderId = or.getOrderID();
            }
            arr += ' ' + (id + "-" + qty);
            currOrder.add(id + "," + productName + "," + qty + "," + price + ", " + sum + "\n");

            System.out.print("Want to add more items? (y or n): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'y' || choice == 'Y');
        addedProduct
                .add(new Order(orderId, dt, productName, arr.trim(), id, qty, total, orderStatus, userID));

        System.out.println("\nPress Y to CONFIRM the order or N for CANCEL the order: ");
        String check = sc.next();
        flag = checkOrderStatus(flag, dt, productName, id, qty, orderStatus, userID, addedProduct, arr,
                check);

        if (flag == true) {
            System.out.println("\t\t\t**********************************************************");
            System.out.println("\t\t\t\t\t\t***TASTY BITES***\t\t\t");
            System.out.println("\t\t\t**********************************************************");
            for (Order or : addedProduct) {

                System.out.println("\t\t\tDate:" + dt + "\t\t\t\tOrder ID: " + or.getOrderID()+"\n");
                System.out.println("\t\t\tProduct Id|Name|Quantity|Price|Total");

                for (int i = 0; i < currOrder.size(); i++) {
                    System.out.println("\t\t\t" + currOrder.get(i));
                }

                System.out.println("\t\t\t**********************************************************");

                // Calculating Discount
                if (total > 2000 && total<5000) {
                    discount = total * 15 / 100;
                    System.out.println("\n\t\t\tJumbo Coupon applied (15%)\t\tDiscount(Rs.):" + discount);
                    // total amount after applying discount
                    subtotal = total - discount;
                    sgst = total * (12 / 100);
                    cgst = total * (12 / 100);

                    System.out.println("\n\t\t\t\t\t\t\t   SGST (12%)  " + (sgst));
                    System.out.println("\n\t\t\t\t\t\t\t   CGST (12%))  " + (cgst));
                    System.out.println("\n\t\t\t\t\t\t\t   TOTAL (Rs.) " + (subtotal + sgst + cgst));
                }
                else  if (total > 5000) {
                    discount = total * 10 / 100;
                    System.out.println("\n\t\t\tPremium Customer (10%)\t\tDiscount(Rs.):" + discount);
                    // total amount after applying discount
                    subtotal = total - discount;
                    sgst = total * (12 / 100);
                    cgst = total * (12 / 100);

                    System.out.println("\n\t\t\t\t\t\t\t   SGST (12%)  " + (sgst));
                    System.out.println("\n\t\t\t\t\t\t\t   CGST (12%))  " + (cgst));
                    System.out.println("\n\t\t\t\t\t\t\t   TOTAL (Rs.) " + (subtotal + sgst + cgst));
                } else {
                    subtotal = total;
                    sgst = total * (12 / 100);
                    cgst = total * (12 / 100);

                    System.out.println("\n\t\t\t\t\t\t\t   SGST (12%)  " + (sgst));
                    System.out.println("\n\t\t\t\t\t\t\t   CGST (12%))  " + (cgst));
                    System.out.println("\n\t\t\t\t\t\t\t   TOTAL (Rs.) " + (subtotal + sgst + cgst));

                }
                System.out.println("\t\t\t**********************************************************");
                break;
            }
        }

        System.out.print("\n\t\t\t\t\t\t***THANKYOU FOR VISITING***  \n\n");

        // sc.close();

    }

    private static boolean checkOrderStatus(boolean flag, String dt, String productName, int id, int qty,
            String orderStatus, int userID,
            List<Order> addedProduct,
            String arr,
            String check) {
        if (!check.equalsIgnoreCase("Y")) {
            System.out.println("Your order is cancelled successfully! ");

            total = 0.0;
            arr = "";
            // addedProduct
            // .add(new Order(orderId, dt, productName, arr.trim(), id, qty, total,
            // orderStatus, userID));

            loadOrderTemp(addedProduct, userID, flag);

        } else if (check.equalsIgnoreCase("y")) {
            System.out.println("\t\t\t ****YOUR ORDER IS CONFIRMED****\n");
            flag = true;

            loadOrderTemp(addedProduct, userID, flag);
        }
        return flag;
    }

    private static int generateOrderID(List<Order> addedProduct) {
        data.addOrderItem();

        for (Order ord : addedProduct) {
            int lastordID = ord.lastLine();
            ord.setOrderID(lastordID + 1);
            return ord.getOrderID();
        }
        return -1;

    }

  
    private static void loadOrderTemp(List<Order> addedProduct, int userID,
            boolean flag) {
        Writer writer;
        Writer writer1;

        // String tempFileName = "orderdTest.txt";
        File temp = new File("orderdTest.txt");
        File userF = new File("userData.txt");

        double total = 0.0;
        int newOrdId = 0;
        int newUserId = userID;
        newOrdId = generateOrderID(addedProduct);

        try {

            FileWriter fr = new FileWriter(temp, true);
            writer = new BufferedWriter(fr);

            for (Order ord : addedProduct) {
                total = total + ord.getPrice();

            }

            for (Order or1 : addedProduct) {

                or1.setOrderStatus(flag);
                or1.setUserId(newUserId);
         
                or1.setPrice(total);
                writer.write((or1.getOrderID()) + "," + or1.getDt() + "," + or1.getArr() + "," + or1.getPrice() + ","
                        + or1.getOrderStatus() + "," + or1.getUserId() + "\n");
                // }
                break;
            }
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            newUserId = (userItem.get(userItem.size() - 1).getOrderID()) + 1;

            FileWriter userFr = new FileWriter(userF, true);
            writer1 = new BufferedWriter(userFr);

            for (User user : userItem) {
                {

                    if(total>5000){
                        user.setMember("PRIME");
                    }
                    user.setOrderID(newOrdId);

                    if (userID == user.getUserID()) {
                        // user.setOrderID(newOrdId + 1);
                        writer1.write(user.getUserID() + "," + user.getName() + "," + user.getPhone() + ","
                                + user.getAddress() + "," + user.getUsername() + "," + user.getPassword() + ","
                                + user.getMember() + "," + user.getOrderID() + "\n");
                        break;
                    }

                }

            }

            writer1.flush();
            writer1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    // public static void main(String[] args) {
    //     // data.menuFile();
    //     // data.orderDetailsMethod();
    //     // orderFood();

    //     // Bill b = new Bill();
    //     // b.generateOrderID();
    //     // orderDetails o = new orderDetails();
    //     // o.lastLine();

    //     Scanner sc;
    //     dataFetch data = new dataFetch();
    //     int load = 1;
    //     int flaguser = 0;
    //     int flagemp = 0;

    //     int userID = 0;
    //     int choice;

    //     User user = new User();

    //     Employee emp = new Employee();
    //     // Manager mngr = new Manager();
    //     // Menu menu = new Menu();
    //     // Order or = new Order();
    //     // Bill bill = new Bill();
    //     String addUserName = "";

    //     sc = new Scanner(System.in);
    //     System.out.println("\n**********Welcome to TASTY BITES**********\n");

    //     if (load == 1) {
    //         load = 0;
    //         data.menuFile();
    //         data.employeeFile();

    //         data.userFile();
    //         // data.orderDetailsMethod();
    //     }

    //     try {
    //         System.out.println("1) User Login \n2) Employee Login \n");
    //         // System.out.println("Press 1 if you are Manager else press 2");
    //         // System.out.println("Press 3 if you are new manager");
    //         choice = sc.nextInt();

    //         switch (choice) {
    //             case 1:
    //                 flaguser = user.login();

    //                 userID = user.getUserID();
    //                 // addUserName=user.getName();

    //                 if (flaguser == 3) {
    //                     System.out.println("Entered incorect username and password 3 times!");
    //                 }
    //                 break;
    //             case 2:
    //                 flagemp = emp.login();
    //                 // System.out.println(flagemp);
    //                 if (flagemp == 3) {
    //                     System.out.println("Entered incorect username and password 3 times!");
    //                 }
    //                 break;
    //         }
    //     } catch (InputMismatchException e) {
    //         System.out.println("Enter Correct Input.");
    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Enter Correct Input**.");
    //     }
    //     // Switch block end
    //     if (flaguser == 2 || flagemp == 2) {
    //         System.out.println("Succesful login!!");

    //     }

    //     if (flaguser == 2) {

    //         orderFood(userID);
    //     }
    //     sc.close();
    // }
}
