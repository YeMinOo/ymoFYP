/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.JobDAO;
import dao.EmployeeDAO;
import entity.Job;
import entity.Employee;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bernitatowyg
 */
@WebServlet(name = "EditJobServlet", urlPatterns = {"/EditJobServlet"})
public class EditJobServlet extends HttpServlet {
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
            throws ServletException, IOException, SQLException, ParseException {
        //response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);

        Employee currentStaff = (Employee) session.getAttribute("_loggedInStaff");
        ArrayList<String> addNewJob = new ArrayList<String>();
        // Returns user to login page if not logged in
        if (currentStaff == null) {
            response.sendRedirect("Login.jsp");
            return;
        }
        
        String jobID = (String)request.getParameter("jobId");
        String jobTitle = (String)request.getParameter("jobTitle");
        String jobDescription = (String)request.getParameter("jobDescription");
        String clientName = (String)request.getParameter("clientName");
        String clientID = (String)request.getParameter("clientID");
        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("startDate");
        Date completionDate = new SimpleDateFormat("dd/MM/yyyy").parse("completionDate");
        Date finalDate = new SimpleDateFormat("dd/MM/yyyy").parse("finalDate");
        String priorityLevel = (String)request.getParameter("priorityLevel");
        EmployeeDAO staffDao = new EmployeeDAO();
        Employee employeeAssignedTo = staffDao.getEmployee((String)request.getParameter("employeeAssignedTo"));
        String status = (String)request.getParameter("status");
        String jobtype = (String)request.getParameter("jobtype");
        String interval = (String)request.getParameter("interval");

        // update database and fullcalendar based on jobID and then redirect to success page
        JobDAO jobDao = new JobDAO();
        jobDao.deleteJob(clientID, jobID);
        jobDao.addJob(clientID, jobTitle, jobDescription, clientName, startDate, completionDate, finalDate, priorityLevel, employeeAssignedTo, status, jobtype, interval);
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ParseException {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ParseException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}