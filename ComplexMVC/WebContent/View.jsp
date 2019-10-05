<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.mvc.DataBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
<body bgcolor="#95d1c7">
<center><div>
<%
PrintWriter pw = response.getWriter();
DataBean db = new DataBean();
String id=request.getParameter("pid");
db.setUid(id);
ResultSet rs=db.view();

if(rs!=null){
while(rs.next()){
	pw.println("<h2><table>");
	pw.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Phone</th><th>Department</th><th>Salary</th></tr>");
	pw.println("<tr><td>"+rs.getString(7)+"</td><td>"+rs.getString(1)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></td>");
	pw.println("</table></h2>");
}
}
else{
	pw.println("<h2>No such Entry</h2>");
}

%>
</div></center>
</head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</body>
</html>