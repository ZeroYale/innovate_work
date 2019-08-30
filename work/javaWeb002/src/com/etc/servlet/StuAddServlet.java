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


public class StuAddServlet extends HttpServlet {
		
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
		
		Student student = new Student();
		student.setName(name);
		student.setNum(num);
		student.setSex(sex);
		student.setAcademy(academy);
		student.setCla(cla);
		
		StudentService studentService = new StudentService();
			int index = studentService.AddStudent(student);
			if(index ==1) {
				response.sendRedirect("main.jsp");
			}else {
				response.sendRedirect("login.jsp");
			}
		
	}

}
