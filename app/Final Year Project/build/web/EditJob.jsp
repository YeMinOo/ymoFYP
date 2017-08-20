<%-- 
    Document   : EditJob
    Created on : Jul 22, 2017, 12:00:35 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Jobs</title>
    </head>
    <body>
        <div class="container">
            <p>
            <h1> Please input ClientID and JobID of job to be edited! </h1>
                <form action='displayEditJobServlet' method='post'>
                    <label>Client id: </label>
                    <input type="text" name='clientId' id="clientId" class="form-control" placeholder="Client ID" required autofocus>
                    </br>
                    <label>Job id: </label>
                    <input type="text" name='jobId' id="jobId" class="form-control" placeholder="Job ID" required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Enter!</button>
                </form>
            </p>
        </div>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
