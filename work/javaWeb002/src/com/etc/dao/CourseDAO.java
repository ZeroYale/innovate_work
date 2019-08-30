package com.etc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.etc.bean.Course;
import com.etc.db.ConnDB;


public class CourseDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public Course FindCourse(String num) {
		Course course =new Course();
		
		conn = ConnDB.openConn();
		try {

			String sql ="select * from course where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
				course.setNum(rs.getString(1));
				course.setName(rs.getString(2));
				course.setType(rs.getString(3));
				course.setCredit(rs.getString(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return course;
	}

	public int DeleteCourse(String id) {
		int num = 0;

		conn = ConnDB.openConn();
		try {
			String sql = "delete from course where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
	
			num = ps.executeUpdate();
			if(num ==1) {
				System.out.println("�γ�ɾ���ɹ�");
			}else {
				System.out.println("�γ�ɾ��ʧ��");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
		
	}

	public int AddCourse(Course course) {
		
		int num = 0;

		conn = ConnDB.openConn();
		try {
			String sql = "insert into course(num,name,type,credit) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, course.getNum());
			ps.setString(2, course.getName());
			ps.setString(3, course.getType());
			ps.setString(4, course.getCredit());
			int index = ps.executeUpdate();
			if(index ==1) {
				System.out.println("�γ���ӳɹ�");
			}else {
				System.out.println("�γ����ʧ��");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
}
