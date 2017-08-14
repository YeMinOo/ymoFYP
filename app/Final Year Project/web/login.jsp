<%-- 
    Document   : login
    Created on : Aug 14, 2017, 4:17:31 PM
    Author     : yemin
--%>

<%@page import="entity.User"%>
<%--
    Document   : Login
    Created on : Jun 24, 2017, 1:00:55 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    //Checks session if user is already logged in.
    User user = (User) session.getAttribute("_loggedInUser");

    //after log in, to check if user is admin or employee
    if (user != null && user.getUserId() != null) {
        if (user.getIsAdmin()==1) {
            response.sendRedirect("EmployeeHome.jsp");
        } else {
            response.sendRedirect("AdminHome.jsp");
        }
        return;
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
        <%-- this is for tab name --%>
        <title>Login | Abundant Accounting Management System</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        
        <!-- for FF, Chrome, Opera -->
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="16x16">
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="32x32">

        <!-- for IE -->
        <link rel="icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico" >
        <link rel="shortcut icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico"/>
        
        <style>
            body, html {
                height: 100%;
                background-repeat: no-repeat;
            }

            .card-container.card {
                max-width: 350px;
                padding: 40px 40px;
            }

            .btn {
                font-weight: 700;
                height: 36px;
                -moz-user-select: none;
                -webkit-user-select: none;
                user-select: none;
                cursor: default;
            }

            /*
             * Card component
             */
            .card {
                background-color: #F7F7F7;
                /* just in case there no content*/
                padding: 20px 25px 30px;
                margin: 0 auto 25px;
                margin-top: 50px;
                /* shadows and rounded borders */
                -moz-border-radius: 2px;
                -webkit-border-radius: 2px;
                border-radius: 2px;
                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            }

            .profile-img-card {
                width: 96px;
                height: 96px;
                margin: 0 auto 10px;
                display: block;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
            }

            /*
             * Form styles
             */
            .profile-name-card {
                font-size: 16px;
                font-weight: bold;
                text-align: center;
                margin: 10px 0 0;
                min-height: 1em;
            }

            .reauth-email {
                display: block;
                color: #404040;
                line-height: 2;
                margin-bottom: 10px;
                font-size: 14px;
                text-align: center;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin #inputUsername,
            .form-signin #inputPassword {
                direction: ltr;
                height: 44px;
                font-size: 16px;
            }

            .form-signin input[type=text],
            .form-signin input[type=password],
            .form-signin input[type=text],
            .form-signin button {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                z-index: 1;
                position: relative;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin .form-control:focus {
                border-color: rgb(104, 145, 162);
                outline: 0;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
            }

            .btn.btn-signin {
                /*background-color: #4d90fe; */
                background-color: rgb(104, 145, 162);
                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/
                padding: 0px;
                font-weight: 700;
                font-size: 14px;
                height: 36px;
                -moz-border-radius: 3px;
                -webkit-border-radius: 3px;
                border-radius: 3px;
                border: none;
                -o-transition: all 0.218s;
                -moz-transition: all 0.218s;
                -webkit-transition: all 0.218s;
                transition: all 0.218s;
            }
            body{
                padding: 0;
                margin: 0;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class='col-md-4' style='margin-top:20px'>
                    <h1 style="color:#0000A0; margin-top:10px;">
                        Abundant Accounting Management System
                    </h1>
                </div>
            </div>
        </nav>
        
        <%
            //generate error message if login fails
            String login_fail = (String) request.getAttribute("loginFailed");
            if (login_fail != null) {
        %>
                <div class="alert alert-danger">
                    <strong>ERROR</strong> <%= login_fail%>
                </div>
            <%}%>
        
        <div class="container">
            <div class="card card-container">
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <form class="form-signin" id ="formtype" role="form" action="loginServlet" method="post">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="text" name='UserId' id="UserId" class="form-control" placeholder="Username" required autofocus>
                    <input type="password" name='Password' id="Password" class="form-control" placeholder="Password" required>
                    
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
                </form><!-- /form -->
            </div><!-- /card-container -->
        </div><!-- /container -->
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<script sec='js/bootstrap.js'></script>
</html>

