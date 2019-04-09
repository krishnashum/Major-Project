<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>    
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Remove Faculty</title>
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
<body onload="load();">
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
			<li class="nav-item  dropdown">
				<a class="nav-link text-info dropdown-toggle" data-toggle="dropdown" href="#">Change Password
				</a>
				<div class="dropdown-menu">
					<a class="dropdown-item text-info" href="acp">Admin</a>
        			<a class="dropdown-item text-info" href="fcp">Faculty</a>
				</div>
            </li>
			<li class="nav-item">
				<a class="nav-link text-info" href="all">All Users</a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="nav-link" href="index">Logout</a>
            </li>
        </ul>  
    </nav>
	<br>
	<div class="container" align="center">
		<h1>Registered Faculty</h1>
		<table id="table" border=1>
			<tr> <th> User Name </th> <th> Name </th> <th> Email </th> <th> Delete </th> </tr>
		</table>
	</div>
	<script type="text/javascript">
	data = "";
	load = function()
	{	
		$.ajax(
				{
					url:'flist',
					type:'POST',
					success: function(response)
					{
						data = response.data;
						$('.tr').remove();
						for(i=0; i<response.data.length; i++)
						{					
							$("#table").append("<tr> <td> "+response.data[i].f_username+" </td> <td> "+response.data[i].f_name+" </td> <td> "+response.data[i].f_email+" </td> <td> <a href='#' onclick='delete_("+response.data[i].f_username+");'> Delete </a>  </td> </tr>");
						}			
					}				
				}
				);
		
	}

	
	delete_ = function(id)
	{		 
		 $.ajax(
				 {
					url:'fdelete',
					type:'POST',
					data:{f_username:id},
					success: function(response)
					{
						alert(response.message);
						load();
					}				
				}
			);
	}

	</script>
</body>
</html>