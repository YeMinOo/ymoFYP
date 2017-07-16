/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entity.Job;
import entity.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import utility.ConnectionManager;
/**
 *
 * @author Bernitatowyg
 */
public class JobDAO {
    private static String getJobStatement = "SELECT * FROM PROJECT WHERE project_id = ? AND client_id = ?";
    public static Job getJob (String project_id, String client_id) throws SQLException{
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(getJobStatement);
            stmt.setString(1, project_id);
            stmt.setString(2, client_id);
            ResultSet rs = stmt.executeQuery();
            // returns null if no records are returned
            if (!rs.next()){
                return null;
            }
            // else returns result*
            String jobID = rs.getString(1);
            String clientID = rs.getString(2);
            String jobTitle = rs.getString(3);
            String jobDescription = rs.getString(4);
            Date dueDate = rs.getDate(5);
            Date completionDate = rs.getDate(6);
            String priorityLevel = rs.getString(7);
            ArrayList<Staff> staffAssignedTo = (ArrayList<Staff>) rs.getArray(8);
            return new Job(jobID, clientID, jobTitle, jobDescription, dueDate, completionDate, priorityLevel, staffAssignedTo);
        } catch (SQLException e){
            e.printStackTrace();
            //Returns empty Job, so that Login page can determine that its
            //a database error!
            //Will be checked by .getJobId method!
            return new Job(null,null,null,null,null,null,null,null);
        }
    }
}
