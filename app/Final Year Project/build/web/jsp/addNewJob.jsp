<%-- 
    Document   : addNewJob
    Created on : Jul 16, 2017, 9:31:15 AM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Job</title>            
    </head>
    <body>
        <div class="container">
            <p>
                <form action='AddNewJobServlet' method='post'>
                    <label>Job Type: </label>
                    <select name='jobType'>
                        <option value='recurring'>Recurring</option>
                        <option value='AdHoc'>AdHoc</option>
                    </select>
                    </br>
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
                    <label>Due Date: </label>
                    <input type="date" name='dueDate' id="dueDate" class="form-control" placeholder="Due Date of Project" required autofocus>
                     </br>                   
                    <label>Completion Date: </label>
                    <input type="date" name='completionDate' id="completionDate" class="form-control" placeholder="Completion Date of Project" required autofocus>
                    </br>
                    <label>Job Priority: </label>
                    <select name='priorityLevel'>
                        <option value='crucial'>Crucial</option>
                        <option value='High'>High</option>
                        <option value='Medium'>Medium</option>
                        <option value='Low'>Low</option>
                    </select>
                    </br>
                    <label>Employee In Charge: </label>
                    <input type="text" name='staffAssignedTo' id='staffAssignedTo' class ='form-control' placeholder='Job Assigned To' required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Create New Job!</button>
                </form>
            </p>
        </div>
    </body>
</html>
