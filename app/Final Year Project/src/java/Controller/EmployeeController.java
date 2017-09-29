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
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author yemin
 */
public class EmployeeController {

    private EmployeeDAO empDAO;
    protected static SecureRandom random = new SecureRandom();

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
        if (employee.getIsAdmin().equals("yes")) {
            long longToken = Math.abs(random.nextLong());
            String randomToken = Long.toString(longToken, 16);
            return JWTUtility.sign(randomToken, employee.getEmployeeID());
        }
        return null;
    }

    public String generateToken() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        long longToken = Math.abs(random.nextLong());
        String randomToken = Long.toString(longToken, 16);
        return JWTUtility.sign(randomToken, df.format(date));
    }
}
