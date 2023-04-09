package electronic.products;

public class Mobile {

    private String manufacturer;
    private String os;
    public String model;
    private int price;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Mobile(String manufacturer, String os, String model, int price) {
        this.manufacturer = manufacturer;
        this.os = os;
        this.model = model;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + ((os == null) ? 0 : os.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
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
        Mobile other = (Mobile) obj;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (os == null) {
            if (other.os != null)
                return false;
        } else if (!os.equals(other.os))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Mobile [manufacturer=" + manufacturer + ", os=" + os + ", model=" + model + ", price=" + price + "]";
    }

    public static class Samsung extends Mobile {

        public Samsung(String os, String model, int price) {
            super("Samsung", os, model, price);
        }
    
        public String getModel() {
            return "This is Android Mobile- " + model;
        }
    
    }
    
    public static class Nokia extends Mobile {
    
        public Nokia(String os, String model, int price) {
            super("Nokia", os, model, price);
        }
    
        public String getModel() {
            return "This is Android Mobile- " + model;
        }
    
    }
}



