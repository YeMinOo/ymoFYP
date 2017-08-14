<%-- 
    Document   : admin_index
    Created on : Aug 14, 2017, 6:53:35 PM
    Author     : yemin
--%>

<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String empId = (String)session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee emp = empDAO.getEmployeeByID(empId);
            %>
        <h1>
            Hello 
            <%
                out.println(emp.getName());
                %>
        </h1>
    </body>
</html>
