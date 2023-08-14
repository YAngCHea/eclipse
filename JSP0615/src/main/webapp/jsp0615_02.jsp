<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	  <!-- html주석:얘는 웹에서 소스코드 보기 하면 나온다 -->    
	  
	  <%-- jsp주석 : 얘는 웹에서 소스코드보기 해도 안나온다
	   <%
	    for(int i=0;i<100;i++){
	    	out.println(i+"<br>");
	    }
	  %> 
	    --%>
	  
	  <!-- 0123456789 라고 찍는거랑 똑같은 효과 -->
	 
	
	<%-- jsp주석 
	<%
	   //구구단찍기 : 이렇게는 앞으로 안쓸꺼에여!!!!!!!
	   out.println(" <table>");
	   for(int i=2;i<=9;i++){
		   out.println(i+" 단"+"<br>");
		   for(int j=1;j<=9;j++){
			   /* out.println(i+"*"+j+"="+(i*j)+"<br>"); */
			   out.println("<tr>");
			   out.println("<td>"+i+"</td>");
			   out.println("<td>*</td>");
			   out.println("<td>"+j+"</td>");
			   out.println("<td>=</td>");
			   out.println("<td>"+i*j+"</td>");
			   out.println("</tr>");
		   }
	   }
	  out.println("</table>");
	  %> --%>
	  
<%-- 
      <table>
	  <%
	    for(int i=2;i<=9;i++){
	    	for(int j=1;j<=9;j++){	
	  %>
	    <tr>
	      <td><% out.println(i); %></td>
	      <td>*</td>
	      <td><% out.println(j); %></td>
	      <td>=</td>
	      <td><% out.println(i*j); %></td>
	    </tr>
	  <%   }
	    }
	  %>
	  </table>
	  
--%>

<!-- 표현식 만들기 -->
	<table>
	  <%
	    for(int i=2;i<=9;i++){
	    	for(int j=1;j<=9;j++){	
	  %>
	    <tr>
	      <td><%=i %></td>
	      <td>*</td>
	      <td><%=j %></td>
	      <td>=</td>
	      <td><%= i*j %></td>
	    </tr>
	  <%   }
	    }
	  %>
	  </table>


	
	
	</body>
</html>