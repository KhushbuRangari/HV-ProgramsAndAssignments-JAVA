package inventory.model;

public class Products {
    private String productName;
    private int quantity;
    private String productDesc;
    private double cost;

    public Products(String productName, int quantity, String productDesc, double cost) {
        this.productName = productName;
        this.quantity = quantity;
        this.productDesc = productDesc;
        this.cost = cost;
    }
  

    public String getProductName() {
        return productName;
    }
   

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Products other = (Products) obj;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        if (quantity != other.quantity)
            return false;
        if (productDesc == null) {
            if (other.productDesc != null)
                return false;
        } else if (!productDesc.equals(other.productDesc))
            return false;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return productName + " " + quantity + " " + productDesc
                + " " + cost;
    }

}
