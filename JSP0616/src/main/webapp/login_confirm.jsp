<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 다시 확인하기</title>
	</head>
	<body>
	  <!-- 모든 쿠키 확인하기 -->
	  <%
	  Cookie[] cookies = request.getCookies();  //쿠키 모두 가져오기
	  if(cookies != null){
		  for(int i=0; i<cookies.length;i++){
			  out.println("name : " + cookies[i].getName()+"<br>");
			  out.println("value : " + cookies[i].getValue()+"<br>");
		  }
	  }
	%>
	
	</body>
</html>