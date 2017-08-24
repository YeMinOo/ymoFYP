/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.JobDAO;
import entity.Job;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
 * @author yemin
 */
@WebServlet(name = "TaskAssignedTableServlet", urlPatterns = {"/TaskAssignedTableServlet"})
public class TaskAssignedTableServlet extends HttpServlet {

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
        
        List<String> titleList = new ArrayList();
        List<String> statusList = new ArrayList();
        List<String> remarksList = new ArrayList();
        List<String> assignedEmployeeList = new ArrayList();
        List<String> startDateList = new ArrayList();
        List<String> endDateList = new ArrayList();
        List<String> projectStatusList = new ArrayList();
        JobDAO jobDAO = new JobDAO(); 
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            ArrayList<Job> jobList = jobDAO.viewAllTasks();
            
            for(int i = 0; i < jobList.size(); i++){
                Job job = jobList.get(i);
                titleList.add(job.getJobTitle());
                startDateList.add(df.format(job.getStartDate()));
                endDateList.add(df.format(job.getEndDate()));
                remarksList.add(job.getRemarks());
                assignedEmployeeList.add(job.getAssignedEmployee());
                statusList.add(Boolean.toString(job.getStatus()));
                
        
            }

            request.setAttribute("title", titleList);
            request.setAttribute("startDate", startDateList);
            request.setAttribute("endDate", endDateList);
            request.setAttribute("remarks", remarksList);
            request.setAttribute("assignedEmployee", assignedEmployeeList);
            request.setAttribute("projectStatus", statusList);

//            System.out.println("TEST---------------------" + request.getAttribute("title"));
//            System.out.println("TEST---------------------" + request.getAttribute("endDate"));
            RequestDispatcher rd = request.getRequestDispatcher("Task_Assigned_Table.jsp");
            rd.forward(request, response);

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
