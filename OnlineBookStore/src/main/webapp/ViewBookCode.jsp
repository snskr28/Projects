<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		BookBean bb=(BookBean)request.getAttribute("bean");
		out.println(bb.getbCode()+"&emsp;&nbsp;"+bb.getbName()+"&emsp;&nbsp;"+bb.getbAuthor()+"&emsp;&nbsp;"+bb.getbPrice()+"&emsp;&nbsp;"+bb.getbQty()+"<br>");
	%>
	<%@include file="link.html" %>
</body>
</html>