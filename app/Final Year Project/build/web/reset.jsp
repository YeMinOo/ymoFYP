
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/styles.css" />
        <title>JSP Page</title>

    </head>
    <body>
        <p>Min 8 characters in length</p>
        <div id="main">
            <div class="container">
                <div class="card card-container">
                    <form class="form-signin" id ="formtype" role="form" action="resetPasswordServlet" method="post">
                        <span id="reauth-email" class="reauth-email"></span>
                        <input type="text" name='newPwd' id="newPwd" class="form-control" placeholder="Enter new password" required autofocus>
                        <input type="text" name='newPwdConfirm' id="newPwdConfirm" class="form-control" placeholder="Confirm new password" required autofocus>

                        <div class="arrowCap"></div>
                        <div class="arrow"></div>

                        <p class="meterText">Password Meter</p>

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
        </div>
        <%
            }
        %>
        <script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
        <script src="lib/jquery.complexify.js"></script>
        <script src="lib/script.js"></script>

    </body>
</html>