<%-- 
    Document   : forgotPassword
    Created on : Sep 1, 2017, 5:02:09 PM
    Author     : yemin
--%>

<%@page import="Controller.EmployeeController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset</title>
        <link href="css/bootstrap.css" rel="stylesheet">

        <link rel='stylesheet' href='lib/fullcalendar.min.css' />
        <!-- for FF, Chrome, Opera -->
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="16x16">
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="32x32">

        <!-- for IE -->
        <link rel="icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico" >
        <link rel="shortcut icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/fullcalendar.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link href="css/orangetable.css" rel="stylesheet" type="text/css"/>
        <link href="css/calendarExtender.css" rel="stylesheet" type="text/css"/>
        <link href="css/gridview.css" rel="stylesheet" type="text/css"/>
        <link href="css/offcanvas.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="script/prevent-iframe.js"></script>
        <!--<script src="script/jquery.min.js" type="text/javascript"></script>-->
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <style type='text/css'>
            .link
            {
               color:#ffffff;
               text-decoration: none; 
               background-color: none;
            }
            .cellpadding
            {
                padding: 10px 10px 10px 10px;
            }
        </style>
        <style type="text/css">
            html, body{
                position:fixed;
                top:0;
                bottom:0;
                left:0;
                right:0;
            }
            
            footer{
                position:fixed;
                bottom:0;
                left:0;
                right:0;
            }
            
            .bs-docs-featurette + .bs-docs-footer {
                margin-top: 0;
                border-top: 0;
            }

            .bs-docs-footer {
                margin-top: 100px;
                color: #777;
                text-align: center;
                border-top: 1px solid #e5e5e5;
            }
        </style>
    </head>
    <body>
        <nav class="container-fluid" width="100%" height="100%" Style="padding: 1%">
            <nav class="header navbar navbar-default navbar-static-top" Style="padding: 1%">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <div>
                            <table>
                                <tr>
                                    <td style="white-space: nowrap">
                                        <a href="http://www.abaccounting.com.sg/"><img src="images/Abundant Accounting Logo - Copy.png" width="30%" height="30%"/></a>
                                    </td>
                                    <td style="white-space: nowrap">
                                        <a class="navbar-brand" href="http://www.abaccounting.com.sg/">Abundant Accounting</a>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-default navbar-center" style="padding:1%">
                <div class="container-fluid">
                    <div class="container-fluid">
                        <div class="container">
                            <%  
                            EmployeeController empController = new EmployeeController();
                            session.setAttribute("resetToken",empController.generateToken());
                            String error = (String) request.getAttribute("error");
                            if (error != null && error.equals("Entered email does not exist.")) {
                                // print error at the top
                            %>
                                <div class="alert alert-danger">
                                    <strong>Error: Invalid Email</strong> 
                                </div>
                            <%
                            }else if(error!=null && error.equals("email exists.")){
                                response.sendRedirect("waitingPage.jsp");
                                return;
                            } 
                            %>
                            <div class="card card-container" style="padding:0px">
                                <h3>Password Reset</h3>
                                <h5>To reset your password, please enter your email which the reset link will be sent to</h5>
                                <form class="form-signin" id ="formtype" role="form" action="emailCheckServlet" method="post">
                                    <span id="reauth-email" class="reauth-email"></span>
                                    <input type="text" name='Email' id="Email" class="form-control" placeholder="Email" required autofocus>
                                    </br>
                                    <table width='80%' class="cellpadding" align="center">
                                        <tr>
                                            <td>
                                                <button class="btn btn-md btn-primary btn-block btn-signin" type="button" value="cancel" onClick="login.jsp"><a href='login.jsp'><div class='link'>Cancel</div></a></button>
                                            </td>
                                            <td width="1%">                  
                                            </td>
                                            <td>
                                                <button class="btn btn-md btn-primary btn-block btn-signin" type="submit">Submit</button>
                                            </td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </nav>
    </body>
    <footer class="bs-docs-footer" role="contentinfo" style="min-height:'30%'">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
    <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script>
    <script src='js/bootstrap.js'></script>
</html>
