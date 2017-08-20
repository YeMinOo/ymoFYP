package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class ViewEmployee_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Employees</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myInput {\n");
      out.write("                background-image: url('/css/searchicon.png');\n");
      out.write("                background-position: 10px 10px;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding: 12px 20px 12px 40px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                margin-bottom: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myTable {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myTable th, #myTable td {\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myTable tr {\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #myTable tr.header, #myTable tr:hover {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getAttribute("name") == null || request.getAttribute("email") == null
                    || request.getAttribute("position") == null || request.getAttribute("isAdmin") == null) {
        
      out.write("\n");
      out.write("        ");
      if (true) {
        _jspx_page_context.forward("ViewEmployeeServlet");
        return;
      }
      out.write("\n");
      out.write("        ");

            }
            List<String> nameList = (List<String>) request.getAttribute("name");
            List<String> emailList = (List<String>) request.getAttribute("email");
            List<String> positionList = (List<String>) request.getAttribute("position");
            List<String> isAdminList = (List<String>) request.getAttribute("isAdmin");
        
      out.write("\n");
      out.write("        <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for Employee\" title=\"Type in Employee Name\">\n");
      out.write("        <table id=\"myTable\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"header\">\n");
      out.write("                    <th>\n");
      out.write("                        Name\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Email\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Position\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Admin Access\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    for (int i = 0; i < nameList.size(); i++) {
                        out.print("<tr>");
                        out.print("<td>");
                        out.print(nameList.get(i));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(emailList.get(i));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(positionList.get(i));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(isAdminList.get(i));
                        out.print("</td>");
                
      out.write("\n");
      out.write("            <td>\n");
      out.write("                <form method=\"post\" action=\"UpdateEmployee.jsp\">\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(nameList.get(i));
      out.write("\" name=\"name\">\n");
      out.write("                    <input type=\"submit\" value=\"UpdateEmployeeInfo\">\n");
      out.write("                </form>\n");
      out.write("            </td>\n");
      out.write("            ");

                    out.print("</tr>");
                }
            
      out.write("\n");
      out.write("        </thead>\n");
      out.write("    </table>\n");
      out.write("    <script>\n");
      out.write("        function myFunction() {\n");
      out.write("            var input, filter, table, tr, td, i;\n");
      out.write("            input = document.getElementById(\"myInput\");\n");
      out.write("            filter = input.value.toUpperCase();\n");
      out.write("            table = document.getElementById(\"myTable\");\n");
      out.write("            tr = table.getElementsByTagName(\"tr\");\n");
      out.write("            for (i = 0; i < tr.length; i++) {\n");
      out.write("                td = tr[i].getElementsByTagName(\"td\")[0];\n");
      out.write("                if (td) {\n");
      out.write("                    if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("                        tr[i].style.display = \"\";\n");
      out.write("                    } else {\n");
      out.write("                        tr[i].style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
