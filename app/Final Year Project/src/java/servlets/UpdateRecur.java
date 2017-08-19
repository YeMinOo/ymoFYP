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
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.ConnectionManager;

/**
 *
 * @author yemin
 */
@WebServlet(name = "UpdateRecur", urlPatterns = {"/UpdateRecur"})
public class UpdateRecur extends HttpServlet {

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
            ArrayList<String> list = new ArrayList<String>();
            String id = request.getParameter("id");
            String start = request.getParameter("startDate");
            String end = request.getParameter("endDate");
            String recur = request.getParameter("recur");
            
            final String YEAR = "1"; //for year 
            final String HALF = "2"; //HALF YEAR
            final String QUARTER = "4"; //QUARTER 
            final String MONTH = "12"; //MONTHLY
            final String WEEK  = "52"; //weekly

            //System.out.println("STAT=========="+id);
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = (Date) df.parse(start);
            Date endDate = (Date) df.parse(end);
            String newStart = "";
            String newEnd = "";
            //System.out.println("START===================" + startDate);
            if(recur.equals(YEAR)){
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);
                c.add(Calendar.MONTH, 12);
                startDate = (Date) c.getTime();

                c.setTime(endDate);
                c.add(Calendar.MONTH, 12);
                endDate = (Date) c.getTime();

                newStart = df.format(startDate);
                newEnd = df.format(endDate);
            } 
            if(recur.equals(HALF)){
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);
                c.add(Calendar.MONTH, 6);
                startDate = (Date) c.getTime();

                c.setTime(endDate);
                c.add(Calendar.MONTH, 6);
                endDate = (Date) c.getTime();

                newStart = df.format(startDate);
                newEnd = df.format(endDate);
            } 
            if(recur.equals(QUARTER)){
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);
                c.add(Calendar.MONTH, 3);
                startDate = (Date) c.getTime();

                c.setTime(endDate);
                c.add(Calendar.MONTH, 3);
                endDate = (Date) c.getTime();

                newStart = df.format(startDate);
                newEnd = df.format(endDate);
            } 
            if(recur.equals(MONTH)){
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);
                c.add(Calendar.MONTH, 1);
                startDate = (Date) c.getTime();

                c.setTime(endDate);
                c.add(Calendar.MONTH, 1);
                endDate = (Date) c.getTime();

                newStart = df.format(startDate);
                newEnd = df.format(endDate);
            } 
             if(recur.equals(WEEK)){
                Calendar c = Calendar.getInstance();
                c.setTime(startDate);
                c.add(Calendar.DATE, 7);
                startDate = (Date) c.getTime();

                c.setTime(endDate);
                c.add(Calendar.DATE, 7);
                endDate = (Date) c.getTime();

                newStart = df.format(startDate);
                newEnd = df.format(endDate);
            } 
           

            System.out.println("START===================" + newStart);
            System.out.println("END==================" + newEnd);

            Connection conn = ConnectionManager.getConnection();
            String statement = "UPDATE project SET project_status=?, start=?, end=? WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(statement);

            stmt.setInt(1, 0);
            stmt.setString(2, newStart);
            stmt.setString(3, newEnd);
            stmt.setString(4, id);

            stmt.executeUpdate();
            response.sendRedirect("Calendar_Employee.jsp");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
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
