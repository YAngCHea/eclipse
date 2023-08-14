
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
	</head>
	<body>
		<%
		    //원하는 부분을 짤라서 가져오기
		    String uri = request.getRequestURI();
		    int cPathLength = request.getContextPath().length();
		    String fileName = uri.substring(cPathLength);
		    
		    
		    //요거 세개는 꼭 알아야한다!!!!!!!!!!!!!!!!!!!!!!!!!!
			out.println("uri :"+request.getRequestURI()+"<br>");
			out.println("contextPath :"+request.getContextPath()+"<br>");
			out.println("ip :"+request.getRemoteAddr()+"<br>");
		    
			out.println("서버 :"+request.getServerName()+"<br>");
			out.println("포트번호 :"+request.getServerPort()+"<br>");
			out.println("요청방식 :"+request.getMethod()+"<br>");
			out.println("프로토콜 :"+request.getProtocol()+"<br>");
			out.println("url :"+request.getRequestURL()+"<br>");
			out.println("파일명 :"+fileName+"<br>");
		%>
		
		<!-- 파일명을 출력하시오 -->
		
		
	</body>
</html>