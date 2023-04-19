/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */

import java.util.Scanner;

public class Order extends dataFetch {
    private Scanner sc = new Scanner(System.in);

    private int itemid;
    private String name;
    private  int quantity;
    private  double price;
    private  int orderID = 100;
   

    private  String dt;
    private   String arr;
    private    boolean flag = false;
    private   String orderStatus;
    int UserId;
    double total;

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

  

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.itemid = id;
    }
    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int incrementOrderID() {
        return orderID++;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean flag) {
        if (flag == true) {
            this.orderStatus = "Approved";
        } else {
            this.orderStatus = "Cancelled";
        }

    }

    public void viewOrder() {
        loadOrderFile();
    }

    public Order(int orderID,String dt, String name, String arr, int id, int quantity, double price, String orderStatus,
            int userId) {
        this.itemid = id;
        this.quantity = quantity;
        this.orderID = orderID;
        this.dt = dt;
        this.arr = arr;
        this.name = name;
        this.orderStatus = orderStatus;
        this.price = price;
        this.UserId = userId;

    }

    public Order() {
    }

    public Order(int orid, String date, String ord, double sum, String status, int userid2) {
        this.orderID=orid;
       
        
        this.orderID = orid;
        this.dt = date;
        this.arr = ord;
       
        this.orderStatus = status;
        this.price = sum;
        this.UserId = userid2;
    }

    @Override
    public String toString() {
        return  itemid+", " + name + ", " + quantity + ", " + price +", "+orderStatus+ " \n"; 
    }

    public int lastLine() {
        addOrderItem();
      
        return (orderItem.get(orderItem.size() - 1).getOrderID());
    }
}
