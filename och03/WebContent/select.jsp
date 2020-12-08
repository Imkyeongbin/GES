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
	String[] col = {"red","orange","yellow","green","blue","navy","violet","black"};
	int n = (int)(Math.random() * 8);
	//String num = request.getParameter("num");
	//RequestDispatcher rd = null;
	String pgm = request.getParameter("pgm") + ".jsp";
	RequestDispatcher rd = request.getRequestDispatcher(pgm);
	if(pgm.equals("color1.jsp")){
		request.setAttribute("color", col[n]);
		//rd = request.getRequestDispatcher("color1.jsp");
	}else if(pgm.equals("gugu1.jsp")){
		request.setAttribute("num", n+2);
		//rd = request.getRequestDispatcher("gugu1.jsp");
	}else if(pgm.equals("response.jsp")){
		//rd = request.getRequestDispatcher("response.jsp");
	}
	rd.forward(request, response);
%>
</body>
</html>