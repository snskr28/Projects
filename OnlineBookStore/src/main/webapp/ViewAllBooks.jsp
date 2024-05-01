<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,test.BookBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<BookBean> al=(ArrayList<BookBean>)request.getAttribute("alist");
		Iterator<BookBean> it=al.iterator();
		while(it.hasNext()){
			BookBean bb=(BookBean)it.next();
			out.println(bb.getbCode()+"&emsp;&nbsp;"+bb.getbName()+"&emsp;&nbsp;"+bb.getbAuthor()+"&emsp;&nbsp;"+bb.getbPrice()+"&emsp;&nbsp;"+bb.getbQty()+"<br>");
		}
	%>
	<%@include file="link.html" %>
</body>
</html>