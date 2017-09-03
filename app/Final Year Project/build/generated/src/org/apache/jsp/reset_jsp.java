package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.PasswordDAO;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reset Password</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>Min 8 characters in length</p>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card card-container\">\n");
      out.write("                <form class=\"form-signin\" id =\"formtype\" role=\"form\" action=\"resetPasswordServlet\" method=\"post\">\n");
      out.write("                    <span id=\"reauth-email\" class=\"reauth-email\"></span>\n");
      out.write("                    <input type=\"text\" name='newPwd' id=\"newPwd\" class=\"form-control\" placeholder=\"Enter new password\" required autofocus>\n");
      out.write("                    <input type=\"text\" name='newPwdConfirm' id=\"newPwdConfirm\" class=\"form-control\" placeholder=\"Confirm new password\" required autofocus>\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Submit</button>\n");
      out.write("                </form><!-- /form -->\n");
      out.write("            </div><!-- /card-container -->\n");
      out.write("        </div><!-- /container -->\n");
      out.write("        ");

            String error = (String) request.getAttribute("msg");
            if (error != null && error.equals("Passwords Mismatched!!")) {
                // print error at the top
        
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\">\n");
      out.write("            <strong>Passwords Mismatched!!</strong>\n");
      out.write("        </div>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
