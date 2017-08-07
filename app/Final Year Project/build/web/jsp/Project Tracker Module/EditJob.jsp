<%-- 
    Document   : EditJob
    Created on : Jul 22, 2017, 12:00:35 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Jobs - Please select a job to edit</title>
    </head>
    <body>
        <div class="container">
            <p>
                <form action='EditJobServlet' method='post'>
                    <label>Client: </label>
                    <input type ="text" name="clientName" id="clientName" class="form-control" placeholder="Client Name" required autofocus>
                    </br>
                    <label>Client ID: </label>
                    <input type ="text" name="clientID" id="clientID" class="form-control" placeholder="Client ID" required autofocus>
                    </br>
                    <label>Job Title: </label>
                    <input type="text" name='jobTitle' id="inputJobTitle" class="form-control" placeholder="Job Title" required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Edit Job!</button>
                </form>
            </p>
        </div>
    </body>
</html>
