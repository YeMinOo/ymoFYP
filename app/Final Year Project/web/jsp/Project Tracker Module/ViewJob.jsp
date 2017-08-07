<%-- 
    Document   : ViewJob
    Created on : Aug 7, 2017, 5:36:29 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Job</title>
    </head>
    <body>
        <h1>Please select the job id of the job you will like to view:</h1>
        <form action="viewJobServlet" method="post">
            <input type="text" name='jobId' id="jobId" class="form-control" placeholder="Job ID" required autofocus>
            </br>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">View Job!</button>
        </form>
    </body>
</html>
