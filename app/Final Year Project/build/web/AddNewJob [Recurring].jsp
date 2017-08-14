<%-- 
    Document   : AddNewJob [AdHoc]
    Created on : Aug 7, 2017, 1:37:33 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Protect.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Recurring Job!</title>            
    </head>
    <body>
        <div class="container">
                <form action='AddNewRecurringJobServlet' method='post'>
                    <label>Job Title: </label>
                    <input type="text" name='jobTitle' id="inputJobTitle" class="form-control" placeholder="Job Title" required autofocus>
                    </br>
                    <label>Job Description: </label>
                    <textarea name='jobDescription' id='jobDescription' placeholder="Job Description"></textarea>
                    <br />
                    <label>Client: </label>
                    <input type ="text" name="clientName" id="clientName" class="form-control" placeholder="Client Name" required autofocus>
                    </br>
                    <label>Client ID: </label>
                    <input type ="text" name="clientID" id="clientID" class="form-control" placeholder="Client ID" required autofocus>
                    </br>                    
                    <!-- 
                        startdate is when the job is entered or one day after the previous recurring job
                    -->
                    <label>Start Date: </label>
                    <input type="date" name='startDate' id="startDate" class="form-control" placeholder="Start Date of Job" required autofocus>
                    </br>
                    <label>Completion Date: </label>
                    <input type="date" name='completionDate' id="completionDate" class="form-control" placeholder="Completion Date of Job" required autofocus>
                    </br>
                    <label>Final Date: </label>
                    <input type="date" name='finalDate' id="finalDate" class="form-control" placeholder="Final Date of Job" required autofocus>
                    </br>
                    <label>Interval: </label>
                    <select name="interval" placeholder="Interval between recurring jobs" required autofocus>
                        <option value="daily">Daily</option>
                        <option value="Weekly">Weekly</option>
                        <option value="Monthly">Monthly</option>
                        <option value="Quarterly">Quarterly</option>
                        <option value="Half-Yearly">Half-Yearly</option>
                        <option value="Yearly">Yearly</option>
                    </select>
                    <label>Job Priority: </label>
                    <select name='priorityLevel'>
                        <option value='High'>High</option>
                        <option value='Medium'>Medium</option>
                        <option value='Low'>Low</option>
                    </select>
                    </br>
                    <label>Employee/Manager In Charge: </label>
                    <input type="text" name='staffAssignedTo' id='staffAssignedTo' class ='form-control' placeholder='Job Assigned To' required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Create New Job!</button>
                </form>
        </div>
    </body>
</html>