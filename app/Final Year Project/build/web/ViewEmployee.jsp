<%-- 
    Document   : ViewEmployee
    Created on : Aug 20, 2017, 9:17:29 PM
    Author     : yemin
--%>

<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page autoFlush="true" buffer="1094kb"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Employee</title>
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
            if (request.getAttribute("name") == null || request.getAttribute("email") == null
                    || request.getAttribute("position") == null || request.getAttribute("isAdmin") == null) {
        %>
        <jsp:forward page="ViewEmployeeServlet"/>
        <%
            }
            List<String> nameList = (List<String>) request.getAttribute("name");
            List<String> emailList = (List<String>) request.getAttribute("email");
            List<String> positionList = (List<String>) request.getAttribute("position");
            List<String> isAdminList = (List<String>) request.getAttribute("isAdmin");
        %>
        
        <!--######################################### return if successfully deleted ###########################################################
        -->
        <%
            String isSuccessfullyDeleted = (String)request.getAttribute("isSuccessfullyDeleted");
            if(isSuccessfullyDeleted!=null && isSuccessfullyDeleted.equals("success")){
                // print error at the top
        %>
                <div class="alert alert-success">
                  <strong>Success:</strong> Employee successfully deleted!
                </div>
        <%
            }
        %>
        <!-- ########################################################## header ########################################################## -->
        <%
            String empId = (String) session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee emp = empDAO.getEmployeeByID(empId);
            String employeeName = "";
            if (emp == null) {
                employeeName = "No User";
            } else {
                employeeName = emp.getName();
            }
        %>
        
        <nav class="container-fluid" width="100%" height="100%">
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
                            <!--
                                <li><a href="SearchStaff.jsp">Search Staff</a></li>
                                <li><a href="SearchClient.jsp">Search Client</a></li>
                                <li><a href="SearchJob.jsp">Search Job</a></li>
                                <li><a href="ViewJob.jsp">View Job</a></li>
                                <li><a href="AddNewJob.jsp">Add New Job</a></li>
                                <li><a href="EditJob.jsp">Edit Job</a></li>
                                <li><a href="DeleteJob.jsp">Delete Job</a></li>
                            -->
                                <li><a href="Task_Assigned_Table.jsp">View Tasks</a></li>
                                <li><a href="ViewEmployee.jsp">View Employee</a></li>
                            </ul>
                        </div>
                        <div class="align-buttons">
                            <a href="Calendar_Employee.jsp"><span class="glyphicon glyphicon-home"</span>Home</a>
                            <a href="StaffProfile.jsp"><span class="glyphicon glyphicon-user"></span> <%=employeeName%></a>
                            <a href="LogoutProcess"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
                        </div>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-default navbar-center" style="padding-bottom: 20px">
                <div class="container-fluid" style="text-align: center">
                    <div class="container-fluid">
                        <h3></h3>
                        <!-- insert assigned tasks here -->
                        <h2>Overview of Employees</h2>
                        <table id="myTable">
                            <tr>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Position</th>
                                <th>Admin Access</th>
                                <th>Update Details</th>
                                <th>Delete</th>
                            </tr>
                            <%
                                for (int i = 0; i < nameList.size(); i++) {
                            %>
                                    <tr>
                                        <td>
                                            <%=nameList.get(i)%>
                                        </td>
                                        <td>
                                            <%=emailList.get(i)%>
                                        </td>
                                        <td>
                                            <%=positionList.get(i)%>
                                        </td>
                                        <td>
                                            <%=isAdminList.get(i)%>
                                        </td>
                                        <form method="post" action="UpdateEmployee.jsp">
                                            <input type="hidden" value="<%=nameList.get(i)%>" name="name">
                                            <td>
                                                <input type="submit" id ="UpdateEmployeeInfoServlet" value="Update Employee">
                                            </td>
                                        </form>
                                        <form method="post" action="DeleteEmployeeServlet">
                                            <input type="hidden" value="<%=nameList.get(i)%>" name="name">
                                            <td>
                                                <input type="submit" id="DeleteEmployeeServlet" value="Delete Employee">
                                            </td>
                                        </form>
                                    </tr>
                            <%
                                }
                            %>
                        </table>
                    </div>
                </div>
            </nav>
        <script>
            function myFunction() {
                var input, filter, table, tr, td, i;
                input = document.getElementById("myInput");
                filter = input.value.toUpperCase();
                table = document.getElementById("myTable");
                tr = table.getElementsByTagName("tr");
                for (i = 0; i < tr.length; i++) {
                    td = tr[i].getElementsByTagName("td")[0];
                    if (td) {
                        if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                            tr[i].style.display = "";
                        } else {
                            tr[i].style.display = "none";
                        }
                    }
                }
            }
        </script>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>