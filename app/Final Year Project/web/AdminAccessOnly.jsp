<%-- 
    Document   : AdminAccessOnly
    Created on : Sep 8, 2017, 3:54:59 PM
    Author     : Bernitatowyg
--%>

<%@page import="dao.EmployeeDAO"%>
<%@page import="entity.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //
    // Admin Access Only checks if the user is admin, if not, redirect to homepage
    //

    // Ensures session variable is not cached! 
    // Always checks if user is logged in - Even if back button is clicked!
    response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
    response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
    response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
    response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
    
    // Obtain user from session attribute: userId
    String userId = (String) session.getAttribute("userId");
    EmployeeDAO employeeDAO = new EmployeeDAO();
    Employee emp = employeeDAO.getEmployeeByID(userId);
    int isAdmin = emp.getIsAdmin();
    if(isAdmin!=0){
        //it is not an admin!
        request.setAttribute("isAdmin", "Not an Admin"); 
        RequestDispatcher rd = request.getRequestDispatcher("Calendar_Employee");
        rd.forward(request, (ServletResponse) response);
        response.sendRedirect("Calendar_Employee");
    }
%>

