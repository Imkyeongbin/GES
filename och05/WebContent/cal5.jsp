<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>연산결과(Web.xml Setting 통한 Error 처리)</h2>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	out.print(num1+" + "+num2+" = " + (num1+num2)+"<p>");
	out.print(num1+" - "+num2+" = " + (num1-num2)+"<p>");
	out.print(num1+" * "+num2+" = " + (num1*num2)+"<p>");
	out.print(num1+" / "+num2+" = " + (num1/num2)+"<p>");
%>
</body>
</html>