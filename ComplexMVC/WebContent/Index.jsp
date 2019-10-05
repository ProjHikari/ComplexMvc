<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.io.PrintWriter;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<style>
.b1{
background:yellow;
color:black;
border-radius:25%;
}
.tab{
padding:10px;
}

</style>
<body bgcolor="#95d1c7">
<%
PrintWriter pw=response.getWriter(); 
HttpSession hs=request.getSession();
String msg=(String)hs.getAttribute("Error");
if(msg!=null){
pw.println("<h2>"+msg+"</h2>");
}
%>
<center><h1>Enter your details</h1>
<form action="Validation">
<table class="tab">
<tr>
<td>UserName: </td>
<td><input type="text" name="usnme" required></td>
</tr><br>
<tr>
<td>Password: </td>
<td><input type="text" name="pwd" required></td>
</tr><br>
</table><br>
<center><input  type="submit" value="Login" class="b1"></center>
</form></center><br><br>
<center><form action="Register.jsp">
Need an account?
<br><input type="submit" value="Register">
</form></center>
</body>
<style>
table, th, td {
  border: 1px solid black;
}
</html>