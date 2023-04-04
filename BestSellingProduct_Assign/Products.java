package BestSellingProduct_Assign;

public class Products {
    
    String[] products = {"Bread","Cupcake","Apple Sauce","Cake"};
    String[] quantitySold = {"B_20","Cc_18","A_35","C_65"};
    public String[] getProducts() {
        return products;
    }
    public void setProducts(String[] products) {
        this.products = products;
    }
    public String[] getQuantitySold() {
        return quantitySold;
    }
    public void setQuantitySold(String[] quantitySold) {
        this.quantitySold = quantitySold;
    }
    public Products(String[] products, String[] quantitySold) {
        this.products = products;
        this.quantitySold = quantitySold;
    }
    public Products() {
    }
   
    
}
