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


public class BookUpdateServlet extends HttpServlet {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String ISBN = request.getParameter("ISBN");
		String num = request.getParameter("num");
		String publishing = request.getParameter("publishing");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		
		conn = ConnDB.openConn();
		try {
			String sql = "update textbook set ISBN=?,publishing=?,author=? ,price=? where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, ISBN);
			ps.setString(2, publishing);
			ps.setString(3, author);
			ps.setString(4, price);
			ps.setString(5, num);
			
			int index = ps.executeUpdate();
			if(index==1){
				System.out.println("教材修改成功");
			}else{
				System.out.println("教材修改失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnDB.closeConn(rs, ps, conn);
		}
	}

}
