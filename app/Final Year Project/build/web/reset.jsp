
<!DOCTYPE html>
<html>
   
    
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/styles.css" />
         <title>JSP Page</title>
        
    </head>
     <body>

        <div id="main">
        	
        	
        	
        	<form class="" method="post" action="resetPasswordServlet">
        		
        	
        		
        		<div class="row pass">
        			<input type="password" id="password1" name="password1" placeholder="Enter New Password" />
        		</div>
        		
        		<div class="row pass">
        			<input type="password" id="password2" name="password2" placeholder="Confirm New Password"  />
        		</div>
        		
        		<!-- The rotating arrow -->
        		<div class="arrowCap"></div>
        		<div class="arrow"></div>
        		
        		<p class="meterText">Password Meter</p>
        		
        		<input type="submit" value="Register" />
        		
                          <%
            String error = (String) request.getAttribute("msg");
            if (error != null && error.equals("Passwords Mismatched!!")) {
                // print error at the top
        %>
        <div class="alert alert-danger">
            <strong>Passwords Mismatched!!</strong>
        </div>
        <%
            }
        %>
        	</form>
        </div>
        
       
        
        
		<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
		<script src="lib/jquery.complexify.js"></script>
		<script src="lib/script.js"></script>
		     
    </body>
</html>
