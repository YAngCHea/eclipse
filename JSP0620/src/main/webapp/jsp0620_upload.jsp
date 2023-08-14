<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	  //String title = request.getParameter("title");
	
	//파일 저장하기
	//1. c드라이브 안에있는 download 폴더
	  //String uploadPath="c:/download"; 
	//2.fileFoler 폴더만들어서 거기에 저장하기
	  String uploadPath=request.getRealPath("fileFolder");    
	  
	  int size = 10*1024*1024;  //10mb
	  MultipartRequest multi = new MultipartRequest(request,uploadPath,size,"utf-8",new DefaultFileRenamePolicy());
	
	  String title = multi.getParameter("title");
	  String fileName = multi.getFilesystemName("bfile");
	
	%>
	<h2>제목 : <%=title %></h2>
	<h2>파일명 : <%=fileName %></h2>
	</body>
</html>