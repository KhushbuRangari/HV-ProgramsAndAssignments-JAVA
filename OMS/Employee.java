
/* ORDER MANAGEMENT SYSTEM BY KHUSHBU RANGARI */
import java.util.Scanner;

public class Employee extends dataFetch{
    

    private Scanner sc = new Scanner(System.in);

    private int id;
    private String name;
    private  int shift;
    private  String contact,username,password;
    public Employee(int id, String name, int shift, String contact, String username, String password) {
        this.id = id;
        this.name = name;
        this.shift = shift;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }
    public Employee() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getShift() {
        return shift;
    }
    public void setShift(int shift) {

        this.shift = shift;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void getdata()
    {
        loadEmpFile();
    }
    @Override
    public String toString() {
        return "---------- ID= " + this.getId() + ", name=" + this.getName() + ", shift=" + this.getShift() + ", contact=" + this.getContact() + "----------";
    }
    
    public void changeShift(int shift,int idsearch) {

		for (int i=0;i<employees.size();i++) {

			if(employees.get(i).getId()==idsearch) {
				employees.get(i).setShift(shift);
			}
		}
	}
    public void changeName(String name,int idsearch) {
		for (int i=0;i<employees.size();i++) {

			if(employees.get(i).getId()==idsearch) {
				employees.get(i).setName(name);
			}
		}
	} 
   
    public int login() {
		int flag=0;
		String usernames,passwords;
		while(flag<3) {
			System.out.println("Enter your username to login  ");	 
			usernames=sc.next();
			System.out.println("Enter your password to login");	 
			passwords=sc.next();
			boolean log=isValidEmployee(usernames,passwords);
            
			if(log) {
				flag=2;
                break;
			}
            flag++;
		}
		return flag;
	}

    public boolean isValidEmployee(String usernamecheck,String passwordcheck){
		boolean check = false;
		for (Employee emp:employees){

			if (emp.username.equals(usernamecheck)) {

				if(emp.password.equals(passwordcheck)){

					check=true;
					return check;
				}
			}
		}
		return check; 
	}

    public void addemp() {
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter Shift");
		int shift=sc.nextInt();
		System.out.println("Enter username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		Employee e=new Employee( id,  name,  shift,  contact,  username,  password);
		employees.add(e);
		System.out.println("Employee added succesfully");
	}
    public void editEmpFile(int idsearch, String name, int shift, String contact) {
        // Menu m = new Menu();
        for (int i = 0; i < employees.size(); i++) {
         
            if (employees.get(i).getId() == idsearch) 
            {
                employees.get(i).setId(idsearch);
                employees.get(i).setName(name);
                employees.get(i).setShift(shift);
                employees.get(i).setContact(contact);;
            }
        }

    }
}
