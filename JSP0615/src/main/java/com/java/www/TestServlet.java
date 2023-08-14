package com.java.www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")    /* servlet은 콘솔창에 찍힌다 */
public class TestServlet extends HttpServlet {
       
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String gender = request.getParameter("name");
		String[] hobbys = request.getParameterValues("hobbys");
		System.out.println("name : "+name);
		System.out.println("gender : "+gender);
		System.out.println("hobbys : "+hobbys);  //이렇게 찍으면 주소값나옴
		
		//배열은 for문 돌려서 찍어야함
		for(int i=0;i<hobbys.length;i++) {
			System.out.println(hobbys[i]);
		}
		
		PrintWriter writer = response.getWriter();
		  writer.println("<html><head><title>상단탭</title></head>");
		  writer.println("<body>"); writer.println("<h2>hello~~~servlet</h2>");
		  writer.println("</body>"); writer.println("</html>"); writer.close();
	
	}

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
		
		/*
		 * String name = request.getParameter("name"); String gender =
		 * request.getParameter("name"); String[] hobbys =
		 * request.getParameterValues("hobbys"); System.out.println("name : "+name);
		 * System.out.println("gender : "+gender);
		 * System.out.println("hobbys : "+hobbys); //이렇게 찍으면 주소값나옴
		 * 
		 * //배열은 for문 돌려서 찍어야함 for(int i=0;i<hobbys.length;i++) {
		 * System.out.println(hobbys[i]); }
		 * 
		 * //get방식으로 접근할 때 - url직접접근, form-method:get System.out.println("안녕하세요");//얘는
		 * 콘솔창에 찍힌다
		 * 
		 * 
		 * response.setContentType("text/html; charset = utf-8"); //이 아래부분은 창이 열리면서
		 * html에 들어간다 PrintWriter writer = response.getWriter();
		 * writer.println("<html><head><title>상단탭</title></head>");
		 * writer.println("<body>"); writer.println("<h2>hello~~~servlet</h2>");
		 * writer.println("</body>"); writer.println("</html>"); writer.close();
		 */
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
		
		/*
		 * //form-post 접근할 때 System.out.println("안녕하세요 post입니다.");
		 * request.setCharacterEncoding("utf-8");
		 * 
		 * String name = request.getParameter("name"); String gender =
		 * request.getParameter("name"); String[] hobbys =
		 * request.getParameterValues("hobbys"); System.out.println("name : "+name);
		 * System.out.println("gender : "+gender);
		 * System.out.println("hobbys : "+hobbys); //이렇게 찍으면 주소값나옴
		 * 
		 * //배열은 for문 돌려서 찍어야함 for(int i=0;i<hobbys.length;i++) {
		 * System.out.println(hobbys[i]); }
		 */
	}

}
