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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   \n");
      out.write("        ");
      out.write("\n");
      out.write("        <title>Login | Abundant Accounting Management System</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <!-- for FF, Chrome, Opera -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"32x32\">\n");
      out.write("\n");
      out.write("        <!-- for IE -->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\" >\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\"/>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body, html {\n");
      out.write("                height: 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-container.card {\n");
      out.write("                max-width: 350px;\n");
      out.write("                padding: 40px 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                font-weight: 700;\n");
      out.write("                height: 36px;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("                cursor: default;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             * Card component\n");
      out.write("             */\n");
      out.write("            .card {\n");
      out.write("                background-color: #F7F7F7;\n");
      out.write("                /* just in case there no content*/\n");
      out.write("                padding: 20px 25px 30px;\n");
      out.write("                margin: 0 auto 25px;\n");
      out.write("                margin-top: 50px;\n");
      out.write("                /* shadows and rounded borders */\n");
      out.write("                -moz-border-radius: 2px;\n");
      out.write("                -webkit-border-radius: 2px;\n");
      out.write("                border-radius: 2px;\n");
      out.write("                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile-img-card {\n");
      out.write("                width: 96px;\n");
      out.write("                height: 96px;\n");
      out.write("                margin: 0 auto 10px;\n");
      out.write("                display: block;\n");
      out.write("                -moz-border-radius: 50%;\n");
      out.write("                -webkit-border-radius: 50%;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*\n");
      out.write("             * Form styles\n");
      out.write("             */\n");
      out.write("            .profile-name-card {\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 10px 0 0;\n");
      out.write("                min-height: 1em;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .reauth-email {\n");
      out.write("                display: block;\n");
      out.write("                color: #404040;\n");
      out.write("                line-height: 2;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                font-size: 14px;\n");
      out.write("                text-align: center;\n");
      out.write("                overflow: hidden;\n");
      out.write("                text-overflow: ellipsis;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin #inputUsername,\n");
      out.write("            .form-signin #inputPassword {\n");
      out.write("                direction: ltr;\n");
      out.write("                height: 44px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin input[type=text],\n");
      out.write("            .form-signin input[type=password],\n");
      out.write("            .form-signin input[type=text],\n");
      out.write("            .form-signin button {\n");
      out.write("                width: 100%;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                z-index: 1;\n");
      out.write("                position: relative;\n");
      out.write("                -moz-box-sizing: border-box;\n");
      out.write("                -webkit-box-sizing: border-box;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin .form-control:focus {\n");
      out.write("                border-color: rgb(104, 145, 162);\n");
      out.write("                outline: 0;\n");
      out.write("                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\n");
      out.write("                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn.btn-signin {\n");
      out.write("                /*background-color: #4d90fe; */\n");
      out.write("                background-color: rgb(104, 145, 162);\n");
      out.write("                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/\n");
      out.write("                padding: 0px;\n");
      out.write("                font-weight: 700;\n");
      out.write("                font-size: 14px;\n");
      out.write("                height: 36px;\n");
      out.write("                -moz-border-radius: 3px;\n");
      out.write("                -webkit-border-radius: 3px;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                border: none;\n");
      out.write("                -o-transition: all 0.218s;\n");
      out.write("                -moz-transition: all 0.218s;\n");
      out.write("                -webkit-transition: all 0.218s;\n");
      out.write("                transition: all 0.218s;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top\">\n");
      out.write("            <div class=\"container\" length=\"100%\" width=\"100%\">\n");
      out.write("                <div class='col-md-4' style='margin-top:20px'>\n");
      out.write("                    <h1 style=\"color:#0000A0; margin-top:10px;\">Abundant Accounting Management System</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        ");

            //generate error message if login fails
            String login_fail = (String) request.getAttribute("loginFailed");
            if (login_fail != null) {
        
      out.write("\n");
      out.write("                <div class=\"alert alert-danger\">\n");
      out.write("                    <strong>ERROR</strong> ");
      out.print( login_fail);
      out.write("\n");
      out.write("                </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-container\">\n");
      out.write("                <img id=\"profile-img\" class=\"profile-img-card\" src=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\" />\n");
      out.write("                <p id=\"profile-name\" class=\"profile-name-card\"></p>\n");
      out.write("                <form class=\"form-signin\" id =\"formtype\" role=\"form\" action=\"loginServlet\" method=\"post\">\n");
      out.write("                    <span id=\"reauth-email\" class=\"reauth-email\"></span>\n");
      out.write("                    <input type=\"text\" name='UserId' id=\"Username\" class=\"form-control\" placeholder=\"Username\" required autofocus>\n");
      out.write("                    <input type=\"password\" name='Password' id=\"Password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("                    \n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Sign in</button>\n");
      out.write("                </form><!-- /form -->\n");
      out.write("            </div><!-- /card-container -->\n");
      out.write("        </div><!-- /container -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<script sec='js/bootstrap.js'></script>\n");
      out.write("</html>\n");
      out.write("\n");
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
