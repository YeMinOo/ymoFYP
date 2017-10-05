/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Controller.EmployeeController;
import dao.EmployeeDAO;
import entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.ProcessBuilder.Redirect.to;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yemin
 */
@WebServlet(name = "emailCheckServlet", urlPatterns = {"/emailCheckServlet"})
public class emailCheckServlet extends HttpServlet {

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
            String email = request.getParameter("Email");

            HttpSession session = request.getSession();
            
            session.setAttribute("email", email);
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee emp = empDAO.getEmployeeByEmail(email);
            
            String resetToken = (String) session.getAttribute("resetToken");
            
            if (emp == null) {
                request.setAttribute("error", "Entered email does not exist.");
                RequestDispatcher rd = request.getRequestDispatcher("forgotPassword.jsp");
                rd.forward(request, response);
            } else {
                //Send email that will lead to password reset page.
                String to = email;
                String from = "beelianabundant@gmail.com";

                Properties m_properties = new Properties();
                m_properties.put("mail.transport.protocol", "smtp");
                m_properties.put("mail.smtp.host", "smtp.gmail.com");
                m_properties.put("mail.smtp.port", "25");
                m_properties.put("mail.smtp.auth", "true");
                m_properties.put("mail.smtp.starttls.enable", "true");
                Authenticator authenticator = new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, "qwerty123$%^");
                    }
                };

                Session session1 = Session.getDefaultInstance(m_properties, authenticator);

                Transport transport = session1.getTransport("smtp");
                //transport.connect(null, "minoo.ye.2015@sis.smu.edu.sg", "Y3M!n00954");

                MimeMessage message = new MimeMessage(session1);
                message.setFrom(new InternetAddress(from));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                message.setSubject("Password Reset");
                if(resetToken != null && resetToken.length() != 0) {
                    message.setText("Dear user, please follow http://localhost:8084/Final_Year_Project/reset.jsp?token="+resetToken+" to reset your password. ");
                } else {
                    response.sendRedirect("display.jsp");
                    return;
                }

                // Send message  
                Transport.send(message);
                //System.out.println("message sent successfully....");

                //request.setAttribute("emailMsg", "Email has been sent successfully.");
                //RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                //rd.forward(request, response);
                request.setAttribute("error", "email exists.");
                RequestDispatcher rd = request.getRequestDispatcher("forgotPassword.jsp");
                rd.forward(request, response);
//                session.setAttribute("emailMsg","Email has been sent successfully.");
//                response.sendRedirect("login.jsp");
            }
        } catch (MessagingException mex) {
            mex.printStackTrace();
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
