package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Employee;
import dao.EmployeeDAO;
import entity.Client;
import dao.ClientDAO;

public final class UpdateClient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Protect.jsp");
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    //
    // PROTECT CHECKS IF USER IS LOGGED IN
    //

    // Ensures session variable is not cached! 
    // Always checks if user is logged in - Even if back button is clicked!
    response.setHeader("Cache-Control","no-cache"); //Forces caches to obtain a new copy of the page from the origin server
    response.setHeader("Cache-Control","no-store"); //Directs caches not to store the page under any circumstance
    response.setDateHeader("Expires", 0); //Causes the proxy cache to see the page as "stale"
    response.setHeader("Pragma","no-cache"); //HTTP 1.0 backward compatibility
    
    // Obtain user from session attribute: userId
    String userId = (String) session.getAttribute("userId");
    //Redirects user to Login page if user session is null
    if (userId == null) {
      response.sendRedirect("login.jsp");
      return;
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Update Client</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel='stylesheet' href='lib/fullcalendar.min.css' />\r\n");
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
      out.write("        <!--<script src=\"script/jquery.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!--<script src=\"script/fullcalendar.min.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("        <!--<script src=\"script/moment.js\" type=\"text/javascript\"></script>-->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src='lib/jquery.min.js'></script>\r\n");
      out.write("        <script src='lib/moment.min.js'></script>\r\n");
      out.write("        <script src='lib/fullcalendar.min.js'></script>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            html, body{\r\n");
      out.write("                position:fixed;\r\n");
      out.write("                top:0;\r\n");
      out.write("                bottom:0;\r\n");
      out.write("                left:0;\r\n");
      out.write("                right:0;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            footer{\r\n");
      out.write("                position:fixed;\r\n");
      out.write("                bottom:0;\r\n");
      out.write("                left:0;\r\n");
      out.write("                right:0;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
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
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            String empId = (String) session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee employee = empDAO.getEmployeeByID(empId);
            String employeeName = "";
            if (employee == null) {
                employeeName = "No User";
            } else {
                employeeName = employee.getName();
            }
            String sessionUserIsAdmin = employee.getIsAdmin();
            
            String clientID = request.getParameter("id");
            ClientDAO clientDAO = new ClientDAO();
            Client client = clientDAO.getClientById(clientID);
        
      out.write("\r\n");
      out.write("            <!--\r\n");
      out.write("        ###########################################################################################################################\r\n");
      out.write("        -->\r\n");
      out.write("        <nav class=\"container-fluid\" width=\"100%\" height=\"100%\" Style=\"padding: 1%\">\r\n");
      out.write("            <nav class=\"header navbar navbar-default navbar-static-top\">\r\n");
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
      out.write("                    <div class=\"navbar-right\" style=\"position: relative\">\r\n");
      out.write("                        <div class=\"dropdown align-buttons\">\r\n");
      out.write("                            <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Functions\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                ");
 if(sessionUserIsAdmin.equals("no")){
                                
      out.write("\r\n");
      out.write("                                    <li><a href=\"SearchStaff.jsp\">Search Staff</a></li>\r\n");
      out.write("                                    <li><a href=\"SearchClient.jsp\">Search Client</a></li>\r\n");
      out.write("                                    <li><a href=\"SearchProject.jsp\">Search Project</a></li>\r\n");
      out.write("                                    <li><a href=\"CreateClient.jsp\">Create Client</a></li>\r\n");
      out.write("                                    <li><a href=\"ViewAllClient.jsp\">View All Client</a></li>\r\n");
      out.write("                                    <li><a href=\"ViewTask.jsp\">View Tasks</a></li>\r\n");
      out.write("                                    <li><a href=\"InvoiceManagement.jsp\">Invoice Functions</a></li>\r\n");
      out.write("                                ");

                                }else{
                                
      out.write("\r\n");
      out.write("                                    <li><a href=\"SearchStaff.jsp\">Search Staff</a></li>\r\n");
      out.write("                                    <li><a href=\"SearchClient.jsp\">Search Client</a></li>\r\n");
      out.write("                                    <li><a href=\"SearchProject.jsp\">Search Project</a></li>\r\n");
      out.write("                                    <li><a href=\"CreateClient.jsp\">Create Client</a></li>\r\n");
      out.write("                                    <li><a href=\"ViewAllClient.jsp\">View All Client</a></li>\r\n");
      out.write("                                    <li><a href=\"CreateUser.jsp\">Create User</a></li>\r\n");
      out.write("                                    <li><a href=\"ViewEmployee.jsp\">View All Employees</a></li>\r\n");
      out.write("                                    <li><a href=\"ViewTask.jsp\">View Tasks</a></li>\r\n");
      out.write("                                    <li><a href=\"Task_Assigned_Table.jsp\">View All Tasks</a></li>\r\n");
      out.write("                                    <li><a href=\"InvoiceManagement.jsp\">Invoice Functions</a></li>\r\n");
      out.write("                                ");

                                }
                                
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"align-buttons\">\r\n");
      out.write("                            ");
 if(sessionUserIsAdmin.equals("no")){
                            
      out.write("\r\n");
      out.write("                                <a href=\"Calendar_Employee.jsp\"><span class=\"glyphicon glyphicon-home\"</span>Home</a>\r\n");
      out.write("                            ");
}else{
      out.write("\r\n");
      out.write("                                <a href=\"Calendar_Admin.jsp\"><span class=\"glyphicon glyphicon-home\"</span>Home</a>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <a href=\"StaffProfile.jsp\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(employeeName);
      out.write("</a>\r\n");
      out.write("                            <a href=\"LogoutProcess\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <nav class=\"navbar navbar-default navbar-center\">\r\n");
      out.write("                <div class=\"container-fluid\" style=\"text-align: center\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <h1>Update Client</h1>\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <form action=\"UpdateClientServlet\" method=\"post\">\r\n");
      out.write("                                <label>Client ID: </label>\r\n");
      out.write("                                <input type=\"text\" name='clientId' id=\"clientId\" class=\"form-control\" placeholder=");
      out.print(client.getClientId());
      out.write(" required autofocus readonly>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Company Category: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='companyCategory' id=\"companyCategory\" class=\"form-control\" value=");
      out.print(client.getCompanyCategory());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Business Type: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='businessType' id=\"businessType\" class=\"form-control\" value=");
      out.print(client.getBusinessType());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Company Name: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='companyName' id=\"companyName\" class=\"form-control\" value=");
      out.print(client.getCompanyName());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Incorporation: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='incorporation' id=\"incorporation\" class=\"form-control\" value=");
      out.print(client.getIncorporation());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>UEN Number: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='UenNumber' id=\"UenNumber\" class=\"form-control\" value=");
      out.print(client.getUenNumber());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Office Contact: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='officeContact' id=\"officeContact\" class=\"form-control\" value=");
      out.print(client.getOfficeContact());
      out.write(" autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Mobile Contact: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='mobileContact' id=\"mobileContact\" class=\"form-control\" value=");
      out.print(client.getMobileContact());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Email Address: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='emailAddress' id=\"emailAddress\" class=\"form-control\" value=");
      out.print(client.getEmailAddress());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Office Address: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='officeAddress' id=\"officeAddress\" class=\"form-control\" value=");
      out.print(client.getOfficeAddress());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Financial Year End: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='financialYearEnd' id=\"financialYearEnd\" class=\"form-control\" value=");
      out.print(client.getFinancialYearEnd());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>GST: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='gst' id=\"gst\" class=\"form-control\" value=");
      out.print(client.getGst());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Director: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='director' id=\"director\" class=\"form-control\" value=");
      out.print(client.getDirector());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <label>Shareholder: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='shareholder' id=\"shareholder\" class=\"form-control\" value=");
      out.print(client.getShareholder());
      out.write(" required autofocus>\r\n");
      out.write("                                 </br>\r\n");
      out.write("                                <label>Secretary: </label>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"text\" name='secretary' id=\"secretary\" class=\"form-control\" value=");
      out.print(client.getSecretary());
      out.write(" required autofocus>\r\n");
      out.write("                                </br>\r\n");
      out.write("                                <button class=\"btn btn-lg btn-primary btn-block btn-signin\" type=\"submit\">Update Client!</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    <footer class=\"bs-docs-footer\" role=\"contentinfo\">\r\n");
      out.write("        <div class=\"container\" style=\"text-align: center\">\r\n");
      out.write("            <p style=\"color:#949494\">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>\r\n");
      out.write("            <p style=\"color:#949494\">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
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
