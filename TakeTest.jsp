<!DOCTYPE html>
<html>
<meta name="viewport" content="width-device-width, initial-scale=1">
<style>
body{
width: 97%;
height: 660px;
background-image:url("exam1.jpg");
background-size: 100% 100%;
}
.btn{
float:right;
padding:8px;
background:rgb(193,199,233);

}
.bttn{
padding:5px;
background:rgb(193,199,233);
}

select{
        width: 200px;
        margin: 5px;
        padding:8px;
border:1px solid Dodgerblue;

}
</style>



<a href="StudentLogin.jsp"> <button align="right" type="submit" class="btn">Logout</button></a>
<h1 align="center";> &nbsp PAPER &nbsp SELECTION &nbsp PANEL</h1>
<br>
<br>





<center><body>
<p style="font-size:160%";>Choose the Subject</p>
<select  name = "Subjectnames";size="5";>
               <option value = "1">C</option>
               <option value = "2">C++</option>
               <option value = "3">Java</option>
             </select><br>


<p style="font-size:160%";>Competency level</p>
<select ID = "Subjectid">
               <option value = "1">Level-1</option>
               <option value = "2">Level-2</option>
               <option value = "3">Level-3</option>
             </select>
<br><br>

<a href=questionSet.jsp><button type="submit" class="bttn">Take Test</button></a>
 
</body></center>
<html>
