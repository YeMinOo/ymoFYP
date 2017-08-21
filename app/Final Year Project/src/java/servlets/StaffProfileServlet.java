/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utility.ConnectionManager;


/**
 *
 * @author jagdishps.2014
 */
@WebServlet(name = "StaffProfileServlet", urlPatterns = {"/StaffProfileServlet"})
public class StaffProfileServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        
          String name = "";
          String email = "";
          String id= "";
          String number = "";
          String position = "";
          

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            
            String employeeID = (String)session.getAttribute("userId");

            Connection conn = ConnectionManager.getConnection();
            String statement = "SELECT * FROM employee WHERE employee_id=?";
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.setString(1, employeeID);

            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                name = rs.getString(12);
                email = rs.getString(3);
                id = rs.getString(1);
                number = rs.getString(13);
                position = rs.getString(6);
            }

            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("id", id);
            request.setAttribute("number", number);
            request.setAttribute("position", position);
            
            System.out.println("OVER HERE!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(name);
            System.out.println(email);
            System.out.println(id);
            System.out.println(number);
            System.out.println(position);
            
            RequestDispatcher rd = request.getRequestDispatcher("StaffProfile.jsp");
            rd.forward(request, response);
            response.sendRedirect("StaffProfile.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
