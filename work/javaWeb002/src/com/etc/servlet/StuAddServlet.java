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


public class StuAddServlet extends HttpServlet {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String academy = request.getParameter("academy");
		String cla = request.getParameter("cla");
		conn = ConnDB.openConn();
		try {
			String sql = "insert into student(num,name,sex,academy,cla) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setString(4, academy);
			ps.setString(5, cla);
			int index = ps.executeUpdate();
			if(index ==1) {
				System.out.println("³É¹¦");
			}else {
				System.out.println("Ê§°Ü");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
	}

}
