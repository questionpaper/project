<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: garamond, Helvetica, sans-serif;}
form {border:1px solid black;width:500px;height:420px;}

input[type=text], input[type=password] {
  width: 34%;
  padding: 12px 20px;
  margin: 20px;
  display: inline-block;
  border: 1px solid #ccc;
 }
 
button {
  background-color: #4CAF50;
  color: white;
  padding: 10px 16px;
  margin: 6px 0;
  border: none;
  cursor: pointer;
  width: 18%;
 
}

button:hover {
  opacity: 0.8;
}


.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar{
  width: 15%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
 
}
</style>
</head>
<body>

<center><h1>Student Registration </h1></center>

<center><form action="TakeTest.jsp">
<div class="imgcontainer">
    <img src="img.png" alt="Avatar" class="avatar">
  </div>

  
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required><br>


    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required><br><br> 
        
    <center><button type="submit">Register</button></center>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

</form></center>

</body>
</html>