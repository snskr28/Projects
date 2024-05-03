<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 table,th,td{
 	border: solid 1px black;
 }
</style>
</head>
<body>
	<%
		ArrayList<BookBean> al=(ArrayList<BookBean>)request.getAttribute("alist");
		Iterator<BookBean> it=al.iterator();
	%>
	<table>
		<tr>
			<td>BCODE</td>
			<td>BNAME</td>
			<td>AUTHOR</td>
			<td>PRICE</td>
			<td>QUANTITY</td>
		</tr>
		<% while(it.hasNext()){
			BookBean bb=it.next();%>
		<tr>
			<td><%=bb.getbCode() %></td>
			<td><%=bb.getbName() %></td>
			<td><%=bb.getbAuthor() %></td>
			<td><%=bb.getbPrice() %></td>
			<td><%=bb.getbQty() %></td>
		</tr>
		<%} %>
	</table>
	
	<%@include file="link.html" %>
</body>
</html>