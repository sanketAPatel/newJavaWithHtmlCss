<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>
	<title>Login V1</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
			
			<div class="wrap-input100" >
							<h1 class="input100">Add New Employee</h1> 
						<span class="focus-input100"></span>
						
					</div>
			
			<div class="wrap-input100">
		<h3 class="input100">	welcome   ${username} ,  to "Index.jsp"</h3>
			<span class="focus-input100"></span>
			</div>


<form  class="login100-form validate-form" action="SaveServlet" method="post"> 

					
					<div class="wrap-input100 validate-input" >
						<input class="input100" type="text" name="name" placeholder="userName">
						<span class="focus-input100"></span>
						
						
					</div>

					<div class="wrap-input100 validate-input" >
						<input class="input100" type="password" name="password" placeholder="userPass">
						<span class="focus-input100"></span>
						</div>
						
						<div class="wrap-input100 validate-input" >
						<input class="input100" type="email" name="email" placeholder="email">
						<span class="focus-input100"></span>
						
					</div>
					
					<div class="wrap-input100 validate-input" >
					
						<select name="country" class="input100" placeholder="country">  
				     <option>India</option>  
				     <option>USA</option>  
					<option>UK</option>  
					<option>Other</option>  
						</select>  
						<span class="focus-input100"></span>
						
					</div>
						
					
					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Save Employee
						</button><span class="focus-input100"></span>
						</div>

 </form>


<div class="container-login100-form-btn">
						<button><a href="ViewServlet"> click here! To view employees</a> </button>
					</div>
  
   
<br/>  


			</div>
		</div>
	</div>
	
	
	
<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>