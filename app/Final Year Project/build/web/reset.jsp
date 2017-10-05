
<!DOCTYPE html>
<html height="100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css" />
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
            
           .cellpadding
            {
                padding: 10px 10px 10px 10px;
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
            
            .submitbutton
            {
                margin: 0 auto;
                width: 60%; 
            }
        </style>
    </head>
    <body height="100%">
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
            <nav width="100%" Style="padding: 0%">
                <%  
                if (session.getAttribute("resetToken") == null) {
                    response.sendRedirect("display.jsp");
                }
                    String error = (String) request.getAttribute("msg");
                    if (error != null && error.equals("Passwords Mismatched!!")) {
                        // print error at the top
                %>
                        <div class="alert alert-danger">
                            <strong>Error: Passwords Mismatched!</strong>
                        </div>
                <%
                    }
                %>
                <div class="container-fluid" width="100%" Style="padding: 0%">
                    <div class="container" width="100%" Style="padding: 0%">
                        <div class="card card-container" style="padding:0px">
                            <div id="main">
                                <div class="container">
                                    <div class="card card-container">
                                        <form class="form-signin" id ="formtype" role="form" action="resetPasswordServlet" method="post">
                                            <span id="reauth-email" class="reauth-email"></span>
                                            <div class="row pass">
                                                <input type="password" id="password1" name="password1" placeholder="Enter New Password" />
                                            </div>
                                            <div class="row pass">
                                                <input type="password" id="password2" name="password2" placeholder="Confirm New Password"  />
                                            </div>
                                            <div class="arrowCap"></div>
                                            <div class="arrow"></div>
                                            <p class="meterText">Password Meter</p>
                                            <p>Minimum password length is 8 characters</p>
                                            <button class="btn btn-sm btn-primary btn-block btn-signin submitbutton" type="submit">Submit</button>
                                        </form><!-- /form -->
                                    </div><!-- /card-container -->
                                </div><!-- /container -->
                            </div>
                        </div>
                    </div>
                </div>
            </nav>
        </nav>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
    <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script>
    <script src='js/bootstrap.js'></script>
    <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
    <script src="lib/jquery.complexify.js"></script>
    <script src="lib/script.js"></script>
</html>