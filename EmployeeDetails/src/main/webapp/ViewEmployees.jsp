<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>
<style>
	table, th, td{
		border: solid 1px black;
	}
</style>
</head>
<body>
	<%
		ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)request.getAttribute("alist");
		Iterator<EmployeeBean> it=al.iterator();
	%>
	<table>
		<tr>
			<th>EID</th>
			<th>ENAME</th>
			<th>DESG</th>
			<th>BSAL</th>
			<th>HRA</th>
			<th>DA</th>
			<th>TOTSAL</th>
		</tr>
		<% while(it.hasNext()){
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
		</tr>
		<%} %>
	</table>
	<%@include file="home.html" %>
</body>
</html>