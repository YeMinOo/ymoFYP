<%-- 
    Document   : UpdateDeleteClient
    Created on : Sep 15, 2017, 3:26:34 PM
    Author     : jagdishps.2014
--%>

<%@page import="entity.Client"%>
<%@page import="dao.ClientDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="Protect.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Client</title>
    </head>
    <body>
        <div class="container-fluid">
            <%
                
            String id = request.getParameter("id");
            ClientDAO clientDAO = new ClientDAO(); 
            Client client = clientDAO.getClientById(id);
            
            %>
            <h1>Update Client</h1>
            <div class="container">
                <form action="UpdateClientServlet" method="post">
                    <label>Client ID: </label>
                    <input type="text" name='clientId' id="clientId" class="form-control" placeholder=<%=client.getClientId()%> required autofocus readonly>
                    </br>
                    <label>Company Category: </label>
                    
                    <input type="text" name='companyCategory' id="companyCategory" class="form-control" value=<%=client.getCompanyCategory()%> required autofocus>
                    </br>
                    <label>Business Type: </label>
                     
                    <input type="text" name='businessType' id="businessType" class="form-control" value=<%=client.getBusinessType()%> required autofocus>
                    </br>
                    <label>Company Name: </label>
                    
                    <input type="text" name='companyName' id="companyName" class="form-control" value=<%=client.getCompanyName()%> required autofocus>
                    </br>
                    <label>Incorporation: </label>
                     
                    <input type="text" name='incorporation' id="incorporation" class="form-control" value=<%=client.getIncorporation()%> required autofocus>
                    </br>
                    <label>UEN Number: </label>
                     
                    <input type="text" name='UenNumber' id="UenNumber" class="form-control" value=<%=client.getUenNumber()%> required autofocus>
                    </br>
                    <label>Office Contact: </label>
                    
                    <input type="text" name='officeContact' id="officeContact" class="form-control" value=<%=client.getOfficeContact()%> autofocus>
                    </br>
                    <label>Mobile Contact: </label>
                     
                    <input type="text" name='mobileContact' id="mobileContact" class="form-control" value=<%=client.getMobileContact()%> required autofocus>
                    </br>
                    <label>Email Address: </label>
                    
                    <input type="text" name='emailAddress' id="emailAddress" class="form-control" value=<%=client.getEmailAddress()%> required autofocus>
                    </br>
                    <label>Office Address: </label>
                  
                    <input type="text" name='officeAddress' id="officeAddress" class="form-control" value=<%=client.getOfficeAddress()%> required autofocus>
                    </br>
                    <label>Financial Year End: </label>
                     
                    <input type="text" name='financialYearEnd' id="financialYearEnd" class="form-control" value=<%=client.getFinancialYearEnd()%> required autofocus>
                    </br>
                    <label>GST: </label>
                     
                    <input type="text" name='gst' id="gst" class="form-control" value=<%=client.getGst()%> required autofocus>
                    </br>
                    <label>Director: </label>
                     
                    <input type="text" name='director' id="director" class="form-control" value=<%=client.getDirector()%> required autofocus>
                    </br>
                    <label>Shareholder: </label>
                     
                    <input type="text" name='shareholder' id="shareholder" class="form-control" value=<%=client.getShareholder()%> required autofocus>
                     </br>
                    <label>Secretary: </label>
                    
                    <input type="text" name='secretary' id="secretary" class="form-control" value=<%=client.getSecretary()%> required autofocus>
                    </br>
                    <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Update Client!</button>
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

