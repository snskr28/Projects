<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	AdminBean ab=(AdminBean)session.getAttribute("abean");
	out.println("Page Belongs to Admin: "+ab.getFname()+"<br>");
	String msg=(String)request.getAttribute("msg");
	out.println("msg");
	%>
	<a href="employee.html">Add Employee</a><br>
	<a href="view">View Employees</a><br>
	<a href="logut">Logout</a>
</body>
</html>