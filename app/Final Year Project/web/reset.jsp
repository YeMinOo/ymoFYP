<%-- 
    Document   : reset
    Created on : Sep 1, 2017, 5:13:56 PM
    Author     : yemin
--%>

<%@page import="dao.PasswordDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reset Password</title>
    </head>
    <body>
        <p>Min 8 characters in length</p>
        <div class="container">
            <div class="card card-container">
                <form class="form-signin" id ="formtype" role="form" action="resetPasswordServlet" method="post">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="text" name='newPwd' id="newPwd" class="form-control" placeholder="Enter new password" required autofocus>
                    <input type="text" name='newPwdConfirm' id="newPwdConfirm" class="form-control" placeholder="Confirm new password" required autofocus>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Submit</button>
                </form><!-- /form -->
            </div><!-- /card-container -->
        </div><!-- /container -->
        <%  if (session.getAttribute("resetToken") == null) {
            response.sendRedirect("display.jsp");
        }
            String error = (String) request.getAttribute("msg");
            if (error != null && error.equals("Passwords Mismatched!!")) {
                // print error at the top
        %>
        <div class="alert alert-danger">
            <strong>Passwords Mismatched!!</strong>
        </div>
        <%
            }
        %>

    </body>
</html>
