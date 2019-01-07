package com.biz.grade.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection dbConn;
	
	public static Connection getInstance() {
		return dbConn;
	}

	/*
	 * Java 1.7이상에서 사용되는 Keyword
	 * static 생성자 라고 부른다.
	 * 
	 * 원래 생성자 라는 메서드는
	 * 		외부에서 new라는 키워드를 사용해서 메서드를 호출하는
	 * 		형식으로 사용된다.
	 * 
	 * static 생성자는 
	 * 		프로젝트가 시작될때 자동으로 실행이 되는 method
	 * 
	 */
	static {
		// oracle.jdbc.driver.OracleDriver.class
		String dbDriver = "oracle.jdbc.driver.OracleDriver";

		try {
			// Driver Loading
			Class.forName(dbDriver);

			// DB 접속 profile
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "gradeuser";
			String password = "1234";

			dbConn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
