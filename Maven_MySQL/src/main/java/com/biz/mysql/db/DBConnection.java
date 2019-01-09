package com.biz.mysql.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection dbConn ;
	
	static {
		
		// 드라이버 실행
		try {

			String otherDriver = "org.gjt.mm.mysql.Driver";
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
			String user ="root";
			String password ="!Biz1234";
			dbConn 
			= DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getInstance() {
		return dbConn;
	}

}
