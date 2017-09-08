/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.EmployeeDAO;
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
@WebServlet(name = "AddEmployee", urlPatterns = {"/AddEmployee"})
public class AddEmployee extends HttpServlet {

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
            String employeeName = (String)request.getAttribute("employeeName");
            String employeeNRIC = (String)request.getAttribute("employeeNRIC");
            String employeeEmail = (String)request.getAttribute("employeeEmail");
            String employeeNumber = (String)request.getAttribute("employeeNumber");
            String employeeBankAccount = (String)request.getAttribute("employeeBankAccount");
            String employeeCPF = (String)request.getAttribute("employeeCPF");
            String employeePosition = (String)request.getAttribute("employeePosition");
            String supervisor = (String)request.getAttribute("supervisor");
            String employeeSalary = (String)request.getAttribute("employeeSalary");
            String isAdminValue = (String)request.getAttribute("isAdmin");
            //if it is admin, should be 0
            int isAdmin = 1;
            if(isAdminValue=="yes"){
                isAdmin = 0;
            }
            String tempPassword = (String)request.getAttribute("tempPassword");
            int projectsWorkedOn = 0;
            String employeeID = employeeEmail.substring(0, employeeEmail.indexOf("@"));
            
            EmployeeDAO empDAO= new EmployeeDAO();
            if(empDAO.createEmployee(employeeID, tempPassword, employeeEmail, isAdmin, employeeSalary, employeePosition, supervisor, employeeCPF, projectsWorkedOn, employeeBankAccount, employeeNRIC, employeeName, employeeNumber)) {
                request.setAttribute("Employee Added", "status");
            } else {
                request.setAttribute("Unable to add Employee", "status");
            }
            RequestDispatcher rd = request.getRequestDispatcher("CreateUser.jsp");
            rd.forward(request,response);
            response.sendRedirect("CreateUser.jsp");
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
