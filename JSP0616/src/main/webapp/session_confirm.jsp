<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>섹션 모두 읽기</title>
	</head>
	<body>
	  <%
	    Enumeration enumeration = session.getAttributeNames();
	    while(enumeration.hasMoreElements()){     /* hasMoreElements : ()안에 있는애가 있으면 돌리고 아니면 실행X */
	    	String sName = enumeration.nextElement().toString();
	        String sValue = (String)session.getAttribute(sName);      /* session.getAttribute(sName):object 타입이라 string으로 변환해줘야함 */
	        out.println("name : "+sName+"<br>");
	        out.println("value : "+sValue+"<br>");
	    }
	    
	    session.invalidate();   //섹션모두 삭제하기
	    
	    
	  %>
	
	</body>
</html>