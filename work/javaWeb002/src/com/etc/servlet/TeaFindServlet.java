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


public class TeaFindServlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = null;
		String sex = null;		
		String num = request.getParameter("num");
		String academy = null;
		String authority = null;
		

		
		conn = ConnDB.openConn();
		try {

			String sql ="select * from teacher where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
			name = rs.getString("name");
			sex = rs.getString("sex");
			academy = rs.getString("academy");
			authority = rs.getString("authority");
			
			request.setAttribute("name", name);
			request.setAttribute("num", num);
			request.setAttribute("sex", sex);
			request.setAttribute("academy", academy);
			request.setAttribute("authority", authority);
			
			request.getRequestDispatcher("TeaFind.jsp").forward(request, response);
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
