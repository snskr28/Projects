<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table,th,tr,td{
		border: 1px solid black;
		padding: 5px;
	}
</style>
</head>
<body>
	<%	AdminBean ab=(AdminBean)session.getAttribute("abean");
		ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)session.getAttribute("alist");
		out.println("Page belongs to Admin: "+ab.getFname()+"<br>");
		Iterator<EmployeeBean> it=al.iterator();
	%>
	<table>
		<tr>
			<th>EMPID</th>
			<th>ENAME</th>
			<th>DESG</th>
			<th>BSAL</th>
			<th>HRA</th>
			<th>DA</th>
			<th>TOTSAL</th>
		</tr>
		<%
		while(it.hasNext()){
			EmployeeBean eb=(EmployeeBean)it.next();
		%>
		<tr>
			<td><%=eb.getEid() %></td>
			<td><%=eb.getEname() %></td>
			<td><%=eb.getEdesg() %></td>
			<td><%=eb.getBsal() %></td>
			<td><%=eb.getHra() %></td>
			<td><%=eb.getDa() %></td>
			<td><%=eb.getTotSal() %></td>
			<td><a href="edit">Edit</a></td>
			<td><a href="delete">Delete</a></td>	
		</tr>
		<%} %>
	</table>
	<br>
	<a href="employee.html">AddEmployee</a><br>
	<a href="logout">Logout</a>
</body>
</html>