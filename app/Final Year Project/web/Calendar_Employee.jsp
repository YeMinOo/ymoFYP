
<%@page import="com.google.gson.JsonArray"%>
<%@page import="entity.Employee"%>
<%@page import="dao.EmployeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   
        <%-- this is for tab name --%>
        <title>Admin Home Page</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        
        <link rel='stylesheet' href='lib/fullcalendar.min.css' />
        <!-- for FF, Chrome, Opera -->
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="16x16">
        <link rel="icon" type="image/png" href="/Images/Abundant Accounting Logo.png" sizes="32x32">

        <!-- for IE -->
        <link rel="icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico" >
        <link rel="shortcut icon" type="image/x-icon" href="/Images/Abundant Accounting Logo.ico"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/fullcalendar.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link href="css/orangetable.css" rel="stylesheet" type="text/css"/>
        <link href="css/calendarExtender.css" rel="stylesheet" type="text/css"/>
        <link href="css/gridview.css" rel="stylesheet" type="text/css"/>
        <link href="css/offcanvas.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="script/prevent-iframe.js"></script>
        <!--<script src="script/jquery.min.js" type="text/javascript"></script>-->
        <script src="script/bootstrap.min.js" type="text/javascript"></script>
        <!--<script src="script/fullcalendar.min.js" type="text/javascript"></script>-->
        <!--<script src="script/moment.js" type="text/javascript"></script>-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src='lib/jquery.min.js'></script>
<script src='lib/moment.min.js'></script>
<script src='lib/fullcalendar.min.js'></script>
<script>
 
 $(document).ready(function() {
  var date = new Date();
  var d = date.getDate();
  var m = date.getMonth();
  var y = date.getFullYear();
 
  var calendar = $('#calendar').fullCalendar({
   editable: true,
   header: {
    left: 'prev,next today',
    center: 'title',
    right: 'month,agendaWeek,agendaDay'
   },
   eventLimit: true,
   events:  'DisplayEvent',

   eventRender: function(event, element, view) {
    if (event.allDay === 'true') {
     event.allDay = true;
    } else {
     event.allDay = false;
    }
   },
   selectable: true,
   selectHelper: true,
   select: function(start, end, allDay) {
   var title = prompt('Project Title:');
   

   if (title) {
   var start = $.fullCalendar.formatDate(start, "YYYY-MM-DD HH:mm:ss");
   var end = $.fullCalendar.formatDate(end, "YYYY-MM-DD HH:mm:ss");
   $.ajax({
     url: 'AddEvent',
     data: 'title='+ title+'&'+'start='+ start +'&'+'end='+ end,
     type: 'POST',
     success: function(data) {
     alert("Added Successfully");
           //$('#somediv').text(responseText);
     }
   });
   
   calendar.fullCalendar('renderEvent',
   {
     title: title,
     start: start,
     end: end,
     allDay: allDay
   },
   true
   );
   }
   calendar.fullCalendar('unselect');
   },

   editable: false,
   eventDrop: function(event, delta) {
   var start = $.fullCalendar.formatDate(event.start, "YYYY-MM-DD HH:mm:ss");
   var end = $.fullCalendar.formatDate(event.end, "YYYY-MM-DD HH:mm:ss");
   $.ajax({
     url: 'UpdateEvent',
     data: 'title='+ event.title+'&start='+ start +'&end='+ end +'&id='+ event.id ,
     type: "POST",
     success: function(data) {
      alert("Updated Successfully");
     }
   });
   },
   eventClick: function(event) {
  var decision = confirm("Are you sure you want to delete this project?"); 
  if (decision) {
  $.ajax({
    type: "POST",
    url: "DeleteEvent",
    data: "&id=" + event.id,
     success: function(data) {
       $('#calendar').fullCalendar('removeEvents', event.id);
        alert("Deleted Successfully");}
  });
  }
    },
   eventResize: function(event) {
     var start = $.fullCalendar.formatDate(event.start, "yyyy-MM-dd HH:mm:ss");
     var end = $.fullCalendar.formatDate(event.end, "yyyy-MM-dd HH:mm:ss");
     $.ajax({
      url: 'UpdateEvent',
      data: 'title='+ event.title+'&start='+ start +'&end='+ end +'&id='+ event.id ,
      type: "POST",
      success: function(data) {
       alert("Updated Successfully");
      }
     });
  }
   
  });
  
 });

</script>
<style type="text/css">
            .bs-docs-featurette + .bs-docs-footer {
                margin-top: 0;
                border-top: 0;
            }
            
            .align-buttons{
                display: inline;
                bottom: 0;
            }
            .overall-margin {
                margin: 10%, 10%, 10%, 10%;
            }
            
            .bs-docs-footer {
                margin-top: 100px;
                color: #777;
                text-align: center;
                border-top: 1px solid #e5e5e5;
            }

            #hr {
                position: absolute;
                top: 25%;
                left: 35%;
            }

            .form-control {
                margin: 10px 0;
            }

            .well {
                padding: 10px 15px;
            }

            .alignsentence {
                padding: 15px;
            }

            .labelpadding {
                margin-left: 155px;
            }

            .notoppadding {
                padding-top: 1px;
            }

            .buttonmargin {
                margin-top: 11px;
            }

            .margin-right-5 {
                margin-right: 5px;
            }

            .nobgcl {
                background-color: #FFFFFF;
            }
        
            body, html {
                height: 100%;
                background-repeat: no-repeat;
            }

            .card-container.card {
                max-width: 350px;
                padding: 40px 40px;
            }

            .btn {
                font-weight: 700;
                height: 36px;
                -moz-user-select: none;
                -webkit-user-select: none;
                user-select: none;
                cursor: default;
            }

            /*
             * Card component
             */
            .card {
                background-color: #F7F7F7;
                /* just in case there no content*/
                padding: 20px 25px 30px;
                margin: 0 auto 25px;
                margin-top: 50px;
                /* shadows and rounded borders */
                -moz-border-radius: 2px;
                -webkit-border-radius: 2px;
                border-radius: 2px;
                -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            }

            .profile-img-card {
                width: 96px;
                height: 96px;
                margin: 0 auto 10px;
                display: block;
                -moz-border-radius: 50%;
                -webkit-border-radius: 50%;
                border-radius: 50%;
            }

            /*
             * Form styles
             */
            .profile-name-card {
                font-size: 16px;
                font-weight: bold;
                text-align: center;
                margin: 10px 0 0;
                min-height: 1em;
            }

            .reauth-email {
                display: block;
                color: #404040;
                line-height: 2;
                margin-bottom: 10px;
                font-size: 14px;
                text-align: center;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: nowrap;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin #inputUsername,
            .form-signin #inputPassword {
                direction: ltr;
                height: 44px;
                font-size: 16px;
            }

            .form-signin input[type=text],
            .form-signin input[type=password],
            .form-signin input[type=text],
            .form-signin button {
                width: 100%;
                display: block;
                margin-bottom: 10px;
                z-index: 1;
                position: relative;
                -moz-box-sizing: border-box;
                -webkit-box-sizing: border-box;
                box-sizing: border-box;
            }

            .form-signin .form-control:focus {
                border-color: rgb(104, 145, 162);
                outline: 0;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgb(104, 145, 162);
            }

            .btn.btn-signin {
                /*background-color: #4d90fe; */
                background-color: rgb(104, 145, 162);
                /* background-color: linear-gradient(rgb(104, 145, 162), rgb(12, 97, 33));*/
                padding: 0px;
                font-weight: 700;
                font-size: 14px;
                height: 36px;
                -moz-border-radius: 3px;
                -webkit-border-radius: 3px;
                border-radius: 3px;
                border: none;
                -o-transition: all 0.218s;
                -moz-transition: all 0.218s;
                -webkit-transition: all 0.218s;
                transition: all 0.218s;
            }
            body{
                padding: 0;
                margin: 0;
            }
        </style>
          
</head>
<body>
       <% 
            String empId = (String)session.getAttribute("userId");
            EmployeeDAO empDAO = new EmployeeDAO();
            Employee emp = empDAO.getEmployeeByID(empId);
            String employeeName = "";
            if(emp==null){
                employeeName = "No User";
            }else{
                employeeName = emp.getName();
            }
        %>
        <!--
        ###########################################################################################################################
        -->
        <nav class="container-fluid">
            <nav class="navbar navbar-default navbar-static-top">
                <div class="container-fluid" style="margin: auto">
                    <div class="navbar-header">
                        <div>
                            <img src="images/Abundant Accounting Logo - Copy.png" width="30%" height="30%"/>
                        </div><a class="navbar-brand" href="http://www.abaccounting.com.sg/">Abundant Accounting</a>
                    </div>
                    <div class="navbar-right" style="position: relative">
                        <div class="dropdown align-buttons">
                            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Functions
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu">
                              <li><a href="#">Home</a></li>
                              <li><a href="SearchStaff.jsp">Search Staff</a></li>
                              <li><a href="SearchClient.jsp">Search Client</a></li>
                              <li><a href="SearchJob.jsp">Search Job</a></li>
                              <li><a href="ViewJob.jsp">View Job</a></li>
                              <li><a href="AddNewJob.jsp">Add New Job</a></li>
                              <li><a href="EditJob.jsp">Edit Job</a></li>
                              <li><a href="DeleteJob.jsp">Delete Job</a></li>
                            </ul>
                        </div>
                        <div class="align-buttons">
                            <a href="StaffProfile.jsp"><span class="glyphicon glyphicon-user"></span><%=employeeName%></a>
                            <a href="LogoutProcess"><span class="glyphicon glyphicon-log-out"></span>Logout</a>
                        </div>
                    </div>
                </div>
            </nav>
            <nav class="navbar navbar-default navbar-center">
                <div class="container-fluid" style="text-align: center">
                    <h2 style="color:#777">Your Calendar</h2>
                    <div class="container-fluid">
                        <!-- insert calendar here -->
                        <div id='calendar'></div>
                    </div>
                </div>
            </nav>
        </nav>
</body>
<footer class="bs-docs-footer" role="contentinfo">
            <div class="container" style="text-align: center">
            <p style="color:#949494">Abundant Accounting PTE LTD, 69 Ubi Road 1 (Oxley Bizhub)#08-16, Singapore 408731</p>
            <p style="color:#949494">Copyright© 2017 Abundant Accounting, Singapore. All rights reserved.</p>
            </div>
    </footer>
</html>