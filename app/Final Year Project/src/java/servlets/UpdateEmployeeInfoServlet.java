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
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "UpdateEmployeeInfoServlet", urlPatterns = {"/UpdateEmployeeInfoServlet"})
public class UpdateEmployeeInfoServlet extends HttpServlet {

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
            String employeeID = (String) request.getAttribute("id");
            String password = (String) request.getAttribute("password");
            String email = (String) request.getAttribute("email");
            int isAdmin = Integer.parseInt((String)request.getAttribute("isAdmin"));
            String currentSalary = (String) request.getAttribute("currentSalary");
            String position = (String) request.getAttribute("position");
            String supervisor = (String) request.getAttribute("supervisor");
            String cpf = (String) request.getAttribute("cpf");
            int numProjects = (int) request.getAttribute("numProjects");
            String bankAcct = (String) request.getAttribute("bankAcct");
            String nric = (String) request.getAttribute("nric");
            String name = (String) request.getAttribute("name");
            String number = (String) request.getAttribute("number");

            EmployeeDAO employeeDao = new EmployeeDAO();
            boolean status = employeeDao.updateEmployeeDetails(employeeID, email, isAdmin, currentSalary, position, supervisor, cpf, bankAcct, nric, name, number);
            RequestDispatcher rd = request.getRequestDispatcher("ViewEmployee.jsp");
            request.setAttribute("status", status);
            rd.forward(request, response);
            // will forward status of "true" or "false", if false means there's some sort of error
            response.sendRedirect("ViewEmployee.jsp");
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
