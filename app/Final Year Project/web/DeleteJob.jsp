<%-- 
    Document   : DeleteJob
    Created on : Jul 22, 2017, 12:01:10 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Jobs</title>
    </head>
    <body>
        Please indicate Job ID of Job to be deleted:
        <br>
         <form action='DeleteJobServlet' method='post'>
            <label>Client Id </label>
            <input type ="text" name="clientId" id="clientId" class="form-control" placeholder="Client ID" required autofocus>
            </br>
            <label>Job Id </label>
            <input type ="text" name="jobId" id="jobId" class="form-control" placeholder="Job ID" required autofocus>
            </br>
         </form>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
