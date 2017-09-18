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
public class Client {
    private String clientId;
    private String companyCategory; 
    private String businessType;
    private String companyName;
    private String incorporation; 
    private String UenNumber;
    private String officeContact;
    private String mobileContact;
    private String emailAddress;
    private String officeAddress;
    private String financialYearEnd;
    private String gst; 
    private String director; 
    private String shareholder;
    private String secretary;

    public Client(String clientId, String companyCategory, String businessType, String companyName, String incorporation, String UenNumber, String officeContact, String mobileContact, String emailAddress, String officeAddress, String financialYearEnd, String gst, String director, String shareholder, String secretary) {
        this.clientId = clientId;
        this.companyCategory = companyCategory;
        this.businessType = businessType;
        this.companyName = companyName;
        this.incorporation = incorporation;
        this.UenNumber = UenNumber;
        this.officeContact = officeContact;
        this.mobileContact = mobileContact;
        this.emailAddress = emailAddress;
        this.officeAddress = officeAddress;
        this.financialYearEnd = financialYearEnd;
        this.gst = gst;
        this.director = director;
        this.shareholder = shareholder;
        this.secretary = secretary;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIncorporation() {
        return incorporation;
    }

    public void setIncorporation(String incorporation) {
        this.incorporation = incorporation;
    }

    public String getUenNumber() {
        return UenNumber;
    }

    public void setUenNumber(String UenNumber) {
        this.UenNumber = UenNumber;
    }

    public String getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(String officeContact) {
        this.officeContact = officeContact;
    }

    public String getMobileContact() {
        return mobileContact;
    }

    public void setMobileContact(String mobileContact) {
        this.mobileContact = mobileContact;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getFinancialYearEnd() {
        return financialYearEnd;
    }

    public void setFinancialYearEnd(String financialYearEnd) {
        this.financialYearEnd = financialYearEnd;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getShareholder() {
        return shareholder;
    }

    public void setShareholder(String shareholder) {
        this.shareholder = shareholder;
    }

    public String getSecretary() {
        return secretary;
    }

    public void setSecretary(String secretary) {
        this.secretary = secretary;
    }
    
    
}    