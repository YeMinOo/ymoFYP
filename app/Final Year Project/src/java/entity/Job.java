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
    private String jobTitle;
    private String jobDescription;
    private String clientName;
    private String clientID;
    private Date startDate;
    private Date completionDate;
    private Date finalDate;
    private String priorityLevel;
    private Staff staffAssignedTo;
    private String status;
    private String jobtype;
    private String interval;
    
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
    public Job(String jobID, String jobTitle, String jobDescription, String clientname, String clientId, Date startDate, Date completionDate, Date finalDate, String priorityLevel, Staff staffAssignedTo, String status, String jobType){
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.clientName = clientname;
        this.clientID = clientId;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.finalDate = finalDate;
        this.priorityLevel = priorityLevel;
        this.staffAssignedTo = staffAssignedTo;
        this.status = status;
        this.jobtype = jobType;
        this.interval = null;
    }
    
    public Job(String jobID, String jobTitle, String jobDescription, String clientname, String clientId, Date startDate, Date completionDate, Date finalDate, String priorityLevel, Staff staffAssignedTo, String status, String jobType, String interval){
        //for recurring jobs
        this.jobID = jobID;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.clientName = clientname;
        this.clientID = clientId;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.finalDate = finalDate;
        this.priorityLevel = priorityLevel;
        this.staffAssignedTo = staffAssignedTo;
        this.status = status;
        this.jobtype = jobType;
        this.interval = interval;
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
    
    public String getClientName(){
         return clientName;
    }
    
    public String getClientId(){
         return clientID;
    }

    public Date getStartDate(){
         return startDate;
    }      
    
    public Date getFinalDate(){
         return finalDate;
    }   

    public Date getCompletionDate(){
         return completionDate;
    }
    
    public String getPriorityLevel(){
         return priorityLevel;
    }
    
    public Staff getStaffAssignedTo(){
         return staffAssignedTo;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getJobType(){
        return jobtype;
    }
    
    public String getInterval(){
        return interval;
    }
}