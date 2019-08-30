package com.etc.service;

import com.etc.bean.Course;
import com.etc.dao.CourseDAO;

public class CourseService {
	CourseDAO CourseDAO = new CourseDAO();
	
	public Course FindCourse(String id) {
		return CourseDAO.FindCourse(id);
	}
	
	public int DeleteCourse(String id) {
		return CourseDAO.DeleteCourse(id);
	}
	
	public int AddCourse(Course course) {
		return CourseDAO.AddCourse(course);
	}
	
}
