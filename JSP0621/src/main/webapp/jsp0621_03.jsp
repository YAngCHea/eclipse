<%@page import="java.net.URI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri= "http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>View Page</title>
   </head>
   
   <body>
      <c:forEach var = "member" items = "${list }">
        <h3>아이디 : ${member.id }</h3>
        <h3>패스워드 : ${member.pw }</h3>
        <h3>이름 : ${member.name }</h3>
        <br>
      </c:forEach>
       
       
   </body>
</html>