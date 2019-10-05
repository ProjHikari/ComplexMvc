<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="com.mvc.DataBean" %>
<jsp:useBean id="st" class="com.mvc.DataBean" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADMIN</title>
</head>
<style>
#one{
display:none;
}
#two{
display:none
}
</style>
<script>
function viewdetails(){
	document.getElementById("two").style.display="block";
	document.getElementById("one").style.display="none";
}
function viewupdate(){
	document.getElementById("one").style.display="block";
	document.getElementById("two").style.display="none";
}
</script>
<body bgcolor="#95d1c7">
<form action="Index.jsp">
<h1>Welcome ADMIN</h1>
<input type="button" value="View Details" onclick="viewdetails()">
<input type="button" value="Update Details" onclick="viewupdate()">
<input type="submit" value="Logout">
</form>
<div id="one">
<form action="Adminserv">
<fieldset>
<legend><h3>Which user to update?</h3></legend>
<input type="text" name="uid" placeholder="Enter ID">
</fieldset><br>
<fieldset>
<legend><h3>New Details</h3></legend>
<input type="text" name="uname" placeholder="Enter Name" required><br><br>
<input type="text" name="uphone" placeholder="Enter Phone Number" required><br><br>
<input type="text" name="udept" placeholder="Enter Department" required><br><br>
<input type="text" name="usal" placeholder="Enter Salary" required><br><br>
<input type="text" name="uemail" placeholder="Enter Email" required><br><br>
<input type="text" name="upass" placeholder="Enter Password" required><br><br>

</fieldset>
<center><input type="submit" value="Submit"></center>
</form>
</div>

<div id="two">
<form action="View.jsp">
<h3>Which employee do you want to view?</h3>
<input type="text"  name="pid" placeholder="Enter ID">
<input type="submit" value="View">
</form>
</div>

</body>
<script>

</script>
</html>