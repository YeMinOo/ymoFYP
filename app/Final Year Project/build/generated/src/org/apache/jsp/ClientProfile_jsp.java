package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Employee;
import dao.EmployeeDAO;
import entity.Client;
import dao.ClientDAO;

public final class ClientProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client Profile</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel='stylesheet' href='lib/fullcalendar.min.css' />\n");
      out.write("        <!-- for FF, Chrome, Opera -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"16x16\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"/Images/Abundant Accounting Logo.png\" sizes=\"32x32\">\n");
      out.write("\n");
      out.write("        <!-- for IE -->\n");
      out.write("        <link rel=\"icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\" >\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/Images/Abundant Accounting Logo.ico\"/>\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/fullcalendar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/orangetable.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/calendarExtender.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/gridview.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/offcanvas.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"script/prevent-iframe.js\"></script>\n");
      out.write("        <!--<script src=\"script/jquery.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <script src=\"script/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--<script src=\"script/fullcalendar.min.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <!--<script src=\"script/moment.js\" type=\"text/javascript\"></script>-->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src='lib/jquery.min.js'></script>\n");
      out.write("        <script src='lib/moment.min.js'></script>\n");
      out.write("        <script src='lib/fullcalendar.min.js'></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .bs-docs-featurette + .bs-docs-footer {\n");
      out.write("                margin-top: 0;\n");
      out.write("                border-top: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .align-buttons{\n");
      out.write("                display: inline;\n");
      out.write("                bottom: 0;\n");
      out.write("            }\n");
      out.write("            .overall-margin {\n");
      out.write("                margin: 10%, 10%, 10%, 10%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bs-docs-footer {\n");
      out.write("                margin-top: 100px;\n");
      out.write("                color: #777;\n");
      out.write("                text-align: center;\n");
      out.write("                border-top: 1px solid #e5e5e5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #hr {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 25%;\n");
      out.write("                left: 35%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-control {\n");
      out.write("                margin: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .well {\n");
      out.write("                padding: 10px 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .alignsentence {\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .labelpadding {\n");
      out.write("                margin-left: 155px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .notoppadding {\n");
      out.write("                padding-top: 1px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .buttonmargin {\n");
      out.write("                margin-top: 11px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .margin-right-5 {\n");
      out.write("                margin-right: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nobgcl {\n");
      out.write("                background-color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("            \n");
      out.write("            .body{\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .header{\n");
      out.write("                padding-top: 20px;\n");
      out.write("                padding-right: 20px;\n");
      out.write("            }\n");
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
      out.write("        <!-- ########################################################## header ########################################################## -->\n");
      out.write("        ");

            String empId = (String) session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee emp = empDAO.getEmployeeByID(empId);
            String employeeName = "";
            if (emp == null) {
                employeeName = "No User";
            } else {
                employeeName = emp.getName();
            }
            ClientDAO clientDAO = new ClientDAO();
            String clientId = request.getParameter("clientId");
            Client client = clientDAO.getClientByID(clientId);
            String clientName = "";
            if (client == null) {
                clientName = "Client not found";
            } else {
                clientName = client.getName();
            }
        
      out.write("\n");
      out.write("        <nav class=\"container-fluid\" width=\"100%\" height=\"100%\">\n");
      out.write("            <nav class=\"header navbar navbar-default navbar-static-top\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <div>\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"white-space: nowrap\">\n");
      out.write("                                        <a href=\"http://www.abaccounting.com.sg/\"><img src=\"images/Abundant Accounting Logo - Copy.png\" width=\"30%\" height=\"30%\"/></a>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td style=\"white-space: nowrap\">\n");
      out.write("                                        <a class=\"navbar-brand\" href=\"http://www.abaccounting.com.sg/\">Abundant Accounting</a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-right\" style=\"position: relative\">\n");
      out.write("                        <div class=\"dropdown align-buttons\">\n");
      out.write("                            <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Functions\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                            <!--\n");
      out.write("                                <li><a href=\"SearchStaff.jsp\">Search Staff</a></li>\n");
      out.write("                                <li><a href=\"SearchClient.jsp\">Search Client</a></li>\n");
      out.write("                                <li><a href=\"SearchJob.jsp\">Search Job</a></li>\n");
      out.write("                                <li><a href=\"ViewJob.jsp\">View Job</a></li>\n");
      out.write("                                <li><a href=\"AddNewJob.jsp\">Add New Job</a></li>\n");
      out.write("                                <li><a href=\"EditJob.jsp\">Edit Job</a></li>\n");
      out.write("                                <li><a href=\"DeleteJob.jsp\">Delete Job</a></li>\n");
      out.write("                            -->\n");
      out.write("                                <li><a href=\"ViewTask.jsp\">View Tasks</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"align-buttons\">\n");
      out.write("                            <a href=\"Calendar_Employee.jsp\"><span class=\"glyphicon glyphicon-home\"</span>Home</a>\n");
      out.write("                            <a href=\"StaffProfile.jsp\"><span class=\"glyphicon glyphicon-user\"></span> ");
      out.print(employeeName);
      out.write("</a>\n");
      out.write("                            <a href=\"LogoutProcess\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <nav class=\"navbar navbar-default navbar-center\">\n");
      out.write("                <div class=\"container-fluid\" style=\"text-align: center\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <h3></h3>\n");
      out.write("                        <!-- insert profile here -->\n");
      out.write("                        <!-- Staff image -->\n");
      out.write("                        <img id=\"profile-img\" class=\"profile-img-card\" src=\"//ssl.gstatic.com/accounts/ui/avatar_2x.png\"/>\n");
      out.write("                        <!-- staff name -->\n");
      out.write("                        <h2>");
      out.print(clientName);
      out.write("</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <nav class=\"navbar navbar-default navbar-center\">\n");
      out.write("                <div class=\"container-fluid\" style=\"text-align: left\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\">\n");
      out.write("                                    <h3>Description</h3>\n");
      out.write("                                </td>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    <button type=\"button\" class=\"glyphicon glyphicon-minus\" data-toggle=\"collapse\" data-target=\"#pastjobcollapsible\"></button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <!-- insert description -->\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div id=\"pastjobcollapsible\" class=\"collapse in\">\n");
      out.write("                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <nav class=\"navbar navbar-default navbar-center\">\n");
      out.write("                <div class=\"container-fluid\" style=\"text-align: left\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\">\n");
      out.write("                                    <h3>Current Jobs</h3>\n");
      out.write("                                </td>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    <button type=\"button\" class=\"glyphicon glyphicon-minus\" data-toggle=\"collapse\" data-target=\"#pastjobcollapsible\"></button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <!-- insert past jobs -->\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div id=\"pastjobcollapsible\" class=\"collapse in\">\n");
      out.write("                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <nav class=\"navbar navbar-default navbar-center\">\n");
      out.write("                <div class=\"container-fluid\" style=\"text-align: left\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"left\">\n");
      out.write("                                    <h3>Past Jobs</h3>\n");
      out.write("                                </td>\n");
      out.write("                                <td align=\"right\">\n");
      out.write("                                    <button type=\"button\" class=\"glyphicon glyphicon-minus\" data-toggle=\"collapse\" data-target=\"#pastjobcollapsible\"></button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <!-- insert past jobs -->\n");
      out.write("                        <table width=\"100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <div id=\"pastjobcollapsible\" class=\"collapse in\">\n");
      out.write("                                        Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("                                    </div>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("    <footer class=\"bs-docs-footer\" role=\"contentinfo\">\n");
      out.write("        <div class=\"container\" style=\"text-align: center\">\n");
      out.write("            <p style=\"color:#949494\">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>\n");
      out.write("            <p style=\"color:#949494\">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
