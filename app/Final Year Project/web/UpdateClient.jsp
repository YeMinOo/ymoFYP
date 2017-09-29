<%-- 
    Document   : UpdateDeleteClient
    Created on : Sep 15, 2017, 3:26:34 PM
    Author     : jagdishps.2014
--%>

<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="entity.Client"%>
<%@page import="dao.ClientDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Protect.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Client</title>
        <link href="css/bootstrap.css" rel="stylesheet">

        <link rel='stylesheet' href='lib/fullcalendar.min.css' />
        <!-- for FF, Chrome, Opera -->
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="16x16">
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="32x32">

        <!-- for IE -->
        <link rel="icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico" >
        <link rel="shortcut icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/fullcalendar.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link href="css/orangetable.css" rel="stylesheet" type="text/css"/>
        <link href="css/calendarExtender.css" rel="stylesheet" type="text/css"/>
        <link href="css/gridview.css" rel="stylesheet" type="text/css"/>
        <link href="css/offcanvas.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="script/prevent-iframe.js"></script>
        <!--<script src="script/jquery.min.js" type="text/javascript"></script>-->
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <!--<script src="script/fullcalendar.min.js" type="text/javascript"></script>-->
        <!--<script src="script/moment.js" type="text/javascript"></script>-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src='lib/jquery.min.js'></script>
        <script src='lib/moment.min.js'></script>
        <script src='lib/fullcalendar.min.js'></script>
    </head>
    <body>
        <%
            String empId = (String) session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee employee = empDAO.getEmployeeByID(empId);
            String employeeName = "";
            if (employee == null) {
                employeeName = "No User";
            } else {
                employeeName = employee.getName();
            }
            int sessionUserIsAdmin = employee.getIsAdmin();
        %>
            <!--
        ###########################################################################################################################
        -->
        <nav class="container-fluid" width="100%" height="100%" Style="padding: 1%">
            <nav class="header navbar navbar-default navbar-static-top">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <div>
                            <table>
                                <tr>
                                    <td style="white-space: nowrap">
                                        <a href="http://www.abaccounting.com.sg/"><img src="images/Abundant Accounting Logo - Copy.png" width="30%" height="30%"/></a>
                                    </td>
                                    <td style="white-space: nowrap">
                                        <a class="navbar-brand" href="http://www.abaccounting.com.sg/">Abundant Accounting</a>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div>
                    <div class="navbar-right" style="position: relative">
                        <div class="dropdown align-buttons">
                            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Functions
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                                <% if(sessionUserIsAdmin == 1){
                                %>
                                    <li><a href="SearchStaff.jsp">Search Staff</a></li>
                                    <li><a href="SearchClient.jsp">Search Client</a></li>
                                    <li><a href="SearchProject.jsp">Search Project</a></li>
                                    <li><a href="CreateClient.jsp">Create Client</a></li>
                                    <li><a href="ViewAllClient.jsp">View All Client</a></li>
                                    <li><a href="ViewTask.jsp">View Tasks</a></li>
                                    <li><a href="InvoiceManagement.jsp">Invoice Functions</a></li>
                                <%
                                }else{
                                %>
                                    <li><a href="SearchStaff.jsp">Search Staff</a></li>
                                    <li><a href="SearchClient.jsp">Search Client</a></li>
                                    <li><a href="SearchProject.jsp">Search Project</a></li>
                                    <li><a href="CreateClient.jsp">Create Client</a></li>
                                    <li><a href="ViewAllClient.jsp">View All Client</a></li>
                                    <li><a href="CreateUser.jsp">Create User</a></li>
                                    <li><a href="ViewEmployee.jsp">View All Employees</a></li>
                                    <li><a href="ViewTask.jsp">View Tasks</a></li>
                                    <li><a href="Task_Assigned_Table.jsp">View All Tasks</a></li>
                                    <li><a href="InvoiceManagement.jsp">Invoice Functions</a></li>
                                <%
                                }
                                %>
                            </ul>
                        </div>
                        <div class="align-buttons">
                            <a href="#"><span class="glyphicon glyphicon-home"</span>Home</a>
                            <a href="StaffProfile.jsp"><span class="glyphicon glyphicon-user"></span> <%=employeeName%></a>
                            <a href="LogoutProcess"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                        </div>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-default navbar-center">
                <div class="container-fluid" style="text-align: center">
                    <div class="container-fluid">
                        <h1>Update Client</h1>
                        <div class="container">
                            <form action="UpdateClientServlet" method="post">
                                <label>Client ID: </label>
                                <input type="text" name='clientId' id="clientId" class="form-control" placeholder=<%=client.getClientId()%> required autofocus readonly>
                                </br>
                                <label>Company Category: </label>

                                <input type="text" name='companyCategory' id="companyCategory" class="form-control" value=<%=client.getCompanyCategory()%> required autofocus>
                                </br>
                                <label>Business Type: </label>

                                <input type="text" name='businessType' id="businessType" class="form-control" value=<%=client.getBusinessType()%> required autofocus>
                                </br>
                                <label>Company Name: </label>

                                <input type="text" name='companyName' id="companyName" class="form-control" value=<%=client.getCompanyName()%> required autofocus>
                                </br>
                                <label>Incorporation: </label>

                                <input type="text" name='incorporation' id="incorporation" class="form-control" value=<%=client.getIncorporation()%> required autofocus>
                                </br>
                                <label>UEN Number: </label>

                                <input type="text" name='UenNumber' id="UenNumber" class="form-control" value=<%=client.getUenNumber()%> required autofocus>
                                </br>
                                <label>Office Contact: </label>

                                <input type="text" name='officeContact' id="officeContact" class="form-control" value=<%=client.getOfficeContact()%> autofocus>
                                </br>
                                <label>Mobile Contact: </label>

                                <input type="text" name='mobileContact' id="mobileContact" class="form-control" value=<%=client.getMobileContact()%> required autofocus>
                                </br>
                                <label>Email Address: </label>

                                <input type="text" name='emailAddress' id="emailAddress" class="form-control" value=<%=client.getEmailAddress()%> required autofocus>
                                </br>
                                <label>Office Address: </label>

                                <input type="text" name='officeAddress' id="officeAddress" class="form-control" value=<%=client.getOfficeAddress()%> required autofocus>
                                </br>
                                <label>Financial Year End: </label>

                                <input type="text" name='financialYearEnd' id="financialYearEnd" class="form-control" value=<%=client.getFinancialYearEnd()%> required autofocus>
                                </br>
                                <label>GST: </label>

                                <input type="text" name='gst' id="gst" class="form-control" value=<%=client.getGst()%> required autofocus>
                                </br>
                                <label>Director: </label>

                                <input type="text" name='director' id="director" class="form-control" value=<%=client.getDirector()%> required autofocus>
                                </br>
                                <label>Shareholder: </label>

                                <input type="text" name='shareholder' id="shareholder" class="form-control" value=<%=client.getShareholder()%> required autofocus>
                                 </br>
                                <label>Secretary: </label>

                                <input type="text" name='secretary' id="secretary" class="form-control" value=<%=client.getSecretary()%> required autofocus>
                                </br>
                                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Update Client!</button>
                            </form>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>

