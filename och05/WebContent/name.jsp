<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error2.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int num = Integer.parseInt(request.getParameter("num"));

%>
<h1>오류발생 예제</h1>
<h2>이름 : <%=request.getParameter("name").toUpperCase() %></h2>
<h2>숫자 : <%=num/0 %></h2>
</body>
</html>