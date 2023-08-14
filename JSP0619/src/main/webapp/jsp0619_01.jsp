<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!      /* ! =>전역변수로 선언 */ /* BD연결할때마다 써야한다 */
	Connection conn;  /* SQLdeveloper를 열어줌 */
	PreparedStatement pstmt;  /* BDA를 더블클릭해서 실행 */
	ResultSet rs;     /* 쿼리문을 받아오는것 : 데이터를 가져오는것*/
	
	//컬럼 선언하기
	int empno;
	String ename;
	String job;
	int mgr;
	String hiredate;
	double sal;
	double comm;
	int deptno;
	String query;

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
		  table,th,td{border: 1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	  <h2>직원리스트</h2>
	  <table>
	    <tr>
	      <th>직원번호</th>
	      <th>이름</th>
	      <th>직급</th>
	      <th>관리자</th>
	      <th>입사일</th>
	      <th>월급</th>
	      <th>인센티브</th>
	      <th>부서번호</th>
	    </tr>

<%
	  try{  //외부에서 파일이나 데이터를 읽어볼때는 무적권 try-catch문을 사용해야한다
		  
		  //1.디벨로퍼 열어줘
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  //2.로그인해줘
		  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");   /* url,user,pw */
	      
		  query = "select * from emp ";
			  
		  //3.실행시켜줘
		  pstmt = conn.prepareStatement(query);
		  rs = pstmt.executeQuery();
		  //-----------------------------
		  
		  //4.쿼리문 입력
		  /* query = "select * from member"; */
		  
			  
		  
		  //5.결과값가져와줘
		  //rs = stmt.executeQuery(query);
		  
		  while(rs.next()){     //5명
			  int empno;
			  String ename;
			  String job;
			  int mgr;
			  String hiredate;
			  double sal;
			  double comm;
			  int deptno;
			  
			  empno = rs.getInt("empno");
			  ename = rs.getString("ename");
			  job = rs.getString("job");
			  mgr = rs.getInt("mgr");
			  hiredate = rs.getString("hiredate");
			  sal = rs.getDouble("sal");
			  comm = rs.getDouble("comm");
			  deptno = rs.getInt("deptno");
			  
		  //6.결과문 출력 
		  out.println("번호 : " +empno+", 이름 : "+ename+ ", 직급 : " + job+
				  ", 관리자 : " + mgr+", 입사일 : " + hiredate+", 월급 : " + sal+
				  ", 수당 : " + comm+", 부서번호 : " + deptno+"<br>");
		  %>
		  
		  <!-- html태그 -->
		  <tr>
		    <td><%=empno %></td>
		    <td><%=ename %></td>
		    <td><%=job %></td>
		    <td><%=mgr %></td>
		    <td><%=hiredate %></td>
		    <td><%=sal %></td>
		    <td><%=comm %></td>
		    <td><%=deptno %></td>
		  </tr>
		  
		  <%
		  }
		  
	  }catch(Exception e){
		  e.printStackTrace();
	  }finally{
		  try{
			  if(rs!=null) rs.close();
			  if(pstmt!=null) pstmt.close();
			  if(conn!=null) conn.close(); 
		  }catch(Exception e2){e2.printStackTrace();}
	  }
	
	%>

	  </table>
	</body>
</html>