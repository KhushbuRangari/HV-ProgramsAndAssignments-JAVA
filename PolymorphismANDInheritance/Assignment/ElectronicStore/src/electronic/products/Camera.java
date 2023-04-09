package electronic.products;

public class Camera {
    private String manufacturer;
    private String megapixel;
    public String model;
    private int price;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(String megapixel) {
        this.megapixel = megapixel;
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

    public Camera(String manufacturer, String megapixel, String model, int price) {
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
        this.model = model;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + ((megapixel == null) ? 0 : megapixel.hashCode());
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
        Camera other = (Camera) obj;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (megapixel == null) {
            if (other.megapixel != null)
                return false;
        } else if (!megapixel.equals(other.megapixel))
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
        return "Camera [manufacturer=" + manufacturer + ", megapixel=" + megapixel + ", model=" + model + ", price="
                + price + "]";
    }

    public static class Canon extends Camera {

        public Canon(String mp, String model, int price) {
            super("Canon", mp, model, price);
        }
    
        public String getModel() {
            return "This is DSLR Camera- " + model;
        }
    
    }
    
    public static class Fujitsu extends Camera {
    
        public Fujitsu(String mp, String model, int price) {
            super("Nokia", mp, model, price);
        }
    
        public String getModel() {
            return "This is DSLR Camera- " + model;
        }
    
    }
}