package EmsAbstraction;

/**
 * EmpDetails
 */

interface TechEmp {
     String getShift();

     void setShift(int shift);

     String getTechSkills();

     void setTechSkills(String techSkills);
}

interface SalesEmp {
     double getTarget();

     void setTarget(double target);

     String getDealdline();

     void setDealdline(String dealdline);

     double getConversion();

     void setConversion(double conversion);
}

 class EmpDetails implements TechEmp, SalesEmp {
     String name;
     String joiningDate;
     int employeeID;
     double salary;
     int shift;
     String techSkills;
     double target;
     String dealdline;
     double conversion;


     public EmpDetails(String name, String joiningDate, int employeeID, double salary, int shift, String techSkills,
               double target, String dealdline, double conversion) {
          this.name = name;
          this.joiningDate = joiningDate;
          this.employeeID = employeeID;
          this.salary = salary;
          this.shift = shift;
          this.techSkills = techSkills;
          this.target = target;
          this.dealdline = dealdline;
          this.conversion = conversion;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getJoiningDate() {
          return joiningDate;
     }

     public void setJoiningDate(String joiningDate) {
          this.joiningDate = joiningDate;
     }

     public int getEmployeeID() {
          return employeeID;
     }

     public void setEmployeeID(int employeeID) {
          this.employeeID = employeeID;
     }

     public double getSalary() {
          return salary;
     }

     public void setSalary(double salary) {
          this.salary = salary;
     }

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

    
}