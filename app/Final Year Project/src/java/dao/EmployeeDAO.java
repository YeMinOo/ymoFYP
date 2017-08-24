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
import utility.ConnectionManager;

/**
 *
 * @author Bernitatowyg
 */
public class EmployeeDAO {

    private static String getEmployeeStatement = "SELECT * FROM EMPLOYEE WHERE employee_ID = ? ";
    private static String getEmployeeStatementwithPassword = "SELECT * FROM EMPLOYEE WHERE employee_ID = ? AND password = ? ";
    private static String getAllEmployeeStatement = "SELECT * FROM EMPLOYEE";
    private static String getEmployeeFromNameStatement = "SELECT * FROM EMPLOYEE WHERE name = ?";
    private static String deleteEmployeeByNRICStatement = "DELTE FROM EMPLOYEE WHERE NRIC = ?";
    private static String insertEmployeeStatement = "INSERT INTO EMPLOYEE values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
            double currentSalary = rs.getDouble(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, bankAccount, nric, empName, phoneNum);
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
            double currentSalary = rs.getDouble(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            //ArrayList<Job> currentJobs = rs.

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, bankAccount, nric, empName, phoneNum);
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
            double currentSalary = rs.getDouble(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);
            //ArrayList<Job> currentJobs = rs.

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }

    public static Employee getAllEmployee() {
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getAllEmployeeStatement);

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
            double currentSalary = rs.getDouble(5);
            String position = rs.getString(6);
            int isSupervisor = Integer.parseInt(rs.getString(7));
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String phoneNum = rs.getString(13);

            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
            //return new Staff(email, pw, isAdmin);
            
            return new Employee(employeeID, password, email, isAdmin, currentSalary, position, isSupervisor, cpf, bankAccount, nric, empName, phoneNum);
        } catch (SQLException e) {
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
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
    
    public boolean createEmployee (String employeeID, String password, String email, int isAdmin, double currentSalary, String position,int isSupervisor,double cpf, String bankAccount, String nric, String name, String phoneNum) {
        
        try (Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(insertEmployeeStatement);
            stmt.setString(1, employeeID);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.setInt(4, isAdmin);
            stmt.setDouble(5, currentSalary);
            stmt.setString(6, position);
            stmt.setInt(7, isSupervisor);
            stmt.setDouble(8, cpf);
            stmt.setInt(9, 0); //new employee means 0 number of projects worked on
            stmt.setString(9, bankAccount);
            stmt.setString(10, nric);
            stmt.setString(11, name);
            stmt.setString(12, phoneNum);
            
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
