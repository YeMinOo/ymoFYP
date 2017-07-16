/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author Bernitatowyg
 */
public class Staff {
    private String email;
    private String employeeID;
    private boolean isAdmin;
    private double currentSalary;
    private double cpf;
    private String bankAccount;
    private String nric;
    private String name;
    private String position;
    private ArrayList<Job> currentJobs;
    private ArrayList<Job> pastJobs;
    private String department;
    
    public Staff(String email, String name, String position, ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department){
        this.email = email;
        this.name = name;
        this.position = position;
        this.currentJobs = currentJobs;
        this.pastJobs = pastJobs;
        this.department = department;
    }    
    
    public String getEmail(){
        return email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPosition(){
        return position;
    }
    
    public ArrayList<Job> getCurrentJobs(){
        return currentJobs;
    }
    
    public ArrayList<Job> getPastJobs(){
        return pastJobs;
    }
    
    public String getDepartment(){
        return department;
    }
    
    
}
