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
<!-- parameter 저장 조건 -> class & 전송HTML & 여기서 받는 모든 필드명이 동일 -->
<jsp:setProperty property="*" name="pt"/>
<%-- <jsp:setProperty property="code" name="pt"/>
<jsp:setProperty property="name" name="pt"/>
<jsp:setProperty property="price" name="pt"/> --%>
<!-- Page이동 -->
<jsp:forward page="productInfo.jsp"></jsp:forward>
</body>
</html>