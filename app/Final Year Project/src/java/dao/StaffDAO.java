/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utility.ConnectionManager;

/**
 *
 * @author Bernitatowyg
 */
public class StaffDAO {
    private static String getStaffStatement = "SELECT * FROM STAFF WHERE userid = ? ";
    private static String getAllStaffStatement = "SELECT * FROM STAFF";
    private static String getStaffFromNameStatement = "SELECT * FROM STAFF WHERE name = ?";
    
    public static Staff getStaff (String name){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(getStaffFromNameStatement);
            stmt.setString(1, name);
            
            ResultSet rs = stmt.executeQuery();
            
            // returns null if no records are returned
            if (!rs.next()){
                return null;
            }
            
            // else returns result
            String email = rs.getString(1);
            String employeeID = rs.getString(2);
            boolean isAdmin = false;
            double currentSalary = rs.getDouble(3);
            double cpf = rs.getDouble(4);
            String bankAccount = rs.getString(5);
            String nric = rs.getString(6);
            //String name = rs.getString(7);
            String position = rs.getString(8);
            String department = rs.getString(9);
            //ArrayList<Job> currentJobs = rs.
            
            
            //ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department
                    
            //return new Staff(email, pw, isAdmin);
            
        } catch (SQLException e){
            e.printStackTrace();
            //Returns empty staff, so that add new job can determine that the staff does note exist and it's a database error
            //a database error!
            //Will be checked by .getUserId method!
            return new Staff(null, null, false, 0, 0, null, null, null, null, null, null, null);
        }
    return null;
    }
}
