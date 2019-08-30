package com.etc.service;

import java.util.List;

import com.etc.bean.Student;
import com.etc.dao.StudentDAO;

public class StudentService {
	StudentDAO studentDAO = new StudentDAO();
	
	
	public int AddStudent(Student student) {
		return studentDAO.AddStudent(student);
	}
	
	public int DeleteStudent(String id) {
		return studentDAO.DeleteStudent(id);
	}
	
	public Student FindStudent(String id){
		return studentDAO.FindStudent(id);
	}
}
