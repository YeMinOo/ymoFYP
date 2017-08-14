/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.EmployeeDAO;
import entity.Employee;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bernitatowyg
 */
@WebServlet(name = "AddNewRecurringJobServlet", urlPatterns = {"/Source Packages/servlets/AddNewRecurringJobServlet"})
public class AddNewRecurringJobServlet extends HttpServlet {
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
            throws ServletException, IOException, ParseException {
        HttpSession session = request.getSession(true);

        Employee currentStaff = (Employee) session.getAttribute("_loggedInStaff");
        ArrayList<String> addNewJob = new ArrayList<String>();
        // Returns user to login page if not logged in
        if (currentStaff == null) {
            response.sendRedirect("Login.jsp");
            return;
        }
        
        // Gets job information
        String jobTitle = request.getParameter("jobTitle");
        String jobDescription = request.getParameter("jobDescription");
        String client = request.getParameter("clientName");
        String clientID = request.getParameter("clientID");
        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("startDate"));
        Date completionDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("completionDate"));
        Date finalDate = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("finalDate"));
        String interval = request.getParameter("interval");
        String jobPriority = request.getParameter("priorityLevel");
        String employeeAssignedString = request.getParameter("staffAssignedTo");
        Employee employeeAssigned = EmployeeDAO.getEmployee(employeeAssignedString);
        
        //to update db and fullcalendar
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
        //processRequest(request, response);
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
        //processRequest(request, response);
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
