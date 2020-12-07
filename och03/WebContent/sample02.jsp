<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>스크립트릿 예제 - 활용</h2>
	<%
		Calendar getDate = Calendar.getInstance();
		Date	 nowTime = getDate.getTime();
	%>
	
	현재 <%=nowTime.getHours() %>시 <%=nowTime.getMinutes()%>분입니다.
</body>
</html>