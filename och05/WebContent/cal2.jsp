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
		try{
			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			out.print(num1+" + "+num2+" = " + (num1+num2)+"<p>");
			out.print(num1+" - "+num2+" = " + (num1-num2)+"<p>");
			out.print(num1+" * "+num2+" = " + (num1*num2)+"<p>");
			out.print(num1+" / "+num2+" = " + (num1/num2)+"<p>");
		}catch(Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	%>
</body>
</html>