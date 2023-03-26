//Question 2:   Inventory management System for a Small Electronics Store using Arrays by Khushbu Rangari
//Points: 10
//Skill Mapping: Intermediate

import java.util.Scanner;
import java.util.Arrays;

public class InventoryM {

    //Creating Method to add element to an array.
    public static String[] addX(String arr[], int n, String x) {
        int i;
        // creating new array
        String[] arrNew = new String[n + 1];
        for (i = 0; i < n; i++) {
            arrNew[i] = arr[i];     //copying all the existed element
            arrNew[n] = x;           // adding new element
        }
        return arrNew;
    }

    //Creating method for remving element from array
    public static String[] removeX(String arr[], int n) {
        if (arr == null || n < 0 || n > arr.length) {
            return arr;
        }
        String[] arrNew = new String[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == n) {
                continue;                       //skip the element to be deleted
            }
            arrNew[k++] = arr[i];        // adding all the other elements
        }
        return arrNew;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] productList = { "Laptop", "Camera", "Headphones", "Smart watch" };
        String[] productQty = { "24", "31", "15", "20" };
        String[] productSpec = { "with 12Gen intel Core", "Canon EOS 1500D 24.1MP DSLR", "Boat Airdopes 141 Blutooth",
                "boAt Wave Call Smart" };
        String[] productCost = { "86000", "96000", "8000", "15000" };

        while (true) {
            System.out.println("\n1)Product List - View list of all Products." + "\n"
                    + "2)Product count - View number of quantities available for a specific Product" + "\n"
                    + "3)View Product details – Product Specification, Cost and count available" + "\n"
                    + "4) Edit Product - Update Product Details "
                    + "\n5)Update Inventory - Add/Delete Product Quantities"+"\n6) To Exit.");
            sc = new Scanner(System.in);
            System.out.println("Select the option from 1 to 6 :");
            int input = sc.nextInt();

            switch (input) {
                case (1):
                System.out.println("------Listing All Products-------");
                    for (int i = 0; i < productList.length; i++) {
                        System.out.println((i+1)+") "+productList[i]);
                    }
                    System.out.println("-----------------------");
                    break;
                case (2): {
                    sc = new Scanner(System.in);
                    System.out.println("Enter the product to view the quantity.");
                    String product = sc.nextLine();
                    System.out.println("-----------------------");
                    int index = Arrays.asList(productList).indexOf(product);
                    System.out.println("There are " + productQty[index] + " " + product + " items");
                    System.out.println("-----------------------");
                    break;
                }
                case (3):
                    sc = new Scanner(System.in);
                    System.out.println("Enter the product to view the details.");
                    String product = sc.nextLine();
                    System.out.println("-----------------------");
                    int index = Arrays.asList(productList).indexOf(product);
                    System.out.println(productList[index] + " | " + productQty[index] + " | " + productSpec[index]
                            + " | " + productCost[index]);
                    System.out.println("-----------------------");
                    break;
                case (4):
                    sc = new Scanner(System.in);
                    System.out.println("Enter the product to update the details.");
                    String prod = sc.nextLine();
                    int i = Arrays.asList(productList).indexOf(prod);
                    System.out.println("1) Update quantity" + "\n" + "2) Update Specification" + "\n" + "3) Update Cost");
                    System.out.println("Select option 1 to 3 to update");
                    int option = sc.nextInt();
                    switch (option) {
                        case (1):
                            sc = new Scanner(System.in);
                            System.out.println("There are " + productQty[i] + " " + prod + " items");
                            System.out.println("enter the new quantity ");
                            String qtyToUpdate = sc.nextLine();
                            productQty[i] = qtyToUpdate;
                            System.out.println("There are " + productQty[i] + " " + prod + " items");
                            break;
                        case (2):
                            sc = new Scanner(System.in);
                            System.out.println("The specification of  " + " " + prod + " " + productSpec[i]);
                            System.out.println("enter the new specification ");
                            String specToUpdate = sc.nextLine();
                            productSpec[i] = specToUpdate;
                            System.out.println("The New specification of  " + " " + prod + " " + productSpec[i]);
                            break;
                        case (3):
                            sc = new Scanner(System.in);
                            System.out.println("The cost of  " + " " + prod + " " + productCost[i]);
                            System.out.println("enter the new specification ");
                            String costToUpdate = sc.nextLine();
                            productCost[i] = costToUpdate;
                            System.out.println("The New cost of  " + " " + prod + " " + productCost[i]);

                            break;
                        default: {
                            System.out.println("Not proper input");
                        }
                    }
                    break;
                case (5):
                    System.out.println("Enter the option 1) Add product 2) Delete Product");
                    sc = new Scanner(System.in);
                    int opt = sc.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.print("Add product: ");
                            Scanner sc1 = new Scanner(System.in);
                            String productAdd = sc1.nextLine().toUpperCase();

                            System.out.println("Add product Quantity.");
                            String prdQtyAdd = sc1.nextLine().toUpperCase();

                            System.out.println("Add product Specification.");
                            String prdSpecAdd = sc1.nextLine().toUpperCase();

                            System.out.println("Add product Cost.");
                            String prdCostAdd = sc1.nextLine().toUpperCase();

                            productList = addX(productList, productList.length, productAdd);
                            productQty = addX(productQty, productQty.length, prdQtyAdd);
                            productSpec = addX(productSpec, productSpec.length, prdSpecAdd);
                            productCost = addX(productCost, productCost.length, prdCostAdd);

                            System.out.println("Added product is :");
                            for (int ii = 0; ii < productList.length; ii++) {
                                // if(productList[ii]==productAdd)
                                System.out.println(
                                        productList[ii] + "--------------->" + productQty[ii] + "--------------->"
                                                + productSpec[ii] + "--------------->Rs." + productCost[ii] + "/-");
                            }

                            break;
                        case 2:
                            sc = new Scanner(System.in);
                            System.out.println("Enter the product name to delete.");
                            for (int ii = 0; ii < productList.length; ii++) {

                                System.out.println(
                                        productList[ii] + "--------------->" + productQty[ii] + "--------------->"
                                                + productSpec[ii] + "--------------->Rs." + productCost[ii] + "/-");
                            }
                            String produ = sc.nextLine().toUpperCase();
                            int ind = Arrays.asList(productList).indexOf(produ);

                            productList = removeX(productList, ind);
                            productQty = removeX(productQty, ind);
                            productSpec = removeX(productSpec, ind);
                            productCost = removeX(productCost, ind);
                            System.out.println("******Updated products are :******");
                            for (int ii = 0; ii < productList.length; ii++) {

                                System.out.println(
                                        productList[ii] + "--------------->" + productQty[ii] + "--------------->"
                                                + productSpec[ii] + "--------------->Rs." + productCost[ii] + "/-");
                            }
                            break;
                        default: {

                        }
                    }
                    break;
                case (6):
                    System.exit(0);
                default: {
                    break;
                }
            }

        }

    }

}
