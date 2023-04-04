package EMPLOYEEMANGEMNET;
public class SalesEmp extends EmployeeDetail {
    
    public SalesEmp(String eName, String empJD, int empid, double empsal) {
        super(eName, empJD, empid, empsal);
      
    }
    private double target;
    private String dealdline;
    private double conversion;
    public double getTarget() {
        return target;
    }
    public void setTarget(double target) {
        this.target = target;
    }
    public String getDealdline() {
        return dealdline;
    }
    public void setDealdline(String dealdline) {
        this.dealdline = dealdline;
    }
    public double getConversion() {
        return conversion;
    }
    public void setConversion(double conversion) {
        this.conversion = conversion;
    }

    // public void performance()
    // {
    //     if(getConversion()>getTarget()){
    //         return "";

    //     }
    // }

}
