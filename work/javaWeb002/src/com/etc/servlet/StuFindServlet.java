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

import com.etc.bean.Student;
import com.etc.db.ConnDB;
import com.etc.service.StudentService;


public class StuFindServlet extends HttpServlet {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num = request.getParameter("num");

		StudentService studentSerivce = new StudentService(); 
		Student student =  studentSerivce.FindStudent(num);
		System.out.println(num);
		request.setAttribute("student", student);
		request.getRequestDispatcher("StuFind.jsp").forward(request, response);
	}

}
