package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Employee;
import dao.EmployeeDAO;
import java.util.List;

public final class Task_005fAssigned_005fTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      			null, true, 1120256, true);
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Overview of Assigned Tasks</title>\r\n");
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
      out.write("            .bs-docs-featurette + .bs-docs-footer {\r\n");
      out.write("                margin-top: 0;\r\n");
      out.write("                border-top: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .align-buttons{\r\n");
      out.write("                display: inline;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .overall-margin {\r\n");
      out.write("                margin: 10%, 10%, 10%, 10%;\r\n");
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
      out.write("            \r\n");
      out.write("            .body{\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .header{\r\n");
      out.write("                padding-top: 20px;\r\n");
      out.write("                padding-right: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #myInput {\r\n");
      out.write("                background-image: url('/css/searchicon.png');\r\n");
      out.write("                background-position: 10px 10px;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                padding: 12px 20px 12px 40px;\r\n");
      out.write("                border: 1px solid #ddd;\r\n");
      out.write("                margin-bottom: 12px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #myTable {\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border: 1px solid #ddd;\r\n");
      out.write("                font-size: 18px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #myTable th, #myTable td {\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 12px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #myTable tr {\r\n");
      out.write("                border-bottom: 1px solid #ddd;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #myTable tr.header, #myTable tr:hover {\r\n");
      out.write("                background-color: #f1f1f1;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            if (request.getAttribute("title") == null || request.getAttribute("endDate") == null
                    || request.getAttribute("startDate") == null || request.getAttribute("remarks") == null
                    || request.getAttribute("assignedEmployee") == null || request.getAttribute("projectStatus") == null) {
        
      out.write("\r\n");
      out.write("                ");
      if (true) {
        _jspx_page_context.forward("TaskAssignedTableServlet");
        return;
      }
      out.write("\r\n");
      out.write("        ");

            }
            List<String> titleList = (List<String>) request.getAttribute("title");
            List<String> startDateList = (List<String>) request.getAttribute("startDate");
            List<String> endDateList = (List<String>) request.getAttribute("endDate");
            List<String> remarksList = (List<String>) request.getAttribute("remarks");
            List<String> assignedEmployeeList = (List<String>) request.getAttribute("assignedEmployee");
            List<String> projectStatusList = (List<String>) request.getAttribute("projectStatus");
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- ########################################################## header ########################################################## -->\r\n");
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
        
      out.write("\r\n");
      out.write("        <nav class=\"container-fluid\" width=\"100%\" height=\"100%\">\r\n");
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
      out.write("                            <!--\r\n");
      out.write("                                <li><a href=\"SearchStaff.jsp\">Search Staff</a></li>\r\n");
      out.write("                                <li><a href=\"SearchClient.jsp\">Search Client</a></li>\r\n");
      out.write("                                <li><a href=\"SearchJob.jsp\">Search Job</a></li>\r\n");
      out.write("                                <li><a href=\"ViewJob.jsp\">View Job</a></li>\r\n");
      out.write("                                <li><a href=\"AddNewJob.jsp\">Add New Job</a></li>\r\n");
      out.write("                                <li><a href=\"EditJob.jsp\">Edit Job</a></li>\r\n");
      out.write("                                <li><a href=\"DeleteJob.jsp\">Delete Job</a></li>\r\n");
      out.write("                            -->\r\n");
      out.write("                                <li><a href=\"ViewTask.jsp\">View Tasks</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"align-buttons\">\r\n");
      out.write("                            <a href=\"Calendar_Admin.jsp\"><span class=\"glyphicon glyphicon-home\"</span>Home</a>\r\n");
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
      out.write("                        <h3></h3>\r\n");
      out.write("                        <input type=\"text\" id=\"myInput\" onkeyup=\"myFunction()\" placeholder=\"Search for Employee\" title=\"Type in Employee\">\r\n");
      out.write("                        <table id=\"myTable\">\r\n");
      out.write("                            <tr class=\"header\">\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    Employee Assigned\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    Title\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    Start Date\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    End Date\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    Remarks\r\n");
      out.write("                                </th>\r\n");
      out.write("                                <th>\r\n");
      out.write("                                    Completion Status\r\n");
      out.write("                                </th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");

                                for (int i = 0; i < titleList.size(); i++) {
                            
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");

                                                String assignedEmployee = assignedEmployeeList.get(i);
                                                if (assignedEmployee == null || assignedEmployee.length() == 0) {
                                                   out.print("Not Assigned");
                                                } else {
                                                    out.print(assignedEmployee);
                                                }
                                            
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");
      out.print(titleList.get(i));
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");
      out.print(startDateList.get(i));
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");
      out.print(endDateList.get(i));
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");

                                            String remarks = remarksList.get(i);
                                            if (remarks == null || remarks.length() == 0) {
                                                out.print("NA");
                                            } else {
                                                out.print(remarks);
                                            }
                                            
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                        <td>\r\n");
      out.write("                                            ");

                                            String status = projectStatusList.get(i);
                                            if (status.equals("1")) {
                                                out.print("Not Completed");
                                            } else {
                                                out.print("Completed");
                                            }
                                            
      out.write("\r\n");
      out.write("                                        </td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        <script>\r\n");
      out.write("            function myFunction() {\r\n");
      out.write("                var input, filter, table, tr, td, i;\r\n");
      out.write("                input = document.getElementById(\"myInput\");\r\n");
      out.write("                filter = input.value.toUpperCase();\r\n");
      out.write("                table = document.getElementById(\"myTable\");\r\n");
      out.write("                tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("                for (i = 0; i < tr.length; i++) {\r\n");
      out.write("                    td = tr[i].getElementsByTagName(\"td\")[0];\r\n");
      out.write("                    if (td) {\r\n");
      out.write("                        if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("                            tr[i].style.display = \"\";\r\n");
      out.write("                        } else {\r\n");
      out.write("                            tr[i].style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("    <footer class=\"bs-docs-footer\" role=\"contentinfo\">\r\n");
      out.write("        <div class=\"container\" style=\"text-align: center\">\r\n");
      out.write("            <p style=\"color:#949494\">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>\r\n");
      out.write("            <p style=\"color:#949494\">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
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
