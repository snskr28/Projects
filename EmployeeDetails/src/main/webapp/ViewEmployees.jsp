<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Employees</title>
</head>
<body>
	<%
		ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)request.getAttribute("alist");
		Iterator<EmployeeBean> it=al.iterator();
		out.println("EID"+"&nbsp&nbsp"+"ENAME"+"&nbsp&nbsp"+"DESG"+"&nbsp&nbsp"+"BSAL"+"&nbsp&nbsp"+"HRA"+"&nbsp&nbsp"+"DA"+"&nbsp&nbsp"+"TOTSAL"+"<br>");
		while(it.hasNext()){
			EmployeeBean eb=(EmployeeBean)it.next();
			out.println(eb.getEid()+"&nbsp&nbsp"+eb.getEname()+"&nbsp&nbsp"+eb.getEdesg()+"&nbsp&nbsp"+eb.getBsal()+"&nbsp&nbsp"+eb.getHra()+"&nbsp&nbsp"+eb.getDa()+"&nbsp&nbsp"+eb.getTotSal()+"<br>");
		}
	%>
	<%@include file="home.html" %>
</body>
</html>