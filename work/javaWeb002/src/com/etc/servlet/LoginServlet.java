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


public class LoginServlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement ps =null;
	ResultSet rs =null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String num = request.getParameter("num");
		
	    conn = ConnDB.openConn();
		try {
			String a = request.getParameter("10");
			String sql = null;
			if(a.equals("1")) {
				//这是学生
				sql = "select * from student where num=? and name=?";
				
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, num);
				ps.setString(2, name);
				
				
				
				rs = ps.executeQuery();
				if(rs.next()) {
					request.getRequestDispatcher("stu.jsp").forward(request, response);
				}else {
					response.sendRedirect("login.jsp");
				}
			}else if(a.equals("2")) {
				//这是老师
				sql = "select * from teacher where num=? and name=?";
				
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, num);
				ps.setString(2, name);
				
				
				
				rs = ps.executeQuery();
				if(rs.next()) {
					request.getRequestDispatcher("main.jsp").forward(request, response);
				}else {
					response.sendRedirect("login.jsp");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnDB.closeConn(rs, ps, conn);
		}
	}

}
