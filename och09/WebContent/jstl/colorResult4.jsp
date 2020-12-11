<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<c:set var="color" value="red.orange.yellow.green.blue.navy.violet"/>
<%-- <c:set var = "num" value="1,2,3,4,5,6,7"/> --%>
<%
	int[] nums = {1,2,3,4,5,6,7};
%>
<body>
<c:forEach var="num" items="<%=nums %>">
	<c:forTokens var="col" items="${color }" delims=".">
		<font color="${col }" size="${num }">야호</font>
	</c:forTokens>
	<br>
</c:forEach>
</body>
</html>