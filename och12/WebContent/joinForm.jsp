<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		background-color: pink;
	}
</style>
</head>
<body>
	<h2>회원가입</h2>
	<form action="joinPro.jsp" name="frm" onsubmit="return chk()">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" required="required" placeholder="아이디">
					<input type="button" value="아이디 Check" onclick="winop()">
				</td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="password" name="passwd" required="required"></td>
			</tr>
			<tr>
				<td>암호확인</td>
				<td><input type="password" name="passwd2" required="required">
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" required="required">
				</td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" required="required"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" required="required"
					pattern="\d{2,3}-\d{3,4}-\d{4}"
					placeholder="xxx-xxxx-xxxx"
					title="2,3자리-3,4자리-4자리"
					>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="확인"></td>
				<td><input type="reset" value="취소"></td>
		</table>
	</form>
</body>
</html>