/*Question 3: Best-Selling Cake

Skill Mapping: Basic

Description: Write a program in Java, which will display the details of Best  Selling Product(Cake).

Task 1 - The program should be implemented using Classes and Objects.

Task 2 - Implement a class method to identify the Best Selling Product(Cake). */


package BestSellingProduct_Assign;

class BestSelling {
    Products prd = new Products();

    void bestSold() {
        int max = 0;
        String bestSelling = "";
        System.out.println("\nProducts     |      Quantity Sold");
        System.out.println("------------------------------");
        for (int i = 0; i < prd.getProducts().length; i++) {
            String qtySold = prd.getQuantitySold()[i].replaceAll("[^0-9]", "");
            System.out.println(prd.getProducts()[i] + " -----------" + (Integer.parseInt(qtySold)) + " sold");
            if (max < (Integer.parseInt(qtySold))) {
                max = (Integer.parseInt(qtySold));
                bestSelling = prd.getProducts()[i];
            }
        }
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| The Best Selling product is " + bestSelling+" and quantity sold "+ max+".|");
        System.out.println("|-------------------------------------------------------|");
    }

}

public class Main {

    public static void main(String[] args) {
        BestSelling obs = new BestSelling();
        obs.bestSold();
    }

}
