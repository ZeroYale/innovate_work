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


public class StuFindServlet extends HttpServlet {
	
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
		String cla = null;
		

		
		conn = ConnDB.openConn();
		try {

			String sql ="select * from student where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
			name = rs.getString("name");
			sex = rs.getString("sex");
			academy = rs.getString("academy");
			cla = rs.getString("cla");
			
			request.setAttribute("name", name);
			request.setAttribute("num", num);
			request.setAttribute("sex", sex);
			request.setAttribute("academy", academy);
			request.setAttribute("cla", cla);
			
			request.getRequestDispatcher("StuFind.jsp").forward(request, response);
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
