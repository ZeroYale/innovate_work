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

import com.etc.bean.Teacher;
import com.etc.db.ConnDB;
import com.etc.service.TeacherService;


public class TeaFindServlet extends HttpServlet {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
		String num = request.getParameter("num");
		
		TeacherService teacherService = new TeacherService(); 
		Teacher teacher = teacherService.FindTeacher(num);
		request.setAttribute("teacher", teacher);
		request.getRequestDispatcher("TeaFind.jsp").forward(request, response);
	
	
	}

}
