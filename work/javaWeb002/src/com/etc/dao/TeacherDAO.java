package com.etc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.etc.bean.Teacher;
import com.etc.db.ConnDB;

public class TeacherDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public int AddTeacher(Teacher teacher) {
		int num = 0;
		conn = ConnDB.openConn();
		try {
			String sql = "insert into teacher(num,name,sex,academy,authority) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, teacher.getNum());
			ps.setString(2, teacher.getName());
			ps.setString(3, teacher.getSex());
			ps.setString(4, teacher.getAcademy());
			ps.setString(5, teacher.getAuthority());
			num = ps.executeUpdate();
			if(num == 1) {
				System.out.println("教师添加成功");
			}else {
				System.out.println("教师添加失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		
		return num;		
	}

	public int DeleteTeacher(String id) {
		int num = 0;
		
		conn = ConnDB.openConn();
		try {
			String sql = "delete from teacher where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
	
			num = ps.executeUpdate();
			if(num ==1) {
				System.out.println("教师删除成功");
			}else {
				System.out.println("教师删除失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
	
	public Teacher FindTeacher(String num) {
		Teacher teacher = new Teacher();
		conn = ConnDB.openConn();
		try {

			String sql ="select * from teacher where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()){
			teacher.setNum(rs.getString(1));
			teacher.setName(rs.getString(2));
			teacher.setSex(rs.getString(3));
			teacher.setAcademy(rs.getString(4));
			teacher.setAuthority(rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return teacher;
	}
	
}















