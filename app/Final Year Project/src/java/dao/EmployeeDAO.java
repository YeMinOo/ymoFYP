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
    private static String getAllEmployeeStatement = "SELECT * FROM EMPLOYEE";
    private static String getEmployeeFromNameStatement = "SELECT * FROM EMPLOYEE WHERE name = ?";
    
    public static Employee getEmployee (String name){
        try (Connection conn = ConnectionManager.getConnection()){
            System.out.println("CONNECTED!");
            PreparedStatement stmt = conn.prepareStatement(getEmployeeFromNameStatement);
            stmt.setString(1, name);
            
            ResultSet rs = stmt.executeQuery();
        
            // returns null if no records are returned
            if (!rs.next()){
                return null;
            }
            
            // else returns result
            String email = rs.getString(3);
            String employeeID = rs.getString(1);
            int isAdmin = Integer.parseInt(rs.getString(4));
            double currentSalary = rs.getDouble(5);
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String position = rs.getString(6);
            return new Employee(email, employeeID, isAdmin, currentSalary, cpf, bankAccount, nric, empName, position, null, null, null);
        } catch (SQLException e){
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }
    
    public static Employee getEmployeeByID (String userId){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(getEmployeeStatement);
            stmt.setString(1, userId);
            
            ResultSet rs = stmt.executeQuery();
            
            // returns null if no records are returned
            if (!rs.next()){
                return null;
            }
            
            // else returns result
            String email = rs.getString(3);
            String employeeID = rs.getString(1);
            int isAdmin = Integer.parseInt(rs.getString(4));
            double currentSalary = rs.getDouble(5);
            double cpf = rs.getDouble(8);
            String bankAccount = rs.getString(10);
            String nric = rs.getString(11);
            String empName = rs.getString(12);
            String position = rs.getString(6);
           //String department = rs.getString(9);
            //ArrayList<Job> currentJobs = rs.
            
            
            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
                    
            //return new Staff(email, pw, isAdmin);
            return new Employee(email, employeeID, isAdmin, currentSalary, cpf, bankAccount, nric, empName, position, null, null, null);
        } catch (SQLException e){
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return null;
        }
    }
}
