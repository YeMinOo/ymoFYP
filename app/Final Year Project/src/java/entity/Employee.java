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
    private String isAdmin;
    private String currentSalary;
    private String position;
    private String isSupervisor;
    private double cpf;
    private int projectsWorkedOn;
    private String bankAccount;
    private String nric;
    private String name;
    private String phoneNum;

    public Employee(String employeeID, String password, String email, String isAdmin, String currentSalary, String position, String isSupervisor, double cpf, int projectsWorkedOn, String bankAccount, String nric, String name, String phoneNum) {
        this.employeeID = employeeID;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
        this.currentSalary = currentSalary;
        this.position = position;
        this.isSupervisor = isSupervisor;
        this.cpf = cpf;
        this.projectsWorkedOn = projectsWorkedOn;
        this.bankAccount = bankAccount;
        this.nric = nric;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(String currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIsSupervisor() {
        return isSupervisor;
    }

    public void setIsSupervisor(String isSupervisor) {
        this.isSupervisor = isSupervisor;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public int getProjectsWorkedOn() {
        return projectsWorkedOn;
    }

    public void setProjectsWorkedOn(int projectsWorkedOn) {
        this.projectsWorkedOn = projectsWorkedOn;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    
    
    

   
}
