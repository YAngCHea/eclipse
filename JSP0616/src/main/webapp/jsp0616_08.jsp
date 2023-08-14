<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!      /* ! =>전역변수로 선언 */
    /* BD연결할때마다 써야한다 */
	Connection conn;  /* SQLdeveloper를 열어줌 */
	PreparedStatement pstmt;
	Statement stmt;   /* BDA를 더블클릭해서 실행 */
	ResultSet rs;     /* 쿼리문을 받아오는것 : 데이터를 가져오는것*/
	
	String id,pw,name,phone;   /* 미리 선언해주기 */
	String query;
	
	/* String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";  //oracle BDA 속성에 들어가면 서비스이름이 orcl로 되어있음
	String uid="scott";
	String query = "select * from member"; */
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>DB연결하기</title>
	</head>
	<body>
	<%
	  try{  //외부에서 파일이나 데이터를 읽어볼때는 무적권 try-catch문을 사용해야한다
		  
		  //1.디벨로퍼 열어줘
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  //2.로그인해줘
		  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");   /* url,user,pw */
	      
		  //pstmt사용하는경우-----------
		  String userId = "aaa";
		  String userPw = "1111";
		  query = "select * from member where id =? and pw = ?";
		  pstmt = conn.prepareStatement(query);
		  pstmt.setString(1, userId);
		  pstmt.setString(2, userPw);
		  rs = pstmt.executeQuery();
		  //-----------------------------
		  
		  //3.실행시켜줘
		  stmt = conn.createStatement();
		  //4.쿼리문 입력
		  /* query = "select * from member"; */
		  
			  
		  
		  //5.결과값가져와줘
		  //rs = stmt.executeQuery(query);
		  
		  while(rs.next()){     //5명
			  id = rs.getString("id");
			  pw = rs.getString("pw");
			  name = rs.getString("name");
			  phone = rs.getString("phone");
			  
		  //6.결과문 출력 
		  out.println("아이디 : " +id+", 패스워드 : "+pw+", 이름 : " + name + ", 전화번호 : " + phone+"<br>");
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
	
	</body>
</html>