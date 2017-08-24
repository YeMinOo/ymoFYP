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
    private String clientName;
    private String contact;
    private String email;
    
    public Client (String clientId, String clientName, String contact, String email){
        this.clientId = clientId;
        this.clientName = clientName;
        this.contact = contact;
        this.email = email;
    }
    
    public String getName(){
        return clientName;
    }
    
    public String getId(){
        return clientId;
    }
    
    public String getContact() {
        return contact;
    }
    
    public String getEmail() {
        return email;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
