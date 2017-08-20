<%-- 
    Document   : ViewTask
    Created on : Aug 18, 2017, 5:55:40 PM
    Author     : yemin
--%>

<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Tasks</title>
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
            if (request.getAttribute("title") == null || request.getAttribute("endDate") == null
                    || request.getAttribute("id") == null || request.getAttribute("startDate") == null
                    || request.getAttribute("recur") == null) {
        %>
                <jsp:forward page="ViewTaskServlet"/>
        <%
            }
            List<String> titleList = (List<String>) request.getAttribute("title");
            List<String> endDateList = (List<String>) request.getAttribute("endDate");
            List<String> idList = (List<String>) request.getAttribute("id");
            List<String> startDateList = (List<String>) request.getAttribute("startDate");
            List<String> recurList = (List<String>) request.getAttribute("recur");
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
                                <li><a href="ViewTask.jsp">View Tasks</a></li>
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
                        <h3></h3>
                        <!-- insert assigned tasks here -->
                        <h2>Overview of Assigned Tasks</h2>
                        <table id="myTable">
                            <tr>
                                <th>Tasks to Complete</th>
                                <th>Completion Date</th>
                                <th>Press if Completed</th>
                            </tr>
                            <%
                                if (titleList.size() == endDateList.size()) {
                                    for (int i = 0; i < titleList.size(); i++) {  
                            %>
                                        <tr>
                                            <td>
                                                <%=titleList.get(i)%>
                                            </td>
                                            <td>
                                                <%=endDateList.get(i)%>
                                            </td>
                                            <td>
                                                <form method="post" action="UpdateRecur">
                                                    <input type="hidden" value="<%=idList.get(i)%>" name="id">
                                                    <input type="hidden" value="<%=startDateList.get(i)%>" name="startDate">
                                                    <input type="hidden" value="<%=endDateList.get(i)%>" name="endDate">
                                                    <input type="hidden" value="<%=recurList.get(i)%>" name="recur">
                                                    <input type="submit" value="Complete">
                                                </form>
                                            </td>
                                        </tr>
                            <%
                                    }
                                }
                            %>
                        </table>
                        <h2>Overdue Tasks</h2>
                        <table id="myTable">
                            <tr>
                                <th>Task to Complete</th>
                                <th>Completion Date</th>
                                <%
                                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                Date date = new Date();

                                String today = dateFormat.format(date);
                                //System.out.println("TODAY DATE==============" + today);
                                List<String> overDueList = new ArrayList();
                                List<String> overDueTask = new ArrayList();

                                for (int i = 0; i < endDateList.size(); i++) {
                                    String endDate = endDateList.get(i);
                                    if (today.compareTo(endDate) > 0) {
                                        overDueList.add(endDate);
                                        overDueTask.add(titleList.get(i));
                                    }
                                }
                                if (overDueList.size() == overDueTask.size()) {
                                    for (int i = 0; i < overDueList.size(); i++) {
                                %>
                                        <tr bgcolor="#FF0000">
                                            <td>
                                                <%=overDueTask.get(i)%>
                                            </td>
                                            <td>
                                                <%=overDueList.get(i)%>
                                            </td>
                                        </tr>
                                <%
                                    }
                                }
                                %>
                        </table>
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
