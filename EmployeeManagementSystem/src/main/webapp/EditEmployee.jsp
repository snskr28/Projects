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
	EmployeeBean eb=(EmployeeBean)session.getAttribute("emp");
	%>
	<form action="update" method="post">
		<input type="hidden" name="eid" value=<%=eb.getEid() %>>
		Basic Salary   : <input type="text" name="bsal" value=<%=eb.getBsal() %>> 
		HRA(0.91/0.93) : <input type="text" name="hra" value=<%=eb.getHra() %>><br>
		DA(0.61/0.63)  : <input type="text" name="da" value=<%=eb.getDa() %>><br>
		<input type="submit" value="Update Employee">
	</form>
</body>
</html>