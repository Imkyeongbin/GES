<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 다른 jsp에서 Form 아닌 request.setAttribut 변수로 저장 해서 보냈을 때
	int num = Integer.parseInt(request.getAttribute("num").toString());
	out.print("<h1>구구단 "+num+"단</h1>");
	for(int i=1; i<=9 ; i++){
		out.print(num+" * "+i+" = " + (num*i)+"<br>");
	}
%>
</body>
</html>