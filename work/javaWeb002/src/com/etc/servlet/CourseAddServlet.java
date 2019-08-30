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

import com.etc.bean.Course;
import com.etc.db.ConnDB;
import com.etc.service.CourseService;


public class CourseAddServlet extends HttpServlet {
	
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
		String type = request.getParameter("type");
		String credit = request.getParameter("credit");
		Course course = new Course();
		course.setNum(num);
		course.setName(name);
		course.setType(type);
		course.setCredit(credit);
		
		CourseService courseService =  new CourseService();
		int index = courseService.AddCourse(course);
		if(index ==1) {
			response.sendRedirect("main.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	
	}

}
