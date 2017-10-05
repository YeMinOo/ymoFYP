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
    private int id;
    private int projectID;
    private String title;
    private String companyName;
    private String companyCategory;
    private String businessType;
    private Date startDate;
    private Date endDate;
    private String remarks;
    private String assignedEmployee;
    private String assignedEmployee2;
    private String reviewer;
    private String projectStatus;
    private String recurring; 
    private String reviewStatus;

    public Job(int id, int projectID, String title, String companyName, String companyCategory, String businessType, Date startDate, Date endDate, String remarks, String assignedEmployee, String assignedEmployee2, String reviewer, String projectStatus, String recurring, String reviewStatus) {
        this.id = id;
        this.projectID = projectID;
        this.title = title;
        this.companyName = companyName;
        this.companyCategory = companyCategory;
        this.businessType = businessType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.remarks = remarks;
        this.assignedEmployee = assignedEmployee;
        this.assignedEmployee2 = assignedEmployee2;
        this.reviewer = reviewer;
        this.projectStatus = projectStatus;
        this.recurring = recurring;
        this.reviewStatus = reviewStatus;
        
    }

    public int getId() {
        return id;
    }

    public int getProjectID() {
        return projectID;
    }

    public String getTitle() {
        return title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public String getBusinessType() {
        return businessType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getAssignedEmployee() {
        return assignedEmployee;
    }

    public String getAssignedEmployee2() {
        return assignedEmployee2;
    }

    public String getReviewer() {
        return reviewer;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public String getRecurring() {
        return recurring;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setAssignedEmployee(String assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public void setAssignedEmployee2(String assignedEmployee2) {
        this.assignedEmployee2 = assignedEmployee2;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public void setRecurring(String recurring) {
        this.recurring = recurring;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }
    
}