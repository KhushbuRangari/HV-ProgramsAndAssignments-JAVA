package appointment.booking.models;

public class Patients extends Accounts{

    public Patients(String name, String mobile, String email, String address,String id,String issue) {
        super(name, mobile, email, address, id);
        this.issue=issue;
    }
    
    boolean appointmentSlot;
    String issue;
    String docterName;
    String doctorId;
    String timeSlot;
    boolean prescriptionGenterated;
    
    public Patients(String name2, String mobile, String email, String address, String id, String issue, String docterName, String doctorId) {
        super(name2, mobile, email, address, id);
        this.issue = issue;
        this.docterName = docterName;
        this.doctorId = doctorId;
       
    }

    public boolean isPrescriptionGenterated() {
        return prescriptionGenterated;
    }

    public void setPrescriptionGenterated(boolean prescriptionGenterated) {
        this.prescriptionGenterated = prescriptionGenterated;
        this.docterName="";
        this.doctorId="";
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public boolean getAppointmentSlot() {
        return docterName==null || docterName.isEmpty() ? false : true;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDocterName() {
        return docterName;
    }

    public void setDocterName(String docterName) {
        this.docterName = docterName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    
}
