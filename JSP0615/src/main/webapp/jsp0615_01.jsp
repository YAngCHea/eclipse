<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- html태그랑 동일한구조지만 위의 두줄이 다르다 -->
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	   <h2>회원가입</h2>
	   <form action="TestServlet" name="frm" method="get">
	   <label>이름</label>
	   <input type="text" name="name"><br>
	   <lable>성별</lable><br>
	   <input type="radio" name="gender" id="male" value="male">
	   <lable for="male">남자</lable>
	   <input type="radio" name="gender" id="female" value="female">
	   <lable for="female">여자</lable>
	   <br>
	   <label>취미</label><br>
	   <input type="checkbox" name="hobbys" id="game" value="game">
	   <lable for="game">게임</lable>
	   <input type="checkbox" name="hobbys" id="golf" value="golf">
	   <lable for="golf">골프</lable>
	   <input type="checkbox" name="hobbys" id="swim" value="swim">
	   <lable for="swim">수영</lable>
	   <input type="checkbox" name="hobbys" id="run" value="run">
	   <lable for="run">조깅</lable>
	   <input type="checkbox" name="hobbys" id="book" value=""book"">
	   <lable for=""book"">독서</lable>
	   <br>
	   <input type="submit" value="전송">
	   <br>
	   
	     	   
	   </form>
	   
	</body>
</html>