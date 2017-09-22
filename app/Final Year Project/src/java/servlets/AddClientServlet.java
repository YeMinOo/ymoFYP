/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ClientDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jagdishps.2014
 */
@WebServlet(name = "AddClientServlet", urlPatterns = {"/AddClientServlet"})
public class AddClientServlet extends HttpServlet {

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
            String companyCategory = request.getParameter("companyCategory");

            String businessType = request.getParameter("businessType");
            String companyName = request.getParameter("companyName");
            String incorporation = request.getParameter("incorporation");
            String UenNumber = request.getParameter("UenNumber");
            String officeContact = request.getParameter("officeContact");
            String mobileContact = request.getParameter("mobileContact");
            String emailAddress = request.getParameter("emailAddress");
            String officeAddress = request.getParameter("officeAddress");
            String financialYearEnd = request.getParameter("financialYearEnd");
            String gst = request.getParameter("gst");
            String director = request.getParameter("director");
            String shareholder = request.getParameter("shareholder");
            String secretary = request.getParameter("secretary");

            ClientDAO clientDAO = new ClientDAO();
            boolean added = clientDAO.addNewClient(companyCategory, businessType, companyName, incorporation, UenNumber, officeContact, mobileContact, emailAddress, officeAddress, financialYearEnd, gst, director, shareholder, secretary);

            if (added) {
                request.setAttribute("Client Added", "status");
//                RequestDispatcher rd = request.getRequestDispatcher("CreateClient.jsp");
//                rd.forward(request, response);
                response.sendRedirect("CreateClient.jsp");
                
            } else {
                request.setAttribute("Problem Creating New User, Please Try Again", "status");
                RequestDispatcher rd = request.getRequestDispatcher("CreateClient.jsp");
                rd.forward(request, response);
               
            }

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
