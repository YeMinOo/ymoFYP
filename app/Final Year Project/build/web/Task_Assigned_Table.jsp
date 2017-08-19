<%-- 
    Document   : Task_Assigned_Table
    Created on : Aug 19, 2017, 10:33:20 AM
    Author     : yemin
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overview of Assigned Tasks</title>
        <style>
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
                    || request.getAttribute("startDate") == null || request.getAttribute("remarks") == null
                    || request.getAttribute("assignedEmployee") == null || request.getAttribute("projectStatus") == null) {
        %>
        <jsp:forward page="TaskAssignedTableServlet"/>
        <%
            }
            List<String> titleList = (List<String>) request.getAttribute("title");
            List<String> startDateList = (List<String>) request.getAttribute("startDate");
            List<String> endDateList = (List<String>) request.getAttribute("endDate");
            List<String> remarksList = (List<String>) request.getAttribute("remarks");
            List<String> assignedEmployeeList = (List<String>) request.getAttribute("assignedEmployee");
            List<String> projectStatusList = (List<String>) request.getAttribute("projectStatus");
        %>
        <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Employee" title="Type in Employee">
        <table id="myTable">
            <tr class="header">
                <th>
                    Employee Assigned
                </th>
                <th>
                    Title
                </th>
                <th>
                    Start Date
                </th>
                <th>
                    End Date
                </th>
                <th>
                    Remarks
                </th>
                <th>
                    Completion Status
                </th>
            </tr>
            <%
                for (int i = 0; i < titleList.size(); i++) {
                    out.print("<tr>");
                    out.print("<td>");
                    String assignedEmployee = assignedEmployeeList.get(i);
                    if (assignedEmployee == null || assignedEmployee.length() == 0) {
                        out.print("Not Assigned");
                    } else {
                        out.print(assignedEmployee);
                    }
                    out.print("</td>");
                    out.print("<td>");
                    out.print(titleList.get(i));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(startDateList.get(i));
                    out.print("</td>");
                    out.print("<td>");
                    out.print(endDateList.get(i));
                    out.print("</td>");
                    out.print("<td>");
                    String remarks = remarksList.get(i);
                    if (remarks == null || remarks.length() == 0) {
                        out.print("NA");
                    } else {
                        out.print(remarks);
                    }
                    out.print("</td>");
                    out.print("<td>");
                    String status = projectStatusList.get(i);
                    if (status.equals("1")) {
                        out.print("Not Completed");
                    } else {
                        out.print("Completed");
                    }
                    out.print("</td>");
                    out.print("</tr>");
                }
            %>
        </table>
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
</html>
