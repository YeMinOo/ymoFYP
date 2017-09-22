<%-- 
    Document   : CreateClient
    Created on : Sep 15, 2017, 3:07:35 PM
    Author     : jagdishps.2014
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Protect.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Client</title>
    </head>
    <body>
        <div class="container-fluid">
            
            <h1>Create Client</h1>
            <div class="container">
                <form action="AddClientServlet" method="post">
                    <label>Company Category: </label>
                    <input type="text" name='companyCategory' id="companyCategory" class="form-control" placeholder="Company Category" required autofocus>
                    </br>
                    <label>Business Type: </label>
                    <input type="text" name='businessType' id="businessType" class="form-control" placeholder="Business Type" required autofocus>
                    </br>
                    <label>Company Name: </label>
                    <input type="text" name='companyName' id="companyName" class="form-control" placeholder="Company Name" required autofocus>
                    </br>
                    <label>Incorporation: </label>
                    <input type="text" name='incorporation' id="incorporation" class="form-control" placeholder="Incorporation" required autofocus>
                    </br>
                    <label>UEN Number: </label>
                    <input type="text" name='UenNumber' id="UenNumber" class="form-control" placeholder="UEN Number" required autofocus>
                    </br>
                    <label>Office Contact: </label>
                    <input type="text" name='officeContact' id="officeContact" class="form-control" placeholder="Office Contact" autofocus>
                    </br>
                    <label>Mobile Contact: </label>
                    <input type="text" name='mobileContact' id="mobileContact" class="form-control" placeholder="Mobile Contact" required autofocus>
                    </br>
                    <label>Email Address: </label>
                    <input type="text" name='emailAddress' id="emailAddress" class="form-control" placeholder="Email Address" required autofocus>
                    </br>
                    <label>Office Address: </label>
                    <input type="text" name='officeAddress' id="officeAddress" class="form-control" placeholder="Office Address" required autofocus>
                    </br>
                    <label>Financial Year End: </label>
                    <input type="text" name='financialYearEnd' id="financialYearEnd" class="form-control" placeholder="Financial Year End" required autofocus>
                    </br>
                    <label>GST: </label>
                    <input type="text" name='gst' id="gst" class="form-control" placeholder="GST" required autofocus>
                    </br>
                    <label>Director: </label>
                    <input type="text" name='director' id="director" class="form-control" placeholder="Director" required autofocus>
                    </br>
                    <label>Shareholder: </label>
                    <input type="text" name='shareholder' id="shareholder" class="form-control" placeholder="Shareholder" required autofocus>
                     </br>
                    <label>Secretary: </label>
                    <input type="text" name='secretary' id="secretary" class="form-control" placeholder="Secretary" required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Add New Client!</button>
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
