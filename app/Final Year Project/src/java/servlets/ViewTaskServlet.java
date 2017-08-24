/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.JobDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
@WebServlet(name = "ViewTaskServlet", urlPatterns = {"/ViewTaskServlet"})
public class ViewTaskServlet extends HttpServlet {

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
        List<String> idList = new ArrayList();
        List<String> startDateList = new ArrayList();
        List<String> endDateList = new ArrayList();
        List<String> recurList = new ArrayList();

        List<String> returnStartDateList = new ArrayList();
        List<String> returnEndDateList = new ArrayList();
        List<String> returnTitleList = new ArrayList();
        List<String> returnIdList = new ArrayList();
        List<String> returnRecurList =new ArrayList();
        List<String> reminderList =new ArrayList();
        JobDAO jobDAO = new JobDAO();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session = request.getSession();
            
            //for reminders
            Date today = new Date(); 
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(today);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            
            String employeeID = (String)session.getAttribute("userId");
            
            ResultSet rs = jobDAO.viewEmployeeTasks(employeeID);
            
            while (rs.next()) {
                titleList.add(rs.getString(2));
                idList.add(rs.getString(1));
                statusList.add(rs.getString(7));
                startDateList.add(rs.getString(3));
                endDateList.add(rs.getString(4));
                recurList.add(rs.getString(8));
            }

            for (int i = 0; i < statusList.size(); i++) {
                String status = statusList.get(i);
                if (status.equals("1")) {
                    //logic for reminder
                    String end = endDateList.get(i);
                    Date endDate = (Date) df.parse(end);
                    cal2.setTime(endDate);
                    
                    int days = daysBetween(cal1.getTime(),cal2.getTime());
                    if(days <= 7){
                       reminderList.add(titleList.get(i));
                    }
                    
                    returnTitleList.add(titleList.get(i));
                    returnStartDateList.add(startDateList.get(i));
                    returnEndDateList.add(endDateList.get(i));
                    returnIdList.add(idList.get(i));
                    returnRecurList.add(recurList.get(i));
                }
            }
            request.setAttribute("title", returnTitleList);
            request.setAttribute("id", returnIdList);
            request.setAttribute("startDate", returnStartDateList);
            request.setAttribute("endDate", returnEndDateList);
            request.setAttribute("recur", returnRecurList);
            request.setAttribute("reminder",reminderList);
//
//            System.out.println("TEST---------------------" + request.getAttribute("id"));
//            System.out.println("TEST---------------------" + request.getAttribute("endDate"));
            RequestDispatcher rd = request.getRequestDispatcher("ViewTask.jsp");
            rd.forward(request, response);
            response.sendRedirect("ViewTask.jsp");
        } catch(SQLException | ParseException e) {
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
    
    public int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
}
