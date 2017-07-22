package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNewJob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Job</title>            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p>\n");
      out.write("                <form action='AddNewJobServlet' method='post'>\n");
      out.write("                    <label>Job Type: </label>\n");
      out.write("                    <select name='jobType'>\n");
      out.write("                        <option value='recurring'>Recurring</option>\n");
      out.write("                        <option value='AdHoc'>AdHoc</option>\n");
      out.write("                    </select>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Job Title: </label>\n");
      out.write("                    <input type=\"text\" name='jobTitle' id=\"inputJobTitle\" class=\"form-control\" placeholder=\"Job Title\" required autofocus>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Job Description: </label>\n");
      out.write("                    <textarea name='jobDescription' id='jobDescription' placeholder=\"Job Description\"></textarea>\n");
      out.write("                    <br />\n");
      out.write("                    <label>Client: </label>\n");
      out.write("                    <input type =\"text\" name=\"clientName\" id=\"clientName\" class=\"form-control\" placeholder=\"Client Name\" required autofocus>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Client ID: </label>\n");
      out.write("                    <input type =\"text\" name=\"clientID\" id=\"clientName\" class=\"form-control\" placeholder=\"Client ID\" required autofocus>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Due Date: </label>\n");
      out.write("                    <input type=\"date\" name='dueDate' id=\"inputDueDate\" class=\"form-control\" placeholder=\"Due Date of Project\" required autofocus>\n");
      out.write("                     </br>                   \n");
      out.write("                    <label>Completion Date: </label>\n");
      out.write("                    <input type=\"date\" name='completionDate' id=\"inputCompletionDate\" class=\"form-control\" placeholder=\"Completion Date of Project\" required autofocus>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Job Priority: </label>\n");
      out.write("                    <select name='priorityLevel'>\n");
      out.write("                        <option value='crucial'>Crucial</option>\n");
      out.write("                        <option value='High'>High</option>\n");
      out.write("                        <option value='Medium'>Medium</option>\n");
      out.write("                        <option value='Low'>Low</option>\n");
      out.write("                    </select>\n");
      out.write("                    </br>\n");
      out.write("                    <label>Employees Assigned: </label>\n");
      out.write("                    <input type=\"text\" name='staffAssignedTo' id='inputEmployeeAssigned' class ='form-control' placeholder='Staff Assigned To' required autofocus>\n");
      out.write("                    </br>\n");
      out.write("                    <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Create New Job!</button>\n");
      out.write("                </form>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
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
