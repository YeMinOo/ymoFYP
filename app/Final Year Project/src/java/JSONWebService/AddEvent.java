/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONWebService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.ConnectionManager;

/**
 *
 * @author jagdishps.2014
 */
@WebServlet(name = "AddEvent", urlPatterns = {"/AddEvent"})
public class AddEvent extends HttpServlet {

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

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String title = request.getParameter("title");
            String companyName = request.getParameter("companyName");
            String start = request.getParameter("startDate");
            String end = request.getParameter("endDate");
            String remarks = request.getParameter("remarks");
            String assignEmployee = request.getParameter("assignEmployee");
            String assignEmployee1 = request.getParameter("assignEmployee1");
            String reviewer = request.getParameter("reviewer");
            String companyCat = request.getParameter("companyCat");
            String businessType = request.getParameter("businessType");
            
            System.out.println("EMPLOYEE===================="+assignEmployee);
            
            Connection conn = ConnectionManager.getConnection();
            String statement = "Insert into project values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(statement);

            stmt.setInt(1, getCounter());
            stmt.setInt(2, getProjectID(companyName));
            stmt.setString(3, title);
            stmt.setString(4, companyName);
            stmt.setString(5, companyCat);
            stmt.setString(6, businessType);
            stmt.setString(7, start);
            stmt.setString(8, end);
            stmt.setString(9, remarks);
            stmt.setString(10, assignEmployee);
            stmt.setString(11, assignEmployee1);
            stmt.setString(12, reviewer);
            stmt.setString(13, "Incomplete");
            stmt.setInt(14, 12); //recurring project values
            stmt.setString(15, "Incomplete");
            stmt.executeUpdate();

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

    public int getCounter() throws SQLException {

        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stmt = conn.prepareStatement("Select max(id) from project");
        ResultSet rs = stmt.executeQuery();
        rs.last();
        int temp = rs.getInt("max(id)");
        //Integer tempCount = Integer.parseInt(temp);
        int counter = temp + 1;

        return counter;
    }
    
    public int getProjectID(String companyName) throws SQLException { 
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement stmt = conn.prepareStatement("Select max(projectID) from project where companyName = ?");
        stmt.setString(1,companyName);
        ResultSet rs = stmt.executeQuery();
        rs.last();
        int temp = rs.getInt("max(projectID)");
        //Integer tempCount = Integer.parseInt(temp);
        int counter = temp + 1;

        return counter;
    }
}
