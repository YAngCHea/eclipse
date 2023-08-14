<%@page import="com.java.www.dto.Board"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>게시판리스트</title>
		<style>
		  h2{width: 1000px; text-align: center;}
		  table,th,td{border: 1px solid black; border-collapse: collapse;text-align: center;}
		  table{width: 1000px; margin: 30px auto;}
		  th,td{width: 200px;height: 30px;}
		</style>
	</head>
	<body>
	  <h2>직원리스트</h2>
	  <table>
	  <colgroup>
	    <col width="10%">
	    <col width="15%">
	    <col width="40%">
	    <col width="15%">
	    <col width="15%">
	    <col width="15%">
	  </colgroup>
	    <tr>
	      <th>번호</th>
	      <th>제목</th>
	      <th>작성자</th>
	      <th>내용</th>
	      <th>작성일</th>
	      <th>조회수</th>
	    </tr>
	    <%
		    int bno;
			String id;
			String btitle;
			String bcontent;
			Date bdate;
			int bhit;
			int bgroup;
			int bstep;
			int bindent;
			String bfile;
			
	      BoardDao bdao = new BoardDao();
	      ArrayList<Board> list = bdao.selectBoard();
	      for(int i=0;i<list.size();i++){
	    	  Board b = list.get(i);
		    	  bno = b.getBno();
		    	  id = b.getId();
		    	  btitle = b.getBtitle();
		    	  bcontent = b.getBcontent();
		    	  bdate = b.getBdate();
		    	  bhit = b.getBhit();
		    	  bgroup = b.getBgroup();
		    	  bstep = b.getBstep();
		    	  bindent = b.getBindent();
		    	  bfile = b.getBfile();
	    	  
	    %>
	    <tr>
	      <td><%=bno %></td>
	      <td><%=id %></td>
	      <td><%=btitle %></td>
	      <td><%=bcontent %></td>
	      <td><%=bdate %></td>
	      <td><%=bhit %></td>
	      
	    </tr>
	    <%} %>
	
	  </table>
	
	</body>
</html>