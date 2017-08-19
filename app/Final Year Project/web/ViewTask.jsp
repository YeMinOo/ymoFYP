<%-- 
    Document   : ViewTask
    Created on : Aug 18, 2017, 5:55:40 PM
    Author     : yemin
--%>

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
        <table id="myTable">
            <thead>
                Overview of Assigned Tasks
                <tr>
                    <th>
                        Task To Complete
                    </th>
                    <th>
                        Completion Date
                    </th>
                    <th>
                        Press when Completed
                    </th>
                </tr>
                <%
                    if (titleList.size() == endDateList.size()) {
                        for (int i = 0; i < titleList.size(); i++) {
                            out.print("<tr>");
                            out.print("<td>");
                            out.print(titleList.get(i));
                            out.print("</td>");
                            out.print("<td>");
                            out.print(endDateList.get(i));
                            out.print("</td>");
                %>
            <td>
                <form method="post" action="UpdateRecur">
                    <input type="hidden" value="<%=idList.get(i)%>" name="id">
                    <input type="hidden" value="<%=startDateList.get(i)%>" name="startDate">
                    <input type="hidden" value="<%=endDateList.get(i)%>" name="endDate">
                    <input type="hidden" value="<%=recurList.get(i)%>" name="recur">
                    <input type="submit" value="Complete">
                </form>
            </td>
            <%
                        out.print("</tr>");
                    }
                }
            %>
        </thead>
    </table>
    <table id="myTable">
        <thead>
            Tasks Overdue
            <tr>
                <th>
                    Task To Complete
                </th>
                <th>
                    Completion Date
                </th>
            </tr>
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
                        out.print("<tr bgcolor='#FF0000'>");
                        out.print("<td>");
                        out.print(overDueTask.get(i));
                        out.print("</td>");
                        out.print("<td>");
                        out.print(overDueList.get(i));
                        out.print("</td>");
                        out.print("</tr>");
                    }
                }
            %>
        </thead>
    </table>
</body>
</html>
