

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mariadb.jdbc.Connection;

public class EmployeeImpl implements EmployeeInterface {

  java.sql.Connection con;

  @Override
  public void ShowEmp(int Empid) {
    con = DBConnection.createDBConnection();
    String query = "select * from EMPLOYEE_new where EmpCode=" + Empid;
    try {
      java.sql.Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      System.out.println("\nID\tFName\tLName\tJob\tManager\tHireDtae\tSalary\tCommision\tDepartment\n");
     
      while (rs.next()) {

        System.out.println("-------------------------");
        System.out.format("%d\t%s\t%s\t%s\t%s\t%s\t%d\t%d\t%d\n", rs.getInt(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6),
            rs.getInt(7),
            rs.getInt(8),
            rs.getInt(9));
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  @Override
  public void createEmp(Employee e) {
    con = DBConnection.createDBConnection();
    String query = "insert into EMPLOYEE_new VALUES(?,?,?,?,?,?,?,?,?)";
    try {
      PreparedStatement pstm = con.prepareStatement(query);
      pstm.setInt(1, e.getEmpCode());
      pstm.setString(2, e.getEmpFName());
      pstm.setString(3, e.getEmpLName());
      pstm.setString(4, e.getJob());
      pstm.setString(5, e.getManager());
      pstm.setString(6, e.getHiredate());
      pstm.setInt(7, e.getSalary());
      pstm.setInt(8, e.getCommission());
      pstm.setInt(9, e.getDeptCode());

      int count = pstm.executeUpdate();

      if (count != 0) {

        System.out.println("-------------------------");
        System.out.println("Employee is  Inserted");
        System.out.println("-------------------------");
      }

    } catch (Exception e1) {
      System.out.println(e1);
    }
  }

  @Override
  public void deleteEmp(int Empid) {
    con = DBConnection.createDBConnection();
    String query = "delete from EMPLOYEE_new where EmpCode=?";
    try {
      PreparedStatement pstm = con.prepareStatement(query);

      pstm.setInt(1, Empid);

      int count = pstm.executeUpdate();
      if (count != 0) {

        System.out.println("-------------------------");
        System.out.println("Employee details deleted");

        System.out.println("-------------------------");
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }

  @Override
  public void showAllEmp() {
    con = DBConnection.createDBConnection();
    String query = "select * from EMPLOYEE_new";
    try {
      java.sql.Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      System.out.println("-------------------------");
      System.out.println("ID\tFName\tLName\tJob\tManager\tHireDtae\tSalary\tCommision\tDepartment");
      while (rs.next()) {

       
        System.out.format("%d\t%s\t%s\t %s  \t%s\t%s\t%d\t%d\t%d\n", rs.getInt(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6),
            rs.getInt(7),
            rs.getInt(8),
            rs.getInt(9));
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  public void updateEmp(int Empid, String Fname, String Lname) {
    con = DBConnection.createDBConnection();
    String query = "Update  EMPLOYEE_new set EmpFName=? where EMPCode=?";

    try {
      PreparedStatement pstm = con.prepareStatement(query);
      pstm.setString(1, Fname);
      pstm.setInt(2, Empid);

      int count = pstm.executeUpdate();
      if (count != 0) {

        System.out.println("-------------------------");
        System.out.println("Employee details updated");

        System.out.println("-------------------------");
      }

    } catch (Exception e) {
      System.out.println(e);
    }

  }

}
