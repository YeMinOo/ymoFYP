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
        <style type="text/css">
            .bs-docs-featurette + .bs-docs-footer {
                margin-top: 0;
                border-top: 0;
            }

            .align-buttons{
                display: inline;
                bottom: 0;
            }
            .overall-margin {
                margin: 10% 10% 10% 10%;
            }

            .bs-docs-footer {
                margin-top: 100px;
                color: #777;
                text-align: center;
                border-top: 1px solid #e5e5e5;
            }

            #hr {
                position: absolute;
                top: 25%;
                left: 35%;
            }

            .form-control {
                margin: 10px 0;
            }

            .well {
                padding: 10px 15px;
            }

            .alignsentence {
                padding: 15px;
            }

            .labelpadding {
                margin-left: 155px;
            }

            .notoppadding {
                padding-top: 1px;
            }

            .buttonmargin {
                margin-top: 11px;
            }

            .margin-right-5 {
                margin-right: 5px;
            }

            .nobgcl {
                background-color: #FFFFFF;
            }

            body, html {
                height: 100%;
                background-repeat: no-repeat;
            }

            .card-container.card {
                max-width: 350px;
                padding: 40px 40px;
            }

            .btn {
                font-weight: 700;
                height: 36px;
                -moz-user-select: none;
                -webkit-user-select: none;
                user-select: none;
                cursor: default;
            }

            /*
             * Card component
             */
            .card {
                background-color: #F7F7F7;
                /* just in case there no content*/
                padding: 20px 25px 30px;
                margin: 0 auto 25px;
                margin-top: 50px;
                /* shadows and rounded borders */
                -moz-border-radius: 2px;
                -webkit-border-radius: 2px;
                border-radius: 2px;
                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            }

            .profile-img-card {
                width: 96px;
                height: 96px;
                margin: 0 auto 10px;
                display: block;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
            }

            /*
             * Form styles
             */
            .profile-name-card {
                font-size: 16px;
                font-weight: bold;
                text-align: center;
                margin: 10px 0 0;
                min-height: 1em;
            }

            .reauth-email {
                display: block;
                color: #404040;
                line-height: 2;
                margin-bottom: 10px;
                font-size: 14px;
                text-align: center;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin #inputUsername,
            .form-signin #inputPassword {
                direction: ltr;
                height: 44px;
                font-size: 16px;
            }

            .form-signin input[type=text],
            .form-signin input[type=password],
            .form-signin input[type=text],
            .form-signin button {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                z-index: 1;
                position: relative;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin .form-control:focus {
                border-color: rgb(104, 145, 162);
                outline: 0;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
            }

            .btn.btn-signin {
                /*background-color: #4d90fe; */
                background-color: rgb(104, 145, 162);
                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/
                padding: 0px;
                font-weight: 700;
                font-size: 14px;
                height: 36px;
                -moz-border-radius: 3px;
                -webkit-border-radius: 3px;
                border-radius: 3px;
                border: none;
                -o-transition: all 0.218s;
                -moz-transition: all 0.218s;
                -webkit-transition: all 0.218s;
                transition: all 0.218s;
            }

            .body{
                padding: 0;
                margin: 0;
            }

            .header{
                padding-top: 20px;
                padding-right: 20px;
            }
            * {
                box-sizing: border-box;
            }

            #myInput {
                background-image: url('/css/searchicon.png');
                background-position: 10px 10px;
                background-repeat: no-repeat;
                width: 100%;
                font-size: 16px;
                padding: 12px 20px 12px 40px;
                border: 1px solid #ddd;
                margin-bottom: 12px;
            }

            #myTable {
                border-collapse: collapse;
                width: 100%;
                border: 1px solid #ddd;
                font-size: 18px;
            }

            #myTable th, #myTable td {
                text-align: left;
                padding: 12px;
            }

            #myTable tr {
                border-bottom: 1px solid #ddd;
            }

            #myTable tr.header, #myTable tr:hover {
                background-color: #f1f1f1;
            }
        </style>
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
            String sessionUserIsAdmin = employee.getIsAdmin();
            
            String clientID = request.getParameter("id");
            ClientDAO clientDAO = new ClientDAO();
            Client client = clientDAO.getClientById(clientID);
        %>
            <!--
        ###########################################################################################################################
        -->
        <nav class="container-fluid" width="100%" height="100%" Style="padding: 1%">
            <nav class="header navbar navbar-default navbar-static-top; container-fluid" width="100%" height="100%" Style="padding: 1%">
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
                                <% if(sessionUserIsAdmin.equals("no")){
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
                            <% if(sessionUserIsAdmin.equals("no")){
                            %>
                                <a href="Calendar_Employee.jsp"><span class="glyphicon glyphicon-home"</span>Home</a>
                            <%}else{%>
                                <a href="Calendar_Admin.jsp"><span class="glyphicon glyphicon-home"</span>Home</a>
                            <%}%>
                            <a href="StaffProfile.jsp"><span class="glyphicon glyphicon-user"></span> <%=employeeName%></a>
                            <a href="LogoutProcess"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                        </div>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-default navbar-center" height="100%">
                <div class="container-fluid" style="text-align: center" height="100%">
                    <div class="container-fluid" style="padding:1%">
                        <h1>Update Client</h1>
                        <div class="container">
                            <form action="UpdateClientServlet" method="post">
                                <table width="100%" height="100%" class="cellpadding">
                                    <tr>
                                        <td>
                                            <label>Client ID</label>
                                            <input type="text" name='clientId' id="clientId" class="form-control" placeholder=<%=client.getClientId()%> required autofocus readonly>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Company Category</label>
                                            <select name='companyCategory' id="companyCategory" class="form-control" value=<%=client.getCompanyCategory()%> autofocus>
                                                <option disabled selected value value=<%=client.getCompanyCategory()%>><%=client.getCompanyCategory()%></option>
                                                <option value="Co Official Sec">Co. Official Sec</option>
                                                <option value="NN Co.Sec">NN Co. Sec</option>
                                                <option value="NA">NA</option>
                                                <option value="Others">Others</option>
                                            </select>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Business Type</label>
                                            <select name='businessType' id="businessType" class="form-control" value=<%=client.getBusinessType()%> autofocus>
                                                <option disabled selected value value=<%=client.getBusinessType()%>><%=client.getBusinessType()%></option>
                                                <option value="company">Company</option>
                                                <option value="partnership">Partnership</option>
                                                <option value="sole proprietorship">Sole Proprietorship</option>
                                            </select>    
                                        </td>
                                        <td width="1%">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label>Company Name</label>
                                            <input type="text" name='companyName' id="companyName" class="form-control" value=<%=client.getCompanyName()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Incorporation</label>
                                            <input type="text" name='incorporation' id="incorporation" class="form-control" value=<%=client.getIncorporation()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>UEN Number</label>
                                            <input type="text" name='UenNumber' id="UenNumber" class="form-control" value=<%=client.getUenNumber()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label>Office Contact</label>
                                            <input type="text" name='officeContact' id="officeContact" class="form-control" value=<%=client.getOfficeContact()%> autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Mobile Contact</label>
                                            <input type="text" name='mobileContact' id="mobileContact" class="form-control" value=<%=client.getMobileContact()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Email Address</label>
                                            <input type="text" name='emailAddress' id="emailAddress" class="form-control" value=<%=client.getEmailAddress()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label>Office Address</label>
                                            <input type="text" name='officeAddress' id="officeAddress" class="form-control" value=<%=client.getOfficeAddress()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Financial Year End</label>
                                            <input type="text" name='financialYearEnd' id="financialYearEnd" class="form-control" value=<%=client.getFinancialYearEnd()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>GST</label>
                                            <input type="text" name='gst' id="gst" class="form-control" value=<%=client.getGst()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <label>Director</label>
                                            <input type="text" name='director' id="director" class="form-control" value=<%=client.getDirector()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Shareholder</label>
                                            <input type="text" name='shareholder' id="shareholder" class="form-control" value=<%=client.getShareholder()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                        <td>
                                            <label>Secretary</label>
                                            <input type="text" name='secretary' id="secretary" class="form-control" value=<%=client.getSecretary()%> required autofocus>
                                        </td>
                                        <td width="1%">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="6">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td colspan="5">
                                            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Update Client!</button>
                                        </td>
                                    </tr>
                                </table>
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

