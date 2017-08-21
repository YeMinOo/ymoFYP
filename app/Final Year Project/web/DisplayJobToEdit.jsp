<%-- 
    Document   : DisplayJobToEdit
    Created on : Jul 22, 2017, 1:29:12 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<%@ page autoFlush="true" buffer="1094kb"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Job</title>
        <!-- this jsp is to display the current settings of the job so she knows what to edit -->
    </head>
    <body>
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
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
