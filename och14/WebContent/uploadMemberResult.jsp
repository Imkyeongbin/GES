<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	String context = request.getContextPath();
	System.out.println("context Path : " + context);
%>

<body>
	<h1>파일 Upload 전송 결과(Servlet)</h1>
	UpLoad id : ${id }<p>
	UpLoad name : ${name }<p> 
	UpLoad 사진  : <img alt="전송사진" src="<%=context%>/${fileName}">
</body>
</html>