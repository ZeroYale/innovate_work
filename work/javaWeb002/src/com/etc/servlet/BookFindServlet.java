package com.etc.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.db.ConnDB;


public class BookFindServlet extends HttpServlet {
	
	Connection conn = null;
	PreparedStatement ps =null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String ISBN = null;
		String num = request.getParameter("num");
		String publishing = null;		
		String author = null;
		String price = null;
		

		
		conn = ConnDB.openConn();
		try {

			String sql ="select * from textbook where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
			ISBN = rs.getString("ISBN");
			publishing = rs.getString("publishing");
			author = rs.getString("author");
			price = rs.getString("price");
			
			request.setAttribute("ISBN", ISBN);
			request.setAttribute("num", num);
			request.setAttribute("publishing", publishing);
			request.setAttribute("author", author);
			request.setAttribute("price", price);
			
			request.getRequestDispatcher("bookFind.jsp").forward(request, response);
			}else{
				//µÇÂ¼Ê§°Ü
				response.sendRedirect("login.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
	}

}
