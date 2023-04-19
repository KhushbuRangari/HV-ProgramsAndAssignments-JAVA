import java.util.Scanner;

/**
 *  ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI 
 * Menu 
 */
public class Menu extends dataFetch {

    private int id;
    private  String name;
    private  double price;
    private  int qty;
    private static Scanner sc = new Scanner(System.in);

    public Menu(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;

    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Menu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("\tID: " + this.getId() + " Item: " + this.getName() + " Price=" + this.getPrice()
                + "\t\n");
    }

    public void viewMenu() {
        loadMenuFile();

    }

    public void viewUser() {
        loadUserFile();

    }

    public void addItem() {
        Menu mn = new Menu();
        System.out.println("Add item details like id ,name quantity,price");

        System.out.println("Enter ID");
        mn.setId(sc.nextInt());
        System.out.println("Enter name");
        String nc = sc.next();
        mn.setName(nc);
        System.out.println("Enter quantity");
        mn.setQty(sc.nextInt());
        System.out.println("Enter price");
        mn.setPrice(sc.nextDouble());
        if (search(mn.getId()) != -1) {
            System.out.println("please enter unique id");
            addItem();
        }
        menuItem.add(mn);
    }

    public void editMenuFile(int idsearch, String name, int qty, double price) {
        // Menu m = new Menu();
        for (int i = 0; i < menuItem.size(); i++) {
            // System.out.println(menuItem.get(i).getId());
            if (menuItem.get(i).getId() == idsearch) 
            {
                menuItem.get(i).setId(idsearch);
                menuItem.get(i).setName(name);
                menuItem.get(i).setQty(qty);
                menuItem.get(i).setPrice(price);
            }
        }

    }
}