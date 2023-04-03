package appointment.booking.models;

import java.util.List;

public class Accounts {
    
    String name;
    String mobile;
    String email;
    String address;
    String id;
    
    public Accounts(String name2, String mobile, String email, String address, String id) {
        this.name = name2;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return " " + name + " " + mobile + " " + email + " " + address + " "
                + id ;
    }
    
    
}
