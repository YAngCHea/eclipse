<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  *{padding:0; margin:0;}
		  table{width:550px; margin:30px auto; text-align: center; }
		  table,td{border:1px solid black; border-collapse: collapse;}
		  td{height:35px; width:500px; }
		</style>
	</head>
	<body>
	  <%-- <%!   //함수는 servlet, class에 많이 사용한다 
	    int num=1;
	    int num2 = 5;
	    
	    private int sum(int a, int b){
		  return a+b;
	  }
	  %>
	  <table>
	    <tr>
	      <td><%= num %></td>
	      <td><%= num2 %></td>
	      <td><%= sum(num,num2) %></td>
	    </tr>
	  </table> --%>
	  
	  
	  <%!   //함수는 servlet, class에 많이 사용한다 
	    int num=1;
	    int num2 = 5;
	    int total=0;
	    
	    private int sum(int a, int b){
		     for(int i=a;i<=b;i++){ 
		    	 total += i; 
		    			 }
		     return total;
	  }
	  %>
	  
	  <%
	    int[] arr = {10,20,30};
	  %>
	  
	  <table>
	    <tr>
	      <td><%= num %></td>
	      <td><%= num2 %></td>
	      <td><%= sum(num,num2) %></td>
	    </tr>
	  </table>
	  
	  
	  
	</body>
</html>