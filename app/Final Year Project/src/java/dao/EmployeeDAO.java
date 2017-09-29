/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utility.ConnectionManager;

/**
 *
 * @author Bernitatowyg
 */
public class EmployeeDAO {

    private static String getEmployeeStatement = "SELECT * FROM EMPLOYEE WHERE employeeID = ? ";
    private static String getEmployeeStatementwithPassword = "SELECT * FROM EMPLOYEE WHERE employeeID = ? AND password = ? ";
    private static String getAllEmployeeStatement = "SELECT * FROM EMPLOYEE";
    private static String getEmployeeFromNameStatement = "SELECT * FROM EMPLOYEE WHERE name = ?";
    private static String deleteEmployeeByNRICStatement = "DELETE FROM EMPLOYEE WHERE NRIC = ?";
    private static String insertEmployeeStatement = "INSERT INTO EMPLOYEE values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static String resetPasswordStatement = "UPDATE EMPLOYEE SET password = ? WHERE email = ?";
    private static String getEmployeeByEmailStatement = "SELECT * FROM EMPLOYEE WHERE email = ?";
    private static String deleteEmployeeByEmployeeIdStatement = "DELETE FROM EMPLOYEE WHERE employeeID = ?";
    private static String deleteEmployeeByEmployeeNameStatement = "DELETE FROM EMPLOYEE WHERE name = ?";
    private static String updateEmployeeStatement = "UPDATE EMPLOYEE SET employeeID=?, email=?, isAdmin=?, currentSalary=?, position=?, supervisor=?, CPF=?, bankAccount=?, name=?, number=? where NRIC=?";

    public static Employee getEmployee(String name) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getEmployeeFromNameStatement);
            stmt.setString(1, name);

            ResultSet rs = stmt.executeQuery();

            // returns null if no records are returned
            if (!rs.next()) {
                return null;
            }

            // else returns result
            String employeeID = rs.getString(1);
            String password = rs.getString(2);
            String email = rs.getString(3);
            int isAdmin = Integer.parseInt(rs.getString(4));
            String currentSalary = rs.getString(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            int projectsWorkedOn = Integer.parseInt(rs.getString(9));
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, projectsWorkedOn, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }

    public static Employee getEmployeeByID(String userId) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getEmployeeStatement);
            stmt.setString(1, userId);

            ResultSet rs = stmt.executeQuery();

            // returns null if no records are returned
            if (!rs.next()) {
                return null;
            }

            // else returns result
            String employeeID = rs.getString(1);
            String password = rs.getString(2);
            String email = rs.getString(3);
            int isAdmin = Integer.parseInt(rs.getString(4));
            String currentSalary = rs.getString(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            int projectsWorkedOn = Integer.parseInt(rs.getString(9));
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            //ArrayList<Job> currentJobs = rs.

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf,projectsWorkedOn, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }

    public static Employee getEmployeebyIDandPassword(String userId, String enteredPassword) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getEmployeeStatementwithPassword);
            stmt.setString(1, userId);
            stmt.setString(2, enteredPassword);

            ResultSet rs = stmt.executeQuery();

            // returns null if no records are returned
            if (!rs.next()) {
                return null;
            }

            // else returns result
            String employeeID = rs.getString(1);
            String password = rs.getString(2);
            String email = rs.getString(3);
            int isAdmin = Integer.parseInt(rs.getString(4));
            String currentSalary = rs.getString(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            int projectsWorkedOn = Integer.parseInt(rs.getString(9));
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            //ArrayList<Job> currentJobs = rs.

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, projectsWorkedOn, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }
    
     public static Employee getEmployeeByEmail(String email) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getEmployeeByEmailStatement);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            // returns null if no records are returned
            if (!rs.next()) {
                return null;
            }

            // else returns result
            String employeeID = rs.getString(1);
            String password = rs.getString(2);
            int isAdmin = Integer.parseInt(rs.getString(4));
            String currentSalary = rs.getString(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            int projectsWorkedOn = Integer.parseInt(rs.getString(9));
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            //ArrayList<Job> currentJobs = rs.

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, projectsWorkedOn, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }

    public static ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> empList = new ArrayList<>();
        
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getAllEmployeeStatement);

            ResultSet rs = stmt.executeQuery();
            
            // returns null if no records are returned
            if (!rs.next()) {
                return empList;
            }
            while(rs.next()) {
                empList.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)), rs.getString(5), rs.getString(6), Integer.parseInt(rs.getString(7)), Double.parseDouble(rs.getString(8)), Integer.parseInt(rs.getString(9)), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
            return empList;
        } catch (SQLException e) {
            System.out.println("EmployeeDAO: (getAllEmployees) = "+e.toString());
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
        }
        return empList;
    }

    public boolean deleteEmployee(String nric) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(deleteEmployeeByNRICStatement);
            stmt.setString(1, nric);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteEmployeeByEmployeeId(String employeeId) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(deleteEmployeeByEmployeeIdStatement);
            stmt.setString(1, employeeId);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteEmployeeByEmployeeName(String employeeName) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(deleteEmployeeByEmployeeNameStatement);
            stmt.setString(1, employeeName);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean createEmployee (String employeeID, String password, String email, int isAdmin, String currentSalary, String position, String supervisor, String cpf, String bankAccount, String nric, String name, String phoneNum) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(insertEmployeeStatement);
            stmt.setString(1, employeeID);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.setInt(4, isAdmin);
            stmt.setString(5, currentSalary);
            stmt.setString(6, position);
            stmt.setString(7, supervisor);
            stmt.setString(8, cpf);
            stmt.setInt(9, 0); //new employee means 0 number of projects worked on
            stmt.setString(10, bankAccount);
            stmt.setString(11, nric);
            stmt.setString(12, name);
            stmt.setString(13, phoneNum);
            
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean resetPassword (String pwd, String email) {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(resetPasswordStatement);
            stmt.setString(1, pwd);
            stmt.setString(2, email);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updateEmployeeDetails(String employeeID, String email, int isAdmin, String currentSalary, String position, String supervisor, String cpf, String bankAccount, String nric, String name, String number){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement("updateEmployeeStatement");
            stmt.setString(1, employeeID);
            stmt.setString(2, email);
            stmt.setInt(3, isAdmin);
            stmt.setString(4, currentSalary);
            stmt.setString(5, position);
            stmt.setString(6, supervisor);
            stmt.setString(7, cpf);
            stmt.setString(8, bankAccount);
            stmt.setString(9, name);
            stmt.setString(10, number);
            stmt.setString(11, nric);
            
            int rowsAffected = stmt.executeUpdate();
            if(rowsAffected == 1){
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
