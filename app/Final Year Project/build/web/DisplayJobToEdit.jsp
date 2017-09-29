<%-- 
    Document   : DisplayJobToEdit
    Created on : Jul 22, 2017, 1:29:12 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<%@ page autoFlush="true" buffer="1094kb"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="entity.Employee"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Job</title>
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
        <!-- this jsp is to display the current settings of the job so she knows what to edit -->
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
                margin: 10%, 10%, 10%, 10%;
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
                        <h1>Edit Job!</h1>
                        <%
                            String jobID = (String)request.getAttribute("jobId");
                            String jobTitle = (String)request.getAttribute("jobTitle");
                            String jobDescription = (String)request.getAttribute("jobDescription");
                            String clientName = (String)request.getAttribute("clientName");
                            String clientID = (String)request.getAttribute("clientID");
                            String startDate = (String)request.getAttribute("startDate");
                            String completionDate = (String)request.getAttribute("completionDate");
                            String finalDate = (String)request.getAttribute("finalDate");
                            String priorityLevel = (String)request.getAttribute("priorityLevel");
                            String staffAssignedTo = (String)request.getAttribute("staffAssignedTo");
                            String status = (String)request.getAttribute("status");
                            String jobtype = (String)request.getAttribute("jobtype");
                            String interval = (String)request.getAttribute("interval");
                        %>  
                        <form action="EditJobServlet" method="post">
                            <div class='container'>
                                <table class="table table-hover" border="1px" display='block''>
                                    <tr>
                                        <th >Job ID</th>
                                        <th>Job Title</th>
                                        <th>Job Description</th>
                                        <th>Client Name</th>
                                        <th>Client ID</th>
                                        <th>Start Date</th>
                                        <th>Completion Date</th>
                                        <th>Final Date</th>
                                        <th>Priority Level</th>
                                        <th>Staff-in-charge</th>
                                        <th>Status</th>
                                        <th>Job Type</th>
                                        <th>Interval</th>
                                    </tr>
                                    <tr>
                                        <td>
                                            <div>
                                                <%=jobID%>
                                            </div>
                                            <input type='hidden' name='jobId' id='jobId' value=<%=jobID%>>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='jobTitle' id="jobTitle" class="form-control" placeholder=<%=jobTitle%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='jobDescription' id="jobDescription" class="form-control" placeholder=<%=jobDescription%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='clientName' id="clientName" class="form-control" placeholder=<%=clientName%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='clientID' id="clientID" class="form-control" placeholder=<%=clientID%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='startDate' id="startDate" class="form-control" placeholder=<%=startDate%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='completionDate' id="completionDate" class="form-control" placeholder=<%=completionDate%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='finalDate' id="finalDate" class="form-control" placeholder=<%=finalDate%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='priorityLevel' id="priorityLevel" class="form-control" placeholder=<%=priorityLevel%> required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='staffAssignedTo' id="staffAssignedTo" class="form-control" placeholder=<%=staffAssignedTo%>  required autofocus> 
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='status' id="status" class="form-control" placeholder=<%=status%>  required autofocus>
                                            </div>
                                        </td>
                                        <td>
                                            <div contenteditable>
                                                <input type="text" name='jobtype' id="jobtype" class="form-control" placeholder=<%=jobtype%>  required autofocus>
                                            </div>
                                        </td>
                                        <% if(interval!=null){%>
                                            <td>
                                                <div contenteditable>
                                                    <input type="text" name='interval' id="interval" class="form-control" placeholder=<%=interval%> required autofocus>
                                                </div>
                                            </td>
                                        <%}else{%>
                                            <td>
                                                <div contenteditable>
                                                    <input type="text" name='interval' id="interval" class="form-control" placeholder=<%=interval%> required autofocus>
                                                </div>
                                            </td>
                                        <%}%>
                                    </tr>
                                </table>
                            </div>
                            </br>
                            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Edit Job!</button>
                        </form>
                    </div>
                </div>
            </nav>
        </nav>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
