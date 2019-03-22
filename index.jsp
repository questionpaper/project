<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
	margin: 0;
         padding:0 ;
	background: url("https://www.nxt.group/wp-content/uploads/2016/04/gradient-background-26046-26731-hd-wallpapers.jpg.png");
	background-size: cover;
	background-position: center;
	font-family: sans-serif;
	background-repeat: no-repeat;
	height: 720px;
	
}

.loginbox{

	width: 320px;
	hight: 420px;
	background: rgba(0, 0, 0, 0.5);
	color: #000;
	top: 50%;
	left: 50%;
	position: centre;
	transform: translate(-50%,-50%);
	box-sizing: border-box;
	padding: 70px 70px;
position: relative;
  left: 450px;
	
}

.avatar{
	width: 100px;
	hight: 100px;
	border-radius: 50%;
	position: absolute;
	top: -50px;
	left: calc(50% - 50px);
}

h1{
	margin: 0;
	padding: 0 0 20px;
	text-align: center;
	font-size: 22px;
}

.loginbox p{
	margin: 0;
	padding-left: 0px ;
	font-weight: bold;
}

.loginbox input{
	weight: 100%;
	margin-bottom: 20px;
}

.loginbox input[type="text"], input[type="password"] 
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: #000;
	font-size: 16px;
}

.loginbox input[type="submit"], input[type="submit"]
{
	border: none;
	outline: none;
	height: 40px;
	background: #fb2525;
	color: #fff;
	font-size: 12px;
	border-radius: 12px;
	display: inline-block;
	text-align: center;
  	text-decoration: none;
	padding: 6px 12px;
	width: 75%;
	margin-left:30px;
	height: 25px;
}

.loginbox input[type="submit"], input[type="submit"]
{
	cursor: pointer;
	background: #fff;
	color: #000;
}

.loginbox a{
	text-decoration: none;
	font-size: 12px;
	line-height:20px;
	color: darkgrey;
}

.loginbox a:hover
{
	color: #216ac4;
}
</style>
<body>

	<div class="loginbox">
	<img src="avatar.png" class="avatar">
	  <h1>Login</h1>
	 
	  <form action="LoginServlet" method="post">
		<p>Username</p>
		<input type="text" name="userName" placeholder="Enter Username">
		<p>Password</p>
		<input type="password" name="password" placeholder="Enter Password"><br>
		<input type="submit" value="Login" on click="clicked()">
		
                <div class="submitbutton">
		</form>
		<a href="register.jsp">registration/sign up</a>
	</div>
	</div>
</body>
</head>
</html>

</body>
</html>