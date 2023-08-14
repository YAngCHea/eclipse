package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BirthConfirm")
public class BirthConfirm extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doAction");
		
		//form의 모든 데이터 =>request에 저장
		//request에 저장된 데이터 불러오기
		String birth = request.getParameter("birth");
		int num_birth = Integer.parseInt(birth);
		Date today = new Date(System.currentTimeMillis());
		
		int year = today.getYear();
		
		int age = 2023 - num_birth;
		System.out.println("당신의 나이 : " + age);
		
		String content = "";
		if(age>=18) {
			
			content = "<h2 style='color:blue;font-weight:600;'>주류 판매가 가능합니다.</h2>";
		}else {
			content = "<h2 style='color:red;font-weight:600;'>!!!!!!미성년자!!!!!!! 주류판매 금지합니다.</h2>";
		}
		
		response.setContentType("text/html; charset = utf-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>미성년자 ALERT</title></head>");
		writer.println("<body>");
		writer.println(content);
		writer.println("</body>");
		writer.println("</html>");
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("doGet");
	  doAction(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	}

}
