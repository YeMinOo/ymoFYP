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
@WebServlet(name = "UpdateClientServlet", urlPatterns = {"/UpdateClientServlet"})
public class UpdateClientServlet extends HttpServlet {

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
            String clientId = (String)request.getAttribute("clientId");
            String companyCategory = (String)request.getAttribute("companyCategory");
            String businessType = (String)request.getAttribute("businessType");
            String companyName = (String)request.getAttribute("companyName");
            String incorporation = (String)request.getAttribute("incorporation");
            String UenNumber = (String)request.getAttribute("UenNumber");
            String officeContact = (String)request.getAttribute("officeContact");
            String mobileContact = (String)request.getAttribute("mobileContact");
            String emailAddress = (String)request.getAttribute("emailAddress");
            String officeAddress = (String)request.getAttribute("officeAddress");
            String financialYearEnd = (String)request.getAttribute("financialYearEnd");
            String gst = (String)request.getAttribute("gst"); 
            String director = (String)request.getAttribute("director");
            String shareholder = (String)request.getAttribute("shareholder");
            String secretary = (String)request.getAttribute("secretary");
            
            ClientDAO clientDAO= new ClientDAO();
            
            clientDAO.updateClient(clientId,companyCategory,businessType,companyName,incorporation,UenNumber,officeContact,mobileContact,emailAddress,officeAddress,financialYearEnd,gst,director,shareholder,secretary);
            request.setAttribute("Client Updated", "status");
            
            RequestDispatcher rd = request.getRequestDispatcher("UpdateClient.jsp");
            rd.forward(request,response);
            response.sendRedirect("UpdateClient.jsp");
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
