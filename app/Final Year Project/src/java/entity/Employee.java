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
public class Employee {
    private String email;
    private String password;
    private String employeeID;
    private int isAdmin;
    private double currentSalary;
    private double cpf;
    private String bankAccount;
    private String nric;
    private String name;
    private String position;
    private ArrayList<Job> currentJobs;
    private ArrayList<Job> pastJobs;
    private String department;
    
    public Employee(String email, String password, String employeeID, int isAdmin, double currentSalary, double cpf, String bankAccount, String nric, String name, String position, ArrayList<Job> currentJobs, ArrayList<Job> pastJobs, String department){
        this.email = email;
        this.password = password;
        this.employeeID = employeeID;
        this.isAdmin = isAdmin;
        this.currentSalary = currentSalary;
        this.cpf = cpf;
        this.bankAccount = bankAccount;
        this.nric = nric;
        this.name = name;
        this.position = position;
        this.currentJobs = currentJobs;
        this.pastJobs = pastJobs;
        this.department = department;
    }    
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmployeeId() {
        return employeeID;
    }
    
    public int getIsAdmin(){
        return isAdmin;
    }
    
    public double getCurrentSalary(){
        return currentSalary;
    }
    
    public double getCpf(){
        return cpf;
    }
    
    public String getBankAccount(){
        return bankAccount;
    }
    
    public String getNric(){
        return nric;
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
