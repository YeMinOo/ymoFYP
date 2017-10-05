package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reset_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\r\n");
      out.write("        <title>Password Reset</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <p>Min 8 characters in length</p>\r\n");
      out.write("        <div id=\"main\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"card card-container\">\r\n");
      out.write("                    <form class=\"form-signin\" id =\"formtype\" role=\"form\" action=\"resetPasswordServlet\" method=\"post\">\r\n");
      out.write("                        <span id=\"reauth-email\" class=\"reauth-email\"></span>\r\n");
      out.write("                        <div class=\"row pass\">\r\n");
      out.write("                            <input type=\"password\" id=\"password1\" name=\"password1\" placeholder=\"Enter New Password\" />\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("        \t\t<div class=\"row pass\">\r\n");
      out.write("                            <input type=\"password\" id=\"password2\" name=\"password2\" placeholder=\"Confirm New Password\"  />\r\n");
      out.write("        \t\t</div>\r\n");
      out.write("                        <div class=\"arrowCap\"></div>\r\n");
      out.write("                        <div class=\"arrow\"></div>\r\n");
      out.write("                        <p class=\"meterText\">Password Meter</p>\r\n");
      out.write("                        <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Submit</button>\r\n");
      out.write("                    </form><!-- /form -->\r\n");
      out.write("                </div><!-- /card-container -->\r\n");
      out.write("            </div><!-- /container -->\r\n");
      out.write("            ");
  if (session.getAttribute("resetToken") == null) {
                    response.sendRedirect("display.jsp");
                }
                String error = (String) request.getAttribute("msg");
                if (error != null && error.equals("Passwords Mismatched!!")) {
                    // print error at the top
            
      out.write("\r\n");
      out.write("            <div class=\"alert alert-danger\">\r\n");
      out.write("                <strong>Passwords Mismatched!!</strong>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/jquery.complexify.js\"></script>\r\n");
      out.write("        <script src=\"lib/script.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
