
public interface EmployeeInterface {
    
    //Craete Employee
    //Show all Employee
    //Show emp based on id
    //update emp
    //delete emp

    public void createEmp(Employee e);
    public void showAllEmp();
    public void ShowEmp(int Empid);
    public void updateEmp(int Empid ,String Fname, String Lname);
    public void deleteEmp(int Empid);

}
