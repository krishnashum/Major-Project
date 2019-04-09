<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>    
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add Faculty</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <nav class="navbar navbar-light bg-info">
        <h5>
			<div style="float:left;"><img src="img1.png" style='padding-right:20px; height:60px; width:80px'>
			</div>
			<div style="float:right; color:white; padding-top:5px">
				<p>
					<br>National Institute of Technology, Calicut
				</p>
			</div>
			<div style="clear: left;">
			</div>
		</h5>
    </nav>
    <nav class="navbar navbar-expand-sm navbar-light bg-light">
        <ul class="navbar-nav">
            <li class="nav-item">
				<a class="nav-link text-info" href="index">Home</a>
            </li>
            <li class="nav-item  dropdown">
				<a class="nav-link  text-info dropdown-toggle" data-toggle="dropdown" href="#">Add User
				</a>
				<div class="dropdown-menu">
					<a class="dropdown-item text-info" href="af">Faculty</a>
        			<a class="dropdown-item text-info" href="as">Student</a>
				 </div>
            </li>
			<li class="nav-item  dropdown">
				<a class="nav-link text-info dropdown-toggle" data-toggle="dropdown" href="#">Remove User
				</a>
				<div class="dropdown-menu">
					<a class="dropdown-item text-info" href="rf">Faculty</a>
        			<a class="dropdown-item text-info" href="rs">Student</a>
				</div>
            </li>
			<li class="nav-item">
				<a class="nav-link text-info" href="cp">Change Password</a>
            </li>
			<li class="nav-item">
				<a class="nav-link text-info" href="all">All Users</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="nav-link" href="home">Logout</a>
            </li>
        </ul>  
    </nav>
	<br>
	<div class="container" align="center">	
    	<h1>Add Faculty</h1>
    	<hr>
    	<label><b>User Name             :</b></label>
    	<input type="text" placeholder="User Name" name="usrname" required><br>
    	<hr>
    	<label><b>Name             :</b></label>
    	<input type="text" placeholder="Faculty Name" name="name" required><br>
    	<hr>
    	<label><b>Password             :</b></label>
    	<input type="password" placeholder="Password" name="pwd" required><br>
    	<hr>
    	<label><b>Email             :</b></label>
    	<input type="text" placeholder="Faculty Email" name="email" required><br>
    	<hr>
    	<button onclick="load()">Register</button>
	</div>
</body>
</html>