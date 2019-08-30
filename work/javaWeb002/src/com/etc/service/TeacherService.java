package com.etc.service;

import com.etc.bean.Student;
import com.etc.bean.Teacher;
import com.etc.dao.TeacherDAO;

public class TeacherService {
	TeacherDAO teacherDAO = new TeacherDAO(); 
	
	public int AddTeacher(Teacher teacher) {
		return teacherDAO.AddTeacher(teacher);
	}
	
	public int DeleteTeacher(String id) {
		return teacherDAO.DeleteTeacher(id);
	}
	
	public Teacher FindTeacher(String id) {
		return teacherDAO.FindTeacher(id);
	}
	
}
