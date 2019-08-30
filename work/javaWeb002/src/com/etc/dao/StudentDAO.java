package com.etc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.etc.bean.Student;
import com.etc.db.ConnDB;

public class StudentDAO {

	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	/*
	 * 增加
	 */
	
	public int AddStudent(Student student) {
		int num = 0;
		
		conn = ConnDB.openConn();
		try {
			String sql = "insert into student(num,name,sex,academy,cla) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, student.getNum());
			ps.setString(2, student.getName());
			ps.setString(3, student.getSex());
			ps.setString(4, student.getAcademy());
			ps.setString(5, student.getCla());
			num = ps.executeUpdate();
			if(num ==1) {
				System.out.println("学生增加成功");
			}else {
				System.out.println("学生增加失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
	/*
	 * 删除
	 */
	public int DeleteStudent(String id) {
		int num = 0;
		
		conn = ConnDB.openConn();
		try {
			String sql = "delete from student where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1,id);

			num = ps.executeUpdate();
			if(num ==1) {
				System.out.println("学生删除成功");
			}else {
				System.out.println("学生删除失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
	
	public Student FindStudent(String num) {
		Student student =new Student();
		
		conn = ConnDB.openConn();
		try {

			String sql ="select * from student where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
				student.setNum(rs.getString(1));
				student.setName(rs.getString(2));
				student.setSex(rs.getString(3));
				student.setAcademy(rs.getString(4));
				student.setCla(rs.getString(5));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnDB.closeConn(rs, ps, conn);
		}
		
		return student;
	}
	
	
	
	
	
	public List<Student> FindAllStudent(){
		List<Student> list = new ArrayList<Student>();
		
		conn = ConnDB.openConn();
		try {
			String sql ="select * from student where num=?";
			ps = conn.prepareStatement(sql);			
			rs = ps.executeQuery();
			
			while(rs.next()){
				Student student = new Student();
				student.setNum(rs.getString(1));
				student.setName(rs.getString(2));
				student.setSex(rs.getString(3));
				student.setAcademy(rs.getString(4));
				student.setCla(rs.getString(5));
				
				list.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnDB.closeConn(rs, ps, conn);
		}
		
		return list;
	}
}
