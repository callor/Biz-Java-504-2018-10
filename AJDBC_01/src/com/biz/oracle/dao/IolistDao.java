package com.biz.oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Dao 클래스는 DB와 연동하는 기능을 수행한다.
 * DB에 연결하고,
 * SQL을 전송하고
 * DB에 데이터를 보내고(INSERT, UPDATE, DELETE)
 * DB로 부터 데이터를 받고(SELECT, ** )
 */
public class IolistDao {
	
	/*
	 * DB연결을 위한 connection 객체를 선언
	 */
	Connection dbConn;
	
	/*
	 * DB에 연결하기
	 * Driver를 Loading하고, connection을 준비하는 메서드
	 */
	public void dbConnection() {
		
		try {
			/*
			 * DB Driver를 Loading 수행한다.
			 * 
			 * 지금부터 oracle.jdbc.driver.OracleDriver.class 파일을
			 * 읽어서 실행시킨후 조용히 감추어 대기 시켜라
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			/*
			 * JDBC에서 DB에 연결할 수 있도록 profile을 설정
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "myMEM";
			String password = "1234";
			
			/*
			 * DB 연결 profile 정보를 가지고 DB에 접속하여
			 * 접속 권한을 획득한다.
			 * 
			 * 내가 전달하는 url, user(id), 비밀번호 정보를
			 * 사용해서 DB에 접속하고
			 * 내가 보내는 SQL문을 DB에 전달할 수 있도록 준비하라
			 */
			dbConn
			= DriverManager.getConnection(url,user,password);
			
			System.out.println("DB 연결 성공!!!");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void selectIoList() {
		
		// DB에 보낼 SQL
		String sql = "SELECT * FROM tbl_iolist";
		
		/*
		 * sql 명령문을 JDBC에게 전달하는 절차
		 */
		
		PreparedStatement ps;
		
		try {
			/*
			 * String으로 만든 SQL 명령문을 JDBC에게 전달해라
			 * (String을 JDBC가 알수 있는 방식으로 변환 후 전달)
			 */
			ps = dbConn.prepareStatement(sql);
			
			/*
			 * JDBC야 지금부터 DB에게 SQL을 전송하고
			 * 결과를 가져와라
			 * 
			 * SQL이 정상적으로 DB로 부터 수행되면
			 * 그 결과를 rs 변수에 받아라
			 */
			ResultSet rs = ps.executeQuery();
			
			/*
			 * 결과를 console에 보여주기
			 */
			
			while(true) {
				/*
				 * rs에 읽을 데이터가 있느냐?
				 */
				if(rs.next() == false) break;
				
				String strDate = rs.getString("io_date");
				String strInout = rs.getString("io_inout");
				String strPCode = rs.getString("io_pcode");
				int intPrice = rs.getInt("io_price");
				int intQuan = rs.getInt("io_quan");
				int intSum = intPrice * intQuan;
				
				System.out.print(strDate + "\t");
				System.out.print(strInout + "\t");
				System.out.print(strPCode + "\t");
				System.out.print(intPrice + "\t");
				System.out.print(intQuan + "\t");
				System.out.print(intSum + "\n");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}









