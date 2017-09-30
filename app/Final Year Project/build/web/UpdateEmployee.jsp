<%-- 
    Document   : UpdateEmployee
    Created on : Aug 20, 2017, 9:50:54 PM
    Author     : yemin
--%>

<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp"%>
<%@include file="AdminAccessOnly.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Employee Details</title>
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
        <!-- ########################################################## header ########################################################## -->
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
            //check if the the attributes exists, if not then redirect to get it
            
            //getting all attributes
            /*String employeeID = (String) request.getAttribute("id");
            String password = (String) request.getAttribute("password");
            String email = (String) request.getAttribute("email");
            String isAdmin2 = (Boolean) request.getAttribute("isAdmin");
            String currentSalary = (String) request.getAttribute("currentSalary");
            String position = (String) request.getAttribute("position");
            Boolean supervisor = (Boolean) request.getAttribute("supervisor");
            Double cpf = (Double) request.getAttribute("cpf");
            String bankAcct = (String) request.getAttribute("bankAcct");
            String nric = (String) request.getAttribute("nric");
            String name = (String) request.getAttribute("name");
            String number = (String) request.getAttribute("number");
            */
            Boolean status = (Boolean)request.getAttribute("status");
            String name = request.getParameter("name");
            Employee employeeToUpdate = empDAO.getEmployee(name);
        %>
        
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
            <nav class="navbar navbar-default navbar-center">
                <div class="container-fluid" style="text-align: center">
                    <div class="container-fluid">
                        <%
                        if(status!=null && status==false){
                        %>
                            <div class="alert alert-danger">
                                <strong>Error: </strong>Cannot Update Employee Details, please try again!
                            </div>
                        <%
                        }else if (status!=null && status== true){
                        %>
                            <div class="alert alert-success">
                                <strong>Success:</strong> Employee details successfully updated!
                            </div>
                        <%
                        }  
                        %>
                        <h3>Edit User Details!</h3>
                        <!-- insert form here -->
                        <form method="post" action="UpdateEmployeeInfoServlet">
                                <label>Employee ID: </label>
                                <input type="text" name='employeeID' id="employeeID" class="form-control" placeholder=<%=employeeToUpdate.getEmployeeID()%> required autofocus readonly>
                                </br>
                                <label>Email: </label>
                                <input type="text" name='email' id="email" class="form-control" value=<%=employeeToUpdate.getEmail()%> required autofocus>
                                </br>
                                <label> Admin: </label>
                                <input type="text" name='isAdmin' id="isAdmin" class="form-control" value=<%=employeeToUpdate.getIsAdmin()%> required autofocus>
                                </br>
                                <label>Salary: </label>
                                <input type="text" name='currentSalary' id="currentSalary" class="form-control" value=<%=employeeToUpdate.getCurrentSalary()%> required autofocus>
                                </br>   
                                <label>Position: </label>
                                <input type="text" name='position' id="position" class="form-control" value=<%=employeeToUpdate.getPosition()%> required autofocus>
                                </br>   
                                <label>Supervisor: </label>
                                <input type="text" name='supervisor' id="supervisor" class="form-control" value=<%=employeeToUpdate.getIsSupervisor()%> required autofocus>
                                </br> 
                                <label>CPF: </label>
                                <input type="text" name='CPF' id="CPF" class="form-control" value=<%=employeeToUpdate.getCpf()%> required autofocus>
                                </br>
                                <label>Number of Projects Worked On: </label>
                                <input type="text" name='projectsWorkedOn' id="projectsWorkedOn" class="form-control" placeholder=<%=employeeToUpdate.getProjectsWorkedOn()%> required autofocus readonly="readonly">
                                </br>
                                <label>Bank Account: </label>
                                <input type="text" name='bankAccount' id="bankAccount" class="form-control" value=<%=employeeToUpdate.getBankAccount()%> required autofocus>
                                </br>
                                <label>NRIC: </label>
                                <input type="text" name='NRIC' id="NRIC" class="form-control" value=<%=employeeToUpdate.getNric()%> required autofocus>
                                </br>   
                                <label>Name: </label>
                                <input type="text" name='name' id="name" class="form-control" value=<%=employeeToUpdate.getName()%> required autofocus>
                                </br>
                                <label>Number: </label>
                                <input type="text" name='number' id="number" class="form-control" value=<%=employeeToUpdate.getPhoneNum()%> required autofocus>
                                </br>
                                 
                                <input type="submit" name="submit">
                                
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
