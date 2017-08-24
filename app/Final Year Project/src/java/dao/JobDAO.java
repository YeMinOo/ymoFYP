/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import entity.Job;
import entity.Employee;
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
    private static String addJobStatement = "INSERT INTO PROJECT(client_id, job_id, jobTitle, jobDescription, clientName, startDate, completionDate, finalDate, priorityLevel, staffAssignedTo, status, jobType, interval) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static String deleteJobStatement = "DELETE * FROM PROJECT WHERE client_id= ? AND job_id = ? ";
    
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
            Employee staffAssignedTo = EmployeeDAO.getEmployee(staffAssignedToString);
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
    public static void addJob(String client_id, String jobTitle, String jobDescription, String clientName, Date startDate, Date completionDate, Date finalDate, String priorityLevel, Employee staffAssignedTo, String status, String jobType, String interval){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(addJobStatement);
            // need to check how we're going to assign the jobid
            //client_id, job_id, jobTitle, jobDescription, clientName, startDate, completionDate, finalDate, priorityLevel, staffAssignedTo, status, jobType, interval
            stmt.setString(1, client_id);
//########################### to decide how we're going to assign the job id##############################
            stmt.setString(2, client_id + jobTitle);
            
            stmt.setString(3, jobTitle);
            stmt.setString(4, jobDescription);
            stmt.setString(5, clientName);
            stmt.setString(6, jobDescription);
            stmt.setString(7, clientName);
            stmt.setDate(8, (java.sql.Date) startDate);
            stmt.setDate(9, (java.sql.Date) completionDate);
            stmt.setDate(10, (java.sql.Date) finalDate);
            stmt.setString(11, priorityLevel);
            String staffAssignedName = staffAssignedTo.getName();
            stmt.setString(12, staffAssignedName);
            stmt.setString(13, status);
            stmt.setString(14, jobType);
            stmt.setString(15, interval);
            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteJob(String clientId, String jobId) {
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement(deleteJobStatement);
            // need to check how we're going to assign the jobid
            stmt.setString(1, clientId);
            stmt.setString(2, jobId);
            ResultSet rs = stmt.executeQuery();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public ResultSet viewEmployeeTasks(String employeeID){
        ResultSet rs = null; 
        try(Connection conn = ConnectionManager.getConnection()){
            String statement = "SELECT * FROM PROJECT WHERE ASSIGNED_EMPLOYEE=?";
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.setString(1, employeeID);
            rs = stmt.executeQuery();
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rs; 
    }
    
    public void insertRecurringTask(String title, String start, String end, String remarks, String assignedEmployee, String recurring, String companyName){
            
            try(Connection conn = ConnectionManager.getConnection()){
                String statement = "insert into project values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(statement);
                
                stmt.setInt(1, getCounter());
                stmt.setString(2, title); 
                stmt.setString(3,start);
                stmt.setString(4, end);
                stmt.setString(5, remarks); 
                stmt.setString(6, assignedEmployee); 
                stmt.setInt(7,0); 
                stmt.setString(8, recurring);
                stmt.setString(9, companyName);
                
                stmt.executeUpdate();  
                
            } catch (SQLException e){
                e.printStackTrace();
            }
             
    }
    
    public int getCounter() throws SQLException {
        
         
        
        try(Connection conn = ConnectionManager.getConnection()){
        PreparedStatement stmt = conn.prepareStatement("Select max(id) from project");
        ResultSet rs = stmt.executeQuery();
        rs.last();
        int temp = rs.getInt("max(id)");
        int counter = temp + 1;
        return counter;
        
        } catch (SQLException e){
            e.printStackTrace();
        }
        return 0; 
    }
    
    public ResultSet viewAllTasks(){
        ResultSet rs = null; 
        try(Connection conn = ConnectionManager.getConnection()){
            String statement = "SELECT * FROM PROJECT";
            PreparedStatement stmt = conn.prepareStatement(statement);
            
            rs = stmt.executeQuery();
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return rs; 
    }
}