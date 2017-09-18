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
                
            String id = (String)request.getAttribute("id");
            ClientDAO clientDAO = new ClientDAO(); 
            Client client = clientDAO.getClientById(id);
            
            %>
            <h1>Update Client</h1>
            <div class="container">
                <form action="UpdateClientServlet" method="post">
                    <label>Client ID: </label>
                    <div contenteditable>
                        <%=client.getClientId()%>
                    </div>
                    <input type="text" name='clientId' id="clientId" class="form-control" placeholder=<%=client.getClientId()%> required autofocus>
                    </br>
                    <label>Company Category: </label>
                     <div contenteditable>
                        <%=client.getCompanyCategory()%>
                    </div>
                    <input type="text" name='companyCategory' id="companyCategory" class="form-control" placeholder=<%=client.getCompanyCategory()%> required autofocus>
                    </br>
                    <label>Business Type: </label>
                     <div contenteditable>
                        <%=client.getBusinessType()%>
                    </div>
                    <input type="text" name='businessType' id="businessType" class="form-control" placeholder=<%=client.getBusinessType()%> required autofocus>
                    </br>
                    <label>Company Name: </label>
                     <div contenteditable>
                        <%=client.getCompanyName()%>
                    </div>
                    <input type="text" name='companyName' id="companyName" class="form-control" placeholder=<%=client.getCompanyName()%> required autofocus>
                    </br>
                    <label>Incorporation: </label>
                     <div contenteditable>
                        <%=client.getIncorporation()%>
                    </div>
                    <input type="text" name='incorporation' id="incorporation" class="form-control" placeholder=<%=client.getIncorporation()%> required autofocus>
                    </br>
                    <label>UEN Number: </label>
                     <div contenteditable>
                        <%=client.getUenNumber()%>
                    </div>
                    <input type="text" name='UenNumber' id="UenNumber" class="form-control" placeholder=<%=client.getUenNumber()%> required autofocus>
                    </br>
                    <label>Office Contact: </label>
                     <div contenteditable>
                        <%=client.getOfficeContact()%>
                    </div>
                    <input type="text" name='officeContact' id="officeContact" class="form-control" placeholder=<%=client.getOfficeContact()%> autofocus>
                    </br>
                    <label>Mobile Contact: </label>
                     <div contenteditable>
                        <%=client.getMobileContact()%>
                    </div>
                    <input type="text" name='mobileContact' id="mobileContact" class="form-control" placeholder=<%=client.getMobileContact()%> required autofocus>
                    </br>
                    <label>Email Address: </label>
                     <div contenteditable>
                        <%=client.getEmailAddress()%>
                    </div>
                    <input type="text" name='emailAddress' id="emailAddress" class="form-control" placeholder=<%=client.getEmailAddress()%> required autofocus>
                    </br>
                    <label>Office Address: </label>
                     <div contenteditable>
                        <%=client.getOfficeAddress()%>
                    </div>
                    <input type="text" name='officeAddress' id="officeAddress" class="form-control" placeholder=<%=client.getOfficeAddress()%> required autofocus>
                    </br>
                    <label>Financial Year End: </label>
                     <div contenteditable>
                        <%=client.getFinancialYearEnd()%>
                    </div>
                    <input type="text" name='financialYearEnd' id="financialYearEnd" class="form-control" placeholder=<%=client.getFinancialYearEnd()%> required autofocus>
                    </br>
                    <label>GST: </label>
                     <div contenteditable>
                        <%=client.getGst()%>
                    </div>
                    <input type="text" name='gst' id="gst" class="form-control" placeholder=<%=client.getGst()%> required autofocus>
                    </br>
                    <label>Director: </label>
                     <div contenteditable>
                        <%=client.getDirector()%>
                    </div>
                    <input type="text" name='director' id="director" class="form-control" placeholder=<%=client.getDirector()%> required autofocus>
                    </br>
                    <label>Shareholder: </label>
                     <div contenteditable>
                        <%=client.getShareholder()%>
                    </div>
                    <input type="text" name='shareholder' id="shareholder" class="form-control" placeholder=<%=client.getShareholder()%> required autofocus>
                     </br>
                    <label>Secretary: </label>
                     <div contenteditable>
                        <%=client.getSecretary()%>
                    </div>
                    <input type="text" name='secretary' id="secretary" class="form-control" placeholder=<%=client.getSecretary()%> required autofocus>
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

