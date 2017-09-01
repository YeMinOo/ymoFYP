<%-- 
    Document   : forgotPassword
    Created on : Sep 1, 2017, 5:02:09 PM
    Author     : yemin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset</title>
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <form class="form-signin" id ="formtype" role="form" action="userIdCheckServlet" method="post">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="text" name='UserId' id="UserId" class="form-control" placeholder="Username" required autofocus>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Submit</button>
                </form><!-- /form -->
            </div><!-- /card-container -->
        </div><!-- /container -->
        <%
            String error = (String) request.getAttribute("error");
            if (error != null && error.equals("Entered User ID does not exist.")) {
                // print error at the top
        %>
        <div class="alert alert-danger">
            <strong>Invalid User ID.</strong> 
        </div>
        <%
            }
        %>
    </body>
</html>
