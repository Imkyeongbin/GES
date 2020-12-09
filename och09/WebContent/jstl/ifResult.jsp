<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.num1}<p>
${param.num2}<p>
<c:if test="${param.num1>=param.num2}">
	${param.num1 }이 ${param.num2 }보다 크같다
</c:if>
<c:if test="${param.num1<param.num2}">
	${param.num2 }이 ${param.num1 }보다 크다
</c:if>
</body>
</html>