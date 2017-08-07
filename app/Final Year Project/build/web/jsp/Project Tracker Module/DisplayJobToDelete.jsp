<%-- 
    Document   : DisplayJobToDelete
    Created on : Aug 7, 2017, 3:37:00 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Job Confirmation</title>
    </head>
     <body>  
        <div class='container'>
            <h1 align="center">Delete Job Confirmation</h1>
            <h3 align="center">Do you want to delete this job?</h3>
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
                        <%=jobID%>
                    </td>
                    <td>
                        <%=jobTitle%>
                    </td>
                    <td>
                        <%=jobDescription%> 
                    </td>
                    <td>
                        <%=clientName%> 
                    </td>
                    <td>
                        <%=clientID%>
                    </td>
                    <td>
                        <%=startDate%> 
                    </td>
                    <td>
                        <%=completionDate%> 
                    </td>
                    <td>
                        <%=finalDate%> 
                    </td>
                    <td>
                        <%=priorityLevel%> 
                    </td>
                    <td>
                        <%=staffAssignedTo%> 
                    </td>
                    <td>
                        <%=status%> 
                    </td>
                    <td>
                        <%=jobtype%> 
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
                    
        <div class="container" align="right">
            <form action="DeleteJobConfirmationServlet" method ="post">
                <input name="clientId" type="hidden" value="<%=clientID%>">
                <input name="jobId" type="hidden" value="<%=jobID%>">
                </br>
                <input type = "submit" class='btn btn-primary' value = "Delete Job" name="Delete Job">
                <a href="DeleteJob.jsp" class='btn btn-primary'>
                    <h7>CANCEL</h7>
                </a>
            <form/>
        </div>
    </body>
</html>