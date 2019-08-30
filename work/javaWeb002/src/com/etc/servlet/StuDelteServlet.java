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


public class StuDelteServlet extends HttpServlet {
	

       

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String num = request.getParameter("num");
		
		StudentService studentService = new StudentService();
		int index = studentService.DeleteStudent(num);
			if(index == 1) {
				response.sendRedirect("main.jsp");
			}
			

	}

}
