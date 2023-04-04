package EMPLOYEEMANGEMNET;

public class TechEmp extends EmployeeDetail {

    public TechEmp(String eName, String empJD, int empid, double empsal) {
        super(eName, empJD, empid, empsal);
    }

    private int shift;
    private String techSkills;

    public String getShift() {
        if (shift == 1)
            return "Night";
        else if (shift == 0)
            return "Day";
        else
            return "invalid Input";
        
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    }

}
