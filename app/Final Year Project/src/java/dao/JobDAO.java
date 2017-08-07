/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entity.Job;
import entity.Staff;
import entity.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import utility.ConnectionManager;
/**
 *
 * @author Bernitatowyg
 */
public class JobDAO {
    private static String getJobStatement = "SELECT * FROM PROJECT WHERE client_id = ? AND job_id = ?";
    private static String addJobStatement = "INSERT INTO PROJECT(jobID, clientID, jobTitle, jobDescription, dueDate, completionDate, priorityLevel, staffAssignedTo, taskList) VALUES (?,?,?,?,?,?,?,?,?)";
    
    public static Job getJob (String client_id, String job_id) throws SQLException, ParseException{
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(getJobStatement);
            stmt.setString(1, client_id);
            stmt.setString(2, job_id);
            ResultSet rs = stmt.executeQuery();
            // returns null if no records are returned
            if (!rs.next()){
                return null;
            }
            // else returns result*
            String jobTitle = rs.getString(1);
            String jobDescription = rs.getString(2);
            String clientName = rs.getString(3);
            Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(4));
            Date completionDate = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(5));
            Date finalDate = new SimpleDateFormat("dd/MM/yyyy").parse(rs.getString(6));
            String priorityLevel = rs.getString(7);
            String staffAssignedToString = rs.getString(8);
            Staff staffAssignedTo = StaffDAO.getStaff(staffAssignedToString);
            String status = rs.getString(9);
            String jobtype = rs.getString(10);
            String interval = rs.getString(11);
            return new Job(job_id, jobTitle, jobDescription, clientName, client_id, startDate, completionDate, finalDate, priorityLevel, staffAssignedTo, status, jobtype, interval);
        } catch (SQLException e){
            e.printStackTrace();
            //Returns empty Job, so that Login page can determine that its
            //a database error!
            //Will be checked by .getJobId method!
            return null;
        }
    }

    /**
     *
     * @param project_id
     * @param client_id
     * @param jobTitle
     * @param jobDescription
     * @param dueDate
     * @param completionDate
     * @param priorityLevel
     * @param staffAssignedTo
     * @param taskList
     * @param status
     */
    public static void addJob(String project_id, String client_id, String jobTitle, String jobDescription, Date dueDate, Date completionDate, String priorityLevel, ArrayList<Staff> staffAssignedTo, ArrayList<Task> taskList, String status){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(addJobStatement);
            stmt.setString(1, project_id);
            stmt.setString(2, client_id);
            stmt.setString(3, jobTitle);
            stmt.setString(4, jobDescription);
            stmt.setDate(5, (java.sql.Date) dueDate);
            stmt.setDate(6, (java.sql.Date) completionDate);
            stmt.setString(7, priorityLevel);
            stmt.setString(8, client_id);
            stmt.setString(9, client_id);
            stmt.setString(10, status);
            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteJob(String clientId, String jobId) {
        
    }
}