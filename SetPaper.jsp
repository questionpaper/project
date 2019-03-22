<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="QuestionServlet"name="myform" method= "post">
  
<p>Ques. 
<textarea rows="6" cols="50" name="question"></textarea>
</p>
<p>A
<input type="checkbox" name="A" value=" "> <textarea  name="option1" rows="2" cols="50"></textarea> <br>
</p>

<p>B
<input type="checkbox" name="B" value=" "> <textarea   name="option2" rows="2" cols="50"></textarea> <br>
</p>

<p>C
<input type="checkbox" name="C" value=" "> <textarea   name="option3" rows="2" cols="50"></textarea> <br>
</p>

<p>D
<input type="checkbox" name="D" value=" "> <textarea  name="option4" rows="2" cols="50"></textarea> <br>
</p>
<br>



 <button type="submit">Submit</button></center>
 <button type="submit">Reset</button></center>

</form>

</body>
</html>