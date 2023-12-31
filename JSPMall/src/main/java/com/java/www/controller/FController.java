package com.java.www.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BDeleteService;
import com.java.www.service.BListService;
import com.java.www.service.BService;
import com.java.www.service.BViewService;
import com.java.www.service.BWriteService;
@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		String page=" ";
		BService bservice = null;
		String uri = request.getRequestURI(); // /jspMall/login.do 여기까지 열어짐
		String contextPath = request.getContextPath(); // /jspMall
		String fileName = uri.substring(contextPath.length()); // /login.do
		
		System.out.println("호출 파일 : "+fileName);
		
		
		//링크 연결하기
		if(fileName.equals("/list.do")) {
			//board테이블의 list -> request로 보냄
			bservice = new BListService();    //list가져옴
			bservice.execute(request, response);
			page = "list.jsp";
		}else if(fileName.equals("/view.do")) {
			bservice = new BViewService();   //board가져옴
			bservice.execute(request, response);
			page = "view.jsp";
		}else if(fileName.equals("/main.do")) {
			page = "main.jsp";
		}else if(fileName.equals("/write.do")) {
			page = "write.jsp";
		}else if(fileName.equals("/doWrite.do")) {
			//저장해야함
			bservice = new BWriteService();    //list가져옴
			bservice.execute(request, response);
			page="doWrite.jsp";
		}else if(fileName.equals("/delete.do")) {
			bservice = new BDeleteService();    //board에서 삭제
			bservice.execute(request, response);
			page="doDelete.jsp";
		}else if(fileName.equals("/edit.do")) {
			bservice = new BViewService();   //board가져옴
			bservice.execute(request, response);
			page="edit.jsp";
		}
		
		//포워딩
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}
}