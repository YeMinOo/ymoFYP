<%-- 
    Document   : ViewEmployee
    Created on : Aug 20, 2017, 9:17:29 PM
    Author     : yemin
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Employees</title>
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
        <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Employee" title="Type in Employee Name">
            <table id="myTable">
                <thead>
                    <tr class="header">
                        <th>
                            Name
                        </th>
                        <th>
                            Email
                        </th>
                        <th>
                            Position
                        </th>
                        <th>
                            Admin Access
                        </th>
                    </tr>
                    <%
                        for (int i = 0; i < nameList.size(); i++) {
                            out.print("<tr>");
                            out.print("<td>");
                            out.print(nameList.get(i));
                            out.print("</td>");
                            out.print("<td>");
                            out.print(emailList.get(i));
                            out.print("</td>");
                            out.print("<td>");
                            out.print(positionList.get(i));
                            out.print("</td>");
                            out.print("<td>");
                            out.print(isAdminList.get(i));
                            out.print("</td>");
                    %>
                <td>
                    <form method="post" action="UpdateEmployee.jsp">
                        <input type="hidden" value="<%=nameList.get(i)%>" name="name">
                        <input type="submit" value="UpdateEmployeeInfo">
                    </form>
                </td>
                <%
                        out.print("</tr>");
                    }
                %>
            </thead>
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
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
