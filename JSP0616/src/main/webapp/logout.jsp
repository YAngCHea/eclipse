<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>logout</title>
	</head>
	<body>
	<%   /* 전체삭제하기 */
	  session.invalidate();
	%>
	<script>
	  alert("로그아웃 되었습니다.");
	  location.href="main.jsp";
	</script>
	
	</body>
</html>