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
    private String employeeID;
    private String password;
    private String email;
    private int isAdmin;
    private double currentSalary;
    private String position;
    private int isSupervisor;
    private double cpf;
    private String bankAccount;
    private String nric;
    private String name;
    private String phoneNum;
    
    public Employee(String employeeID, String password, String email, int isAdmin, double currentSalary, String position,int isSupervisor,double cpf, String bankAccount, String nric, String name, String phoneNum){
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
        this.isSupervisor = isSupervisor;
        this.phoneNum = phoneNum;
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
    
    public int getIsSupervisor() {
        return isSupervisor;
    }
    
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setIsSupervisor(int isSupervisor) {
        this.isSupervisor = isSupervisor;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
