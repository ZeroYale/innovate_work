package com.etc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnDB {
	
	
	public static Connection openConn() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/work_gg?useUnicode=true&characterEncoding=utf8";
			
			String user = "root";
			String password ="123456";
			
			conn = DriverManager.getConnection(url,user,password);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConn(ResultSet rs,PreparedStatement ps,Connection conn) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(ps!=null) {
				ps.close();
			}
			if(conn!=null) {
				conn.close();
			}
			
		} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
}
