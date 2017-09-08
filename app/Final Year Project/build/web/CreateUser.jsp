<%-- 
    Document   : CreateUser.jsp
    Created on : Sep 8, 2017, 2:50:23 PM
    Author     : Bernitatowyg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Protect.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User</title>
    </head>
    <body>
        <div class="container-fluid">
            <%
            String status = null;
            status = (String)request.getAttribute("status");
            if(status!=null & status=="Employee Added"){
            %>
                <div class="alert alert-success">
                    <strong>New User Created!</strong>
                </div>
            <%
            }else{
            %>
                <div class="alert alert-danger">
                    <strong>Problem Creating New User, Please Try Again!</strong>
                </div>
            <%
            }
            %>
            <h1>Create User</h1>
            <div class="container">
                <form action="CreateNewUser" method="post">
                    <label>Employee Name: </label>
                    <input type="text" name='employeeName' id="employeeName" class="form-control" placeholder="Employee's Name" required autofocus>
                    </br>
                    <label>Employee NRIC: </label>
                    <input type="text" name='employeeNRIC' id="employeeNRIC" class="form-control" placeholder="Employee's NRIC" required autofocus>
                    </br>
                    <label>Employee Email: </label>
                    <input type="text" name='employeeEmail' id="employeeEmail" class="form-control" placeholder="Employee's Email" required autofocus>
                    </br>
                    <label>Employee Mobile Number: </label>
                    <input type="text" name='employeeNumber' id="employeeNumber" class="form-control" placeholder="Employee's Number" required autofocus>
                    </br>
                    <label>Employee Bank Account: </label>
                    <input type="text" name='employeeBankAccount' id="employeeBankAccount" class="form-control" placeholder="Employee's Bank Account" required autofocus>
                    </br>
                    <label>Employee CPF (if any): </label>
                    <input type="text" name='employeeCPF' id="employeeCPF" class="form-control" placeholder="Employee's CPF" autofocus>
                    </br>
                    <label>Employee Position: </label>
                    <input type="text" name='employeePosition' id="employeePosition" class="form-control" placeholder="Employee's Position" required autofocus>
                    </br>
                    <label>Supervisor: </label>
                    <input type="text" name='supervisor' id="supervisor" class="form-control" placeholder="Employee's Supervisor" required autofocus>
                    </br>
                    <label>Salary: </label>
                    <input type="text" name='employeeSalary' id="employeeSalary" class="form-control" placeholder="Employee's Salary" required autofocus>
                    </br>
                    <label>Has Admin Access: </label>
                    <Select type="text" name='isAdmin' id="isAdmin" class="form-control" required autofocus>
                        <option type='text' name='isAdmin' value='yes'>
                            Has Admin Access
                        </option>
                        <option type='text' name='isAdmin' value='no'>
                            No Admin Access
                        </option>
                    </Select>
                    </br>
                    <label>Temporary Password: </label>
                    <input type="text" name='tempPassword' id="tempPassword" class="form-control" placeholder="Temporary Password" required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Create New User!</button>
                </form>
            </div>
        </div>
    </body>
    <footer class="bs-docs-footer" role="contentinfo">
        <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
        </div>
    </footer>
</html>
