/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.EmployeeDAO;
import entity.Employee;
import is203.JWTException;
import is203.JWTUtility;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author yemin
 */
public class EmployeeController {
    private EmployeeDAO empDAO;
    
    public EmployeeController() {
        empDAO = new EmployeeDAO();
    }
    
    /**
     * Uses JWTUtility to generate a token
     *
     * @param user user object of the user
     * @return generated token if user is admin else null
     */
    public String generateToken(Employee employee) {
        if(employee.getIsAdmin() == 0) {
            return JWTUtility.sign(getSharedSecret(), employee.getEmployeeID());
        }
        return null;
    }
    
    /**
     * Uses JWTUtility to verify a token
     *
     * @param token string of the token
     * @return verified token if token is valid else null
     */
    public String verifyToken(String token) {
        try {
            return JWTUtility.verify(token, getSharedSecret());
        } catch (JWTException ex) {
            return null;
        }
    }
    
    /**
     * Retrieve the sharedKey from the web.xml
     *
     * @return return sharedKey from web.xml if it exists else null
     */
    private String getSharedSecret() {
        try {

            Context env = (Context) new InitialContext().lookup("java:comp/env");

            // Get a single value
            return (String) env.lookup("sharedKey");
        } catch (NamingException ex) {
            System.out.println("Employee.java (getSharedSecret): " + ex.toString());
        }
        return null;
    }
}
