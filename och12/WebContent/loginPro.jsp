<%@page import="och12.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// session.invalidate();
	String id     = request.getParameter("id");
	String passwd = request.getParameter("passwd");
    MemberDao md = MemberDao.getInstance();
    int result = md.check(id,passwd);
    if (result == 1) {
    	session.setAttribute("id", id);
    	response.sendRedirect("main.jsp");
    }  else if(result ==0) {
%>
  <script type="text/javascript">
     alert("암호몰라 T.T");
     history.go(-1);
  </script>
<% } else { %>
  <script type="text/javascript">
     alert("누구냐, 수상한데");
     history.go(-1);
  </script>
<% } %>
</body>
</html>