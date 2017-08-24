/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utility.ConnectionManager;

/**
 *
 * @author Bernitatowyg
 */
public class ClientDAO {
    
    private static String getClientByIDStatement = "SELECT * FROM CLIENTELE WHERE client_id = ?";
    
    public static Client getClientByID (String clientId){
        try(Connection conn = ConnectionManager.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(getClientByIDStatement);
            stmt.setString(1, clientId);
            
            ResultSet rs = stmt.executeQuery();
            
            String id = rs.getString(1);
            String clientName = rs.getString(2);
            String contact = rs.getString(3);
            String email = rs.getString(4);
            
            return new Client(id, clientName, contact, email);
        } catch (SQLException e) {
            System.out.println("ClientDAO: (getCietByID) = "+e.toString());
        }
        return null;
    }
}
