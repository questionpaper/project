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
    width: 97%;
    height:660px;
    background-image:url("new.jpg");
    background-size: 100% 100%;
    }
    .btn{
    float:right;
    padding: 8px;
    background:rgb(193, 199, 233);
    }
    
    .btn1{
    background:rgb(193, 199, 233);
    padding:8px;
    }
    </style>
<body>

 
  <a href="loginPage.jsp" ><button align="right" type="submit" class="btn">Logout</button></a>
    
      <center><h1 style="color:RoyalBlue;">Online Quiz Registration Panel</h1></center>
    <br>
    <h2 align="center";>Make A Choice</h2>
    <center>
    <pre>
          <form action="SetPaper.jsp">	
          	<center><br>    
        	  	<input type="radio" name="Choice" value="Set Paper" checked><font size="5"> Set Paper</font><br>
          		<input type="radio" name="Choice" value="Edit Paper"><font size="5"> Edit Paper</font><br>
          		<input type="radio" name="Choice" value="Register Student"><font size="5"> Register Student</font><br>
          		<input type="radio" name="Choice" value="View Scores"><font size="5"> View Scores</font>
    		</center>	   
    	<button type="submit" class="btn1";>Do Task</button></center></pre>
    	</form>
    
    </body>
</body>
</html>