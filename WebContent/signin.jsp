<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	String username = request.getParameter("username") != null 
							? request.getParameter("username") : "";

	String password = request.getParameter("password") != null 
							? request.getParameter("password") : "";

	String message =  request.getAttribute("message") != null 
							? (String) request.getAttribute("message")
									: "";
	 						
%>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>

    <!-- Bootstrap -->
    <link href="resources/vendors/bootstrap-3.3.6-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/vendors/font-awesome-4.5.0/css/font-awesome.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
  </head>	
  <body>

	<div class="container">
		
		<% if (!message.equals ("")) { %>
		<div class="alert alert-danger">
			<h4><%= message %></h4>
		</div>
		<% } %>
		
		<form action="login" method="post" name="Login_Form" class="form-signin">       
		    <h3 class="form-signin-heading">Welcome Back! Please Sign In</h3>
			  <hr class="colorgraph"><br>
			  
			  <input type="text" class="form-control" 
			  	name="username" placeholder="Username" 
			  	value="<%= username %>"
			  	required="" autofocus="" />
			  <input type="password" class="form-control" 
			  	name="password" placeholder="Password" required=""
			  	value="<%= password %>"
			  	/>     		  
			 
			  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
		</form>			
		
	
	</div>

</body>
</html>