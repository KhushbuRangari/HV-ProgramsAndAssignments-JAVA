package appointment.booking.models;

import java.util.List;

public class Doctors extends Accounts {

    public Doctors(String name, String mobile, String email, String address,  String id) {
        super(name, mobile, email, address, id);
    }
    
    public Doctors(String name2, String mobile, String email, String address, String id, String specialization,
            String availableSlot,String day) {
        super(name2, mobile, email, address, id);
        Specialization = specialization;
        this.availableSlot = availableSlot;
        this.day = day;
    }

    String Specialization;
    String availableSlot;
    String day;
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSpecialization() {
        return Specialization;
    }
    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }
    public String getAvailableSlot() {
        return availableSlot;
    }
    public void setAvailableSlot(String availableSlot) {
        this.availableSlot = availableSlot;
    }

    @Override
    public String toString() {
        return " " + name +" "+id+ " "+ Specialization.replace("_", " ") + " " + availableSlot + " " + day+"DAY" ;
    }
    
}
