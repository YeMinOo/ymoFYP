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
    private ArrayList<Job> currentJobs;
    private ArrayList<Job> pastJobs;
    
    public Client (String clientId, String clientName, ArrayList<Job> currentJobs, ArrayList<Job> pastJobs){
        this.clientId = clientId;
        this.clientName = clientName;
        this.currentJobs = currentJobs;
        this.currentJobs = pastJobs;
    }
    
    public String getName(){
        return clientName;
    }
    
    public String getId(){
        return clientId;
    }
    
    public ArrayList<Job> getCurrentJobs(){
        return currentJobs;
    }
    
    public ArrayList<Job> getPastJobs(){
        return pastJobs;
    }
}
