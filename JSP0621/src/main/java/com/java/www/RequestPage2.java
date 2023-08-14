package com.java.www;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestPage2")
public class RequestPage2 extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		//BoardDao 객체를 사용하기 위해서 선언하기 : dao연결(데이터베이스 연결)
		BoardDao bdao = new BoardDao();
		Board board = bdao.selectOne(3);
		
		//ArrayList 들고오기
		ArrayList<Board> list = bdao.selectAll();
		
		
		//request담기
		request.setAttribute("board", board);
		request.setAttribute("list", list);
		
		//request추가
		RequestDispatcher rd = request.getRequestDispatcher("jsp0621_02.jsp");
		rd.forward(request,response);
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
