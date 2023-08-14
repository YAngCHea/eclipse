<%@page import="com.java.www.dto.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
        String sessionId = (String)session.getAttribute("sessionId");
	  	String id,pw,name,phone;
	  	MemberDao mdao = new MemberDao();
        Member member = mdao.selectMemberOne(sessionId);
        
  		id = member.getId();
  		pw = member.getPw();
  		name = member.getName();
  		phone = member.getPhone();
	  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정</title>
	</head>
	<body>
		<h2>회원정보수정</h2>
		<form action="jsp0619_modifyOk.jsp" method="get" name="memberFrm">
		  <label>아이디</label>
		  <input type="text" name="id" value="<%=id %>" readonly><br>
		  <label>패스워드</label>
		  <input type="text" name="pw" value="<%=pw %>"><br>
		  <label>이름</label>
		  <input type="text" name="name" value="<%= name%>"><br>
		  <label>전화번호</label>
		  <input type="text" name="phone" value="<%= phone%>"><br>
		  <input type="submit" value="전송"><br>
		  <button type="button"><a href="jsp0619_main.jsp"></a></button>
		</form>
	
	</body>
</html>