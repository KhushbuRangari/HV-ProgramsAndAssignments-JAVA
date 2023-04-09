package inventory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import inventory.model.Products;

public class App {
    public static void main(String[] args) throws Exception {
        Products prdItem = null;
        List<Products> pList = new ArrayList<>();

        String pwd = System.getProperty("user.dir");

        File file = new File("inventory-management/src/resources/inventory.csv");
        Scanner sc = new Scanner(file);

        sc.nextLine();
        while (sc.hasNextLine()) {

            String nextLine = sc.nextLine();
            String[] line = nextLine.split(",");
            int prdQty = Integer.parseInt(line[1]);

            prdItem = new Products(line[0], prdQty, line[2], Double.parseDouble(line[3]));
            pList.add(prdItem);

        }
        sc.close();
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("Menu");
            System.out.println(
                    "1)Product List - View list of all Products\n 2)Product count - View number of quantities available for a specific Product\n3)View Product details – Product Specification, Cost and count available \n 4)Edit Product - Update Product Details\n5)Add New Product Quantities\n6)Delete the Product\n 7) Exit");
            System.out.println("Enter choice :");
            Scanner sc1 = new Scanner(System.in);

            try {
                int choice = sc1.nextInt();
                switch (choice) {
                    case 1:
                        listName(pList);
                        System.out.println("--------------------------------------");
                        System.out.println("\nDo you want to continue Y/N");
                        // String op = sc1.nextLine();
                        // if (op.equalsIgnoreCase("y")) {

                        // }
                        break;
                    case 2:
                        sc = new Scanner(System.in);
                        System.out.println("Enter the product name :");
                        String pName1 = sc.nextLine();
                        showQuantity(pList, pName1);
                        break;
                    case 3:
                        sc = new Scanner(System.in);
                        System.out.println("Enter the product name :");
                        String pName2 = sc.nextLine();
                        viewDetails(pList, pName2);
                        break;
                    case 4:
                        try {
                            sc = new Scanner(System.in);
                            System.out.println("Enter the product name :");
                            String pName3 = sc.nextLine().toUpperCase();
                            System.out.println("Enter the product description :");
                            String pdesc = sc.nextLine();
                            System.out.println("Enter the product cost :");
                            double pcost = sc.nextDouble();
                            System.out.println("Enter the product quantity :");
                            int pqty = sc.nextInt();
                            update(pList, pName3, pdesc, pcost, pqty);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        break;
                    case 5:
                        sc = new Scanner(System.in);
                        System.out.println("Enter the product name to add new product:");
                        String pName4 = sc.nextLine().toUpperCase();
                        System.out.println("Enter the product description :");
                        String pdesc1 = sc.nextLine();
                        System.out.println("Enter the product cost :");
                        double pcost1 = sc.nextDouble();
                        System.out.println("Enter the product quantity :");
                        int pqty1 = sc.nextInt();
                        addNewProduct(pList, pName4, pdesc1, pcost1, pqty1);

                        break;
                    case 6:
                        sc = new Scanner(System.in);
                        System.out.println("Enter the product name :");
                        String pName5 = sc.nextLine().toUpperCase();
                        pList = removeProduct(pList, pName5.toUpperCase());
                        break;
                    case 7:

                        System.exit(0);

                    default:
                        break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    private static void showQuantity(List<Products> pList, String pName) {
        for (Products prd : pList) {

            if (prd.getProductName().equalsIgnoreCase(pName)) {
                System.out.println("\nProduct Name" + " | " + "Product Quantity");
                System.out.println(prd.getProductName() + "           " + prd.getQuantity());
            }
        }

    }

    private static void listName(List<Products> pList) {
        for (Products prd : pList) {

            System.out.println(prd.getProductName());
        }
    }

    public static void viewDetails(List<Products> pList, String pName) {
        for (Products prd : pList) {
            if (prd.getProductName().equalsIgnoreCase(pName)) {
                System.out.println("\nProduct Description" + " | " + "Product Cost" + " | " + "Product Quantity");
                System.out.println(
                        prd.getProductDesc() + "           " + prd.getCost() + "           " + prd.getQuantity());
                break;
            }
        }

    }

    public static void update(List<Products> pList, String pName, String pdesc, double pcost, int pqty) {

        for (Products prd : pList) {
            try {
                if (pName.equalsIgnoreCase(prd.getProductName())) {
                    prd.setProductDesc(pdesc);
                    prd.setCost(pcost);
                    prd.setQuantity(pqty);
                    System.out.println("UPDATED");
                    break;
                }

            } catch (Exception e) {

                System.out.println(e);
            }
            System.out.println(
                    prd.getProductName() + " " + prd.getProductDesc() + " " + prd.getQuantity() + " " + prd.getCost());
        }
    }

    public static void addNewProduct(List<Products> pList, String pName, String pdesc, double pcost, int pqty) {

        Products prd = new Products(pName.toUpperCase(), pqty, pdesc, pcost);
        pList.add(prd);
        System.out.println("Updated list of product is :");
        for (Products prdI : pList) {

            System.out.println(
                    "\n" + prdI.getProductName() + " | " + prdI.getProductDesc() + " | " + prdI.getQuantity() + " | "
                            + prdI.getCost());

        }

    }

    public static List<Products> removeProduct(List<Products> pList, String pName) {
        List<Products> pNewList = new ArrayList<>();
        System.out.println("-------------------------------------------------------");
        for (Products prdI : pList) {
            if (!pName.equalsIgnoreCase(prdI.getProductName()))
                pNewList.add(prdI);

        }
        System.out.println(pName + "Product removed");
        return pNewList;

    }

}
