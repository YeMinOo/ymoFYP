package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html style=\"height:'100%'\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <title>Login | Abundant Accounting Management System</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- for FF, Chrome, Opera -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"16x16\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"32x32\">\r\n");
      out.write("\r\n");
      out.write("        <!-- for IE -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\" >\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\"/>\r\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/fullcalendar.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/orangetable.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/calendarExtender.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/gridview.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/offcanvas.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"script/prevent-iframe.js\"></script>\r\n");
      out.write("        <script src=\"script/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"script/fullcalendar.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"script/moment.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            html, body{\r\n");
      out.write("                position:fixed;\r\n");
      out.write("                top:0;\r\n");
      out.write("                bottom:0;\r\n");
      out.write("                left:0;\r\n");
      out.write("                right:0;\r\n");
      out.write("            }\r\n");
      out.write("            .bs-docs-featurette + .bs-docs-footer {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                border-top: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .bs-docs-footer {\r\n");
      out.write("                margin-top: 100px;\r\n");
      out.write("                color: #777;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                border-top: 1px solid #e5e5e5;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #hr {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 25%;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-control {\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .well {\r\n");
      out.write("                padding: 10px 15px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .alignsentence {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .labelpadding {\r\n");
      out.write("                margin-left: 155px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .notoppadding {\r\n");
      out.write("                padding-top: 1px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .buttonmargin {\r\n");
      out.write("                margin-top: 11px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .margin-right-5 {\r\n");
      out.write("                margin-right: 5px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .nobgcl {\r\n");
      out.write("                background-color: #FFFFFF;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            body, html {\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .card-container.card {\r\n");
      out.write("                max-width: 350px;\r\n");
      out.write("                padding: 40px 40px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn {\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                height: 36px;\r\n");
      out.write("                -moz-user-select: none;\r\n");
      out.write("                -webkit-user-select: none;\r\n");
      out.write("                user-select: none;\r\n");
      out.write("                cursor: default;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /*\r\n");
      out.write("             * Card component\r\n");
      out.write("             */\r\n");
      out.write("            .card {\r\n");
      out.write("                background-color: #F7F7F7;\r\n");
      out.write("                /* just in case there no content*/\r\n");
      out.write("                padding: 20px 25px 30px;\r\n");
      out.write("                margin: 0 auto 25px;\r\n");
      out.write("                margin-top: 50px;\r\n");
      out.write("                /* shadows and rounded borders */\r\n");
      out.write("                -moz-border-radius: 2px;\r\n");
      out.write("                -webkit-border-radius: 2px;\r\n");
      out.write("                border-radius: 2px;\r\n");
      out.write("                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .profile-img-card {\r\n");
      out.write("                width: 96px;\r\n");
      out.write("                height: 96px;\r\n");
      out.write("                margin: 0 auto 10px;\r\n");
      out.write("                display: block;\r\n");
      out.write("                -moz-border-radius: 50%;\r\n");
      out.write("                -webkit-border-radius: 50%;\r\n");
      out.write("                border-radius: 50%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /*\r\n");
      out.write("             * Form styles\r\n");
      out.write("             */\r\n");
      out.write("            .profile-name-card {\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                margin: 10px 0 0;\r\n");
      out.write("                min-height: 1em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .reauth-email {\r\n");
      out.write("                display: block;\r\n");
      out.write("                color: #404040;\r\n");
      out.write("                line-height: 2;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                text-overflow: ellipsis;\r\n");
      out.write("                white-space: nowrap;\r\n");
      out.write("                -moz-box-sizing: border-box;\r\n");
      out.write("                -webkit-box-sizing: border-box;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-signin #inputUsername,\r\n");
      out.write("            .form-signin #inputPassword {\r\n");
      out.write("                direction: ltr;\r\n");
      out.write("                height: 44px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-signin input[type=text],\r\n");
      out.write("            .form-signin input[type=password],\r\n");
      out.write("            .form-signin input[type=text],\r\n");
      out.write("            .form-signin button {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: block;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                -moz-box-sizing: border-box;\r\n");
      out.write("                -webkit-box-sizing: border-box;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .form-signin .form-control:focus {\r\n");
      out.write("                border-color: rgb(104, 145, 162);\r\n");
      out.write("                outline: 0;\r\n");
      out.write("                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\r\n");
      out.write("                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn.btn-signin {\r\n");
      out.write("                /*background-color: #4d90fe; */\r\n");
      out.write("                background-color: rgb(104, 145, 162);\r\n");
      out.write("                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/\r\n");
      out.write("                padding: 0px;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                height: 36px;\r\n");
      out.write("                -moz-border-radius: 3px;\r\n");
      out.write("                -webkit-border-radius: 3px;\r\n");
      out.write("                border-radius: 3px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                -o-transition: all 0.218s;\r\n");
      out.write("                -moz-transition: all 0.218s;\r\n");
      out.write("                -webkit-transition: all 0.218s;\r\n");
      out.write("                transition: all 0.218s;\r\n");
      out.write("            }\r\n");
      out.write("            body{\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"min-height:'50%'\">\r\n");
      out.write("        <nav class=\"container-fluid\" width=\"100%\" height=\"100%\" Style=\"padding: 1%\">\r\n");
      out.write("            <nav class=\"header navbar navbar-default navbar-static-top\" Style=\"padding: 1%\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <div class=\"navbar-header\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <table>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td style=\"white-space: nowrap\">\r\n");
      out.write("                                        <a href=\"http://www.abaccounting.com.sg/\"><img src=\"images/Abundant Accounting Logo - Copy.png\" width=\"30%\" height=\"30%\"/></a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                    <td style=\"white-space: nowrap\">\r\n");
      out.write("                                        <a class=\"navbar-brand\" href=\"http://www.abaccounting.com.sg/\">Abundant Accounting</a>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <nav width=\"100%\" Style=\"padding: 0%\">\r\n");
      out.write("                <div class=\"container-fluid\" width=\"100%\" Style=\"padding: 0%\">\r\n");
      out.write("                    <div class=\"container\" width=\"100%\" Style=\"padding: 0%\">\r\n");
      out.write("                        ");

                        String isInvalidLogin = (String) request.getAttribute("InvalidLogin");
                        if (isInvalidLogin != null && isInvalidLogin.equals("Login failed! Please try again.")) {
                            // print error at the top
                        
      out.write("\r\n");
      out.write("                        <div class=\"alert alert-danger\" width=\"100%\">\r\n");
      out.write("                            <strong>Error</strong> Login Failed. Invalid Username or Password. Please try again.\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            }
                            String emailMsg = (String) request.getAttribute("emailMsg");
                            if (emailMsg != null && emailMsg.equals("Email has been sent successfully.")) {
                                // print error at the top
                        
      out.write("\r\n");
      out.write("                        <div class=\"alert alert-danger\" width=\"100%\">\r\n");
      out.write("                            <strong>We have sent an email to reset your password. Thank you.</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            }
                            String resetMsg = (String) session.getAttribute("ResetMsg");
                            if (resetMsg != null && resetMsg.equals("Your password has been updated!!")) {
                        
      out.write("\r\n");
      out.write("                        <div class=\"alert alert-danger\" width=\"100%\">\r\n");
      out.write("                            <strong>Your password has been updated.</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            }
                            session.setAttribute("ResetMsg", null);
                        
      out.write("\r\n");
      out.write("                        <div class=\"card card-container\">\r\n");
      out.write("                            <img id=\"profile-img\" class=\"profile-img-card\" src=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\"/>\r\n");
      out.write("                            <p id=\"profile-name\" class=\"profile-name-card\"></p>\r\n");
      out.write("                            <form class=\"form-signin\" id =\"formtype\" role=\"form\" action=\"loginServlet\" method=\"post\">\r\n");
      out.write("                                <span id=\"reauth-email\" class=\"reauth-email\"></span>\r\n");
      out.write("                                <input type=\"text\" name='UserId' id=\"UserId\" class=\"form-control\" placeholder=\"Username\" required autofocus>\r\n");
      out.write("                                <input type=\"password\" name='Password' id=\"Password\" class=\"form-control\" placeholder=\"Password\" required>\r\n");
      out.write("\r\n");
      out.write("                                <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Sign in</button>\r\n");
      out.write("                            </form><!-- /form -->\r\n");
      out.write("                        </div><!-- /card-container -->\r\n");
      out.write("                        <center><a href=\"forgotPassword.jsp\">Forgot/Change Password?</a></center>\r\n");
      out.write("                    </div><!-- /container -->\r\n");
      out.write("            </nav>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </body>\r\n");
      out.write("    <footer class=\"bs-docs-footer\" role=\"contentinfo\" style=\"min-height:'30%'\">\r\n");
      out.write("        <div class=\"container\" style=\"text-align: center\">\r\n");
      out.write("            <p style=\"color:#949494\">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>\r\n");
      out.write("            <p style=\"color:#949494\">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script>\r\n");
      out.write("    <script src='js/bootstrap.js'></script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
