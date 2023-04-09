package electronic.products.base;

public class Products {
    private String productName;
    private Object productType;
    private int quantity;
    private String productDesc;
    private double cost;

    public Products(String productName, int quantity, String productDesc, double cost, Object productType) {
        this.productName = productName;
        this.quantity = quantity;
        this.productDesc = productDesc;
        this.cost = cost;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }
   
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Object getProductType() {
        return productType;
    }

    public void setProductType(Object productType) {
        this.productType = productType;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((productType == null) ? 0 : productType.hashCode());
        result = prime * result + quantity;
        result = prime * result + ((productDesc == null) ? 0 : productDesc.hashCode());
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
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
        if (productType == null) {
            if (other.productType != null)
                return false;
        } else if (!productType.equals(other.productType))
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
        return "Products [productName=" + productName + ", productType=" + productType + ", quantity=" + quantity
                + ", productDesc=" + productDesc + ", cost=" + cost + "]";
    }

}