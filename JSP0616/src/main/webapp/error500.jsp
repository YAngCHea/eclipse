<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>     <!-- 에러페이지로 사용하는거냐?true -->
<% response.setStatus(200); %><!-- 정상페이지 -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>error404</title>
		<style>
		  *{margin: 0; padding: 0;}
		  div{width: 500px;height:200px; margin: 50px auto;border:1px solid #efefef;}
		  img{width: 700px;}
		</style>
	</head>
	<body>
	  <div onclick="javascript:history.back();">
	    <a href="main.jsp"><img src="images2/500error.jpg"></a>
	  </div>
	</body>
</html>