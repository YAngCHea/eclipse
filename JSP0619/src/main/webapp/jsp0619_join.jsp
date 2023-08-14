<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="jsp0619_joinOk.jsp" method="get" name="memberFrm">
		  <label>아이디</label>
		  <input type="text" name="id"><br>
		  <label>패스워드</label>
		  <input type="text" name="pw"><br>
		  <label>이름</label>
		  <input type="text" name="name"><br>
		  <label>전화번호</label>
		  <input type="text" name="phone"><br>
		  <input type="submit" value="전송"><br>
		</form>
	
	</body>
</html>