/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bernitatowyg
 */
public class Job {
    private String jobID;
    private String clientID;
    private String jobTitle;
    private String jobDescription;
    private Date dueDate;
    private Date completionDate;
    private String priorityLevel;
    private ArrayList<Staff> staffAssignedTo;
    private String status;
    private ArrayList<Task> taskList;
    
    /**
     *
     * @param jobID
     * @param jobTitle
     * @param jobDescription
     * @param dueDate
     * @param completionDate
     * @param priorityLevel
     * @param staffAssignedTo
     */
    public Job(String jobID, String clientID, String jobTitle, String jobDescription, Date dueDate, Date completionDate, String priorityLevel, ArrayList<Staff> staffAssignedTo, String status, ArrayList<Task> taskList){
        this.jobID = jobID;
        this.clientID = clientID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.dueDate = dueDate;
        this.completionDate = completionDate;
        this.priorityLevel = priorityLevel;
        this.staffAssignedTo = staffAssignedTo;
        this.status = status;
        this.taskList = taskList;
    }
        
    public String getJobID(){
        return jobID;
    }
    
    public String getClientID(){
        return clientID;
    }
    
    public String getJobTitle(){
         return jobTitle;
    }
    
    public String getJobDescription(){
         return jobDescription;
    }
    
    public Date getDueDate(){
         return dueDate;
    }
    
    public Date getCompletionDate(){
         return completionDate;
    }
    
    public String getPriorityLevel(){
         return priorityLevel;
    }
    
    public ArrayList<Staff> getStaffAssignedTo(){
         return staffAssignedTo;
    }
    
    public String getStatus(){
        return status;
    }
    
    public ArrayList<Task> getTaskList(){
        return taskList;
    }
}