<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- bean을 사용할 때 -->
<jsp:useBean id="pt" class="och08.Book" scope="request"/>
<!-- parameter 가져올 때 -->
코드번호 : <jsp:getProperty property="code" name="pt" /><p>
이름    : <jsp:getProperty property="name" name="pt"/><p>
가격    : <jsp:getProperty property="price" name="pt"/><p>
<!-- Page이동 -->
</body>
</html>