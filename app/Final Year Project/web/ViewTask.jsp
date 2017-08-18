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

    </head>
    <body>
        <%
            if (request.getAttribute("title") == null || request.getAttribute("endDate") == null) {
        %>
        <jsp:forward page="ViewTaskServlet"/>
        <%
            }
            List<String> titleList = (List<String>) request.getAttribute("title");
            List<String> endDateList = (List<String>) request.getAttribute("endDate");
        %>
        <table>
            <thead>
                Taks Assigned
                <tr>
                    <th>
                        Task To Complete
                    </th>
                    <th>
                        Completion Date
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
                            out.print("</tr>");
                        }
                    }
                %>
            </thead>
        </table>
        <table>
            <thead>
                Overdue Tasks
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
                    System.out.println("TODAY DATE=============="+today);
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
                            out.print("<tr>");
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
