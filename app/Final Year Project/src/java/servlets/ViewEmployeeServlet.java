/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.EmployeeDAO;
import entity.Employee;
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utility.ConnectionManager;

/**
 *
 * @author yemin
 */
public class ViewEmployeeServlet extends HttpServlet {

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
        List<String> nameList = new ArrayList();
        List<String> emailList = new ArrayList();
        List<String> positionList = new ArrayList();
        List<String> isAdminList = new ArrayList();

        List<String> returnNameList = new ArrayList();
        List<String> returnEmailList = new ArrayList();
        List<String> returnPositionList = new ArrayList();
        List<String> returnIsAdminList = new ArrayList();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            EmployeeDAO empDAO = new EmployeeDAO();
            ArrayList<Employee> empList = empDAO.getAllEmployees();

            for (int i = 0; i < empList.size(); i++) {
                Employee emp = empList.get(i);
                nameList.add(emp.getName());
                emailList.add(emp.getEmail());
                positionList.add(emp.getPosition());
                isAdminList.add(emp.getIsAdmin());
            }
            for (int i = 0; i < nameList.size(); i++) {
                returnNameList.add(nameList.get(i));
                returnEmailList.add(emailList.get(i));
                returnPositionList.add(positionList.get(i));
                String isAdmin = isAdminList.get(i);
                if (isAdmin.equals("no")) {
                    returnIsAdminList.add("No");
                } else {
                    returnIsAdminList.add("Yes");
                }
            }

            request.setAttribute("name", returnNameList);
            request.setAttribute("email", returnEmailList);
            request.setAttribute("position", returnPositionList);
            request.setAttribute("isAdmin", returnIsAdminList);
//
//            System.out.println("TEST---------------------" + request.getAttribute("name"));
//            System.out.println("TEST---------------------" + request.getAttribute("endDate"));
            RequestDispatcher rd = request.getRequestDispatcher("ViewEmployee.jsp");
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
