package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.dao.BoardDao;
import com.java.www.dto.Board;

public class BViewService implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bno = Integer.parseInt(request.getParameter("bno"));   //파라미터값 /* request.getParameter("bno") : String 형태로 들어와서 int로 바꿔줘야함 */
		BoardDao bdao = new BoardDao();    //객체선언
		Board board = bdao.selectOne(bno);   //메소드 호출 후 객체 받음
		
		request.setAttribute("board", board);    //request에 추가
	}

}
