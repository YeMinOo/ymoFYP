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
@WebServlet(name = "ClientProfileServlet", urlPatterns = {"/ClientProfileServlet"})
public class ClientProfileServlet extends HttpServlet {

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
          String name = "";
          String email = "";
          String id= "";
          String number = "";
          
          id = (String) request.getAttribute("clientID");
          

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            

            Connection conn = ConnectionManager.getConnection();
            String statement = "SELECT * FROM clientele WHERE client_id=?";
            PreparedStatement stmt = conn.prepareStatement(statement);
            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                name = rs.getString(2);
                email = rs.getString(4);
                id = rs.getString(1);
                number = rs.getString(3);
                
            }

            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("id", id);
            request.setAttribute("number", number);
            
            
           
            
            RequestDispatcher rd = request.getRequestDispatcher("ClientProfile.jsp");
            rd.forward(request, response);
            response.sendRedirect("ClientProfile.jsp");
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
