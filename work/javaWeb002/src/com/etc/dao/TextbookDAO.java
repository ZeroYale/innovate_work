package com.etc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.etc.bean.Student;
import com.etc.bean.Textbook;
import com.etc.db.ConnDB;

public class TextbookDAO {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int AddTextbook(Textbook textbook) {
		int num = 0;
		
		conn = ConnDB.openConn();
		try {
			String sql = "insert into textbook(ISBN,num,publishing,author,price) values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, textbook.getISBN());
			ps.setString(2, textbook.getNum());
			ps.setString(3, textbook.getPublishing());
			ps.setString(4, textbook.getAuthor());
			ps.setString(5, textbook.getPrice());
			num = ps.executeUpdate();
			if(num ==1) {
				System.out.println("教材增加成功");
			}else {
				System.out.println("教材增加失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
	
	public int UpdateTextbook(Textbook textbook) {
		int num = 0;
		conn = ConnDB.openConn();
		try {
			String sql = "update textbook set ISBN=?,publishing=?,author=? ,price=? where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, textbook.getISBN());
			ps.setString(2, textbook.getPublishing());
			ps.setString(3,textbook.getAuthor());
			ps.setString(4, textbook.getPrice());
			ps.setString(5, textbook.getNum());		
			num = ps.executeUpdate();
			if(num==1){
				System.out.println("教材修改成功");
			}else{
				System.out.println("教材修改失败");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			ConnDB.closeConn(rs, ps, conn);
		}
		return num;
	}
	
	public int DeleteTextbook(String id) {
		int index = 0;
		conn = ConnDB.openConn();
		try {
			String sql = "delete from textbook where num=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			index = ps.executeUpdate();
			if(index ==1) {
				System.out.println("教材删除成功");
			}else {
				System.out.println("教材删除失败");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
	
		return index;
	}
	
	public Textbook FindTextbook(String num) {
		Textbook textbook = new Textbook();
		
		conn = ConnDB.openConn();
		try {
			
			String sql ="select * from textbook where num=? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			if(rs.next()){
				textbook.setISBN(rs.getString(1));
				textbook.setNum(rs.getString(2));
				textbook.setPublishing(rs.getString(3));
				textbook.setAuthor(rs.getString(4));
				textbook.setPrice(rs.getString(5));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ConnDB.closeConn(rs, ps, conn);
		}
		
		return textbook;
	}

}
