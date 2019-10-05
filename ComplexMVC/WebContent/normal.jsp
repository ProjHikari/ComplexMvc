<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.mvc.DataBean" %>
    <%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body bgcolor="#95d1c7">

<center><h3 style="color:red">Welcome User </h3></center>
<center><form action="ViewNorm.jsp">
<h3>Which employee do you want to view?</h3>
<input type="text"  name="pid" placeholder="Enter ID">
<input type="submit" value="View">
</form></center>
</body>
</html>