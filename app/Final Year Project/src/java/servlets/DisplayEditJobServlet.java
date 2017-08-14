/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.JobDAO;
import entity.Job;
import entity.Employee;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
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
@WebServlet(name = "DisplayEditJobServlet", urlPatterns = {"/DisplayEditJobServlet"})
public class DisplayEditJobServlet extends HttpServlet {
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
        
        String jobId = (String)request.getParameter("jobId");
        String clientId = (String)request.getParameter("clientId");
        JobDAO jobDao = new JobDAO();
        Job job = JobDAO.getJob(clientId, jobId);
        
        if(job==null){
            //if job == null then send error that job does not exists
            response.sendRedirect("ErrorJob.jsp");
        }else{
            // get all the info to display about the job and then send over to displayjobtodelete
            String jobID = job.getJobID();
            String jobTitle = job.getJobTitle();
            String jobDescription = job.getJobDescription();
            String clientName = job.getClientName();
            String clientID = job.getClientID();
            Date startDate = job.getStartDate();
            Date completionDate = job.getCompletionDate();
            Date finalDate = job.getFinalDate();
            String priorityLevel = job.getPriorityLevel();
            Employee staffAssignedTo = job.getStaffAssignedTo();
            String status = job.getStatus();
            String jobtype = job.getJobType();
            String interval = job.getInterval();
            
            request.setAttribute("jobId", jobID);
            request.setAttribute("jobTitle", jobTitle);
            request.setAttribute("jobDescription", jobDescription);
            request.setAttribute("clientName", clientName);
            request.setAttribute("clientID", clientID);
            request.setAttribute("startDate", startDate);
            request.setAttribute("completionDate", completionDate);
            request.setAttribute("finalDate", finalDate);
            request.setAttribute("priorityLevel", priorityLevel);
            request.setAttribute("staffAssignedTo", staffAssignedTo);
            request.setAttribute("status", status);
            request.setAttribute("jobtype", jobtype);
            request.setAttribute("interval", interval);
            
            RequestDispatcher rd = request.getRequestDispatcher("DisplayJobToEdit.jsp");
            rd.forward(request, (ServletResponse) response);
            response.sendRedirect("DisplayJobToEdit.jsp");
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
