<%-- 
    Document   : ViewJob
    Created on : Jul 22, 2017, 12:02:44 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Job</title>
</head>
     <body>  
        <div class='container'>
            <h1 align="center">View Job</h1>
            <table class="table table-hover" width='100%'>
                <tr>
                    <th>Job ID</th>
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
                <tr>
                    <td>
                        Job ID : <%=jobID%>
                    </td>
                    <td>
                        Job Title : <%=jobTitle%>
                    </td>
                    <td>
                        Job Description : <%=jobDescription%> 
                    </td>
                    <td>
                        Client Name : <%=clientName%> 
                    </td>
                    <td>
                        Client ID : <%=clientID%>
                    </td>
                    <td>
                        Start Date : <%=startDate%> 
                    </td>
                    <td>
                        Completion Date : <%=completionDate%> 
                    </td>
                    <td>
                        Final Date : <%=finalDate%> 
                    </td>
                    <td>
                        Priority Level : <%=priorityLevel%> 
                    </td>
                    <td>
                        Staff Assigned To : <%=staffAssignedTo%> 
                    </td>
                    <td>
                        Status : <%=status%> 
                    </td>
                    <td>
                        Job Type : <%=jobtype%> 
                    </td>
                    <% if(interval!=null){%>
                        <td>
                        <%=interval%>
                        </td>
                    <%}else{%>
                        <td></td>
                    <%}%>
                </tr>
            </table>
        </div>
    </body>
</html>
