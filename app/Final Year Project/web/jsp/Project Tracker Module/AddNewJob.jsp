<%-- 
    Document   : addNewJob
    Created on : Jul 16, 2017, 9:31:15 AM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Job</title>            
    </head>
    <body>
        <div class="container">
            <p> Please select type of job you want to add!</p>
            <form action="../.././Source_Packages/servlets/AddNewJobServlet" method="post">
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" id="Recurring">Recurring</button>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" id="AdHoc">AdHoc</button>
            </form>
        </div>
    </body>
</html>