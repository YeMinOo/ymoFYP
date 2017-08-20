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
            <form action="AddNewJobServlet" method="post">
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" id="Recurring">Recurring</button>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit" id="AdHoc">AdHoc</button>
            </form>
        </div>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>