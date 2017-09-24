/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Client;
import entity.Job;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utility.ConnectionManager;

/**
 *
 * @author Bernitatowyg
 */
public class ClientDAO {
    
    public boolean addNewClient(String companyCategory, String businessType, String companyName, String incorporation, String UenNumber, String officeContact, String mobileContact, String emailAddress, String officeAddress, String financialYearEnd, String gst, String director, String shareholder, String secretary){
        try (Connection conn = ConnectionManager.getConnection()){
            PreparedStatement stmt = conn.prepareStatement( "Insert into client values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          
            stmt.setString(1, Integer.toString(getCounter()));
            stmt.setString(2, companyCategory);
            stmt.setString(3, businessType);
            stmt.setString(4, companyName);
            stmt.setString(5, incorporation);
            stmt.setString(6, UenNumber);
            stmt.setString(7, officeContact);
            stmt.setString(8, mobileContact);
            stmt.setString(9, emailAddress);
            stmt.setString(10, officeAddress);
            stmt.setString(11, financialYearEnd);
            stmt.setString(12, gst);
            stmt.setString(13, director);
            stmt.setString(14, shareholder);
            stmt.setString(15, secretary);
            
            
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 1) {
                return true;
            }    
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false; 
    }
    
    public void updateClient(String clientId, String companyCategory, String businessType, String companyName, String incorporation, String UenNumber, String officeContact, String mobileContact, String emailAddress, String officeAddress, String financialYearEnd, String gst, String director, String shareholder, String secretary){
            try (Connection conn = ConnectionManager.getConnection()){
            String statement = "UPDATE client SET companyCategory=?, businessType=?, companyName=?, incorporation=?, UENNumber=?, officeContact=?, mobileContact=?, contactEmailAddress=?, officeAddress=?, financialYearEnd=?, gst=?, director=?, shareholder=?, secretary=? WHERE clientId=?";
            PreparedStatement stmt = conn.prepareStatement(statement);
            
            stmt.setString(1, companyCategory);
            stmt.setString(2, businessType);
            stmt.setString(3, companyName);
            stmt.setString(4, incorporation);
            stmt.setString(5, UenNumber);
            stmt.setString(6, officeContact);
            stmt.setString(7, mobileContact);
            stmt.setString(8, emailAddress);
            stmt.setString(9, officeAddress);
            stmt.setString(10, financialYearEnd);
            stmt.setString(11, gst);
            stmt.setString(12, director);
            stmt.setString(13, shareholder);
            stmt.setString(14, secretary);
            stmt.setString(15, clientId);
            stmt.executeUpdate();
            
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteClient(String clientId){
            try (Connection conn = ConnectionManager.getConnection()){
            String statement = "DELETE from client WHERE clientId=? ";
            PreparedStatement stmt = conn.prepareStatement(statement);
            
            stmt.setString(1,clientId);
            stmt.executeUpdate();
            
            } catch (SQLException e){
            e.printStackTrace();
        }
    }
     public static int getCounter() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stmt = conn.prepareStatement("Select max(clientId) from client");
        ResultSet rs = stmt.executeQuery();
        rs.last();
        int temp = rs.getInt("max(clientId)");
        //Integer tempCount = Integer.parseInt(temp);
        int counter = temp + 1;

        return counter;
    }
     
    public static ArrayList<Client> getAllClient(){
        ArrayList<Client> clientList = new ArrayList();
   
        try(Connection conn = ConnectionManager.getConnection()){
            String statement = "SELECT * FROM CLIENT";
            PreparedStatement stmt = conn.prepareStatement(statement);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Client client = new Client(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
                clientList.add(client);
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return clientList; 
        
    }
    
    public static Client getClientById(String id){
        Client client = null;
        try(Connection conn = ConnectionManager.getConnection()){
            String statement = "SELECT * FROM CLIENT where clientId = ?";
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                client = new Client(rs.getString(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15));
               
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return client; 
    }
}
