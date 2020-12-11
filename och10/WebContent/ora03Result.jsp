<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>부서정보</h2>
<%-- <%

String deptno = request.getAttribute("deptno").toString();
String dname = request.getAttribute("dname").toString();
String loc = request.getAttribute("loc").toString();
out.print("부서코드 : " + deptno + "<p>");
out.print("부서명 : " + dname + "<p>");
out.print("근무지 : " + loc + "<p>");
%> --%>
부서코드 : ${deptno }<p>
부서명 : ${dname }<p>
근무지 : ${loc }<p>
</body>
</html>