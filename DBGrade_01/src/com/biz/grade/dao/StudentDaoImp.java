package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class StudentDaoImp implements StudentDao {
	
	Connection dbConn ;
	
	public StudentDaoImp() {
		// TODO Auto-generated constructor stub
		dbConnection();
	}
	
	private void dbConnection() {
		// oracle.jdbc.driver.OracleDriver.class
				String dbDriver = "oracle.jdbc.driver.OracleDriver" ;
				
				try {
					// Driver Loading
					Class.forName(dbDriver);
					
					// DB 접속 profile
					String url = "jdbc:oracle:thin:@localhost:1521:xe";
					String user = "gradeuser";
					String password ="1234" ;
					
					dbConn = DriverManager.getConnection(url,user,password);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
	}
	
	@Override
	public int insert(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudentVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO findByNum(String st_num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByName(String st_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String st_num) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void insertBulk(List<StudentVO> stdList) {
		// TODO Service에서 생성한 stdList를 매개변수 받아 DB에 insert
		
		String sql = " INSERT INTO tbl_student " ;
		sql += " VALUES(?,?,?,?)  " ;
		
		PreparedStatement ps;
		
		try {
			ps = dbConn.prepareStatement(sql);
			/*
			for(StudentVO v : stdList) {
				ps.setString(1, v.getSt_num());
				ps.setString(2, v.getSt_name());
				ps.setString(3, v.getSt_tel());
				ps.setString(4, v.getSt_addr());
				ps.executeUpdate();
			}
			*/
			
			/*
			 * bulk Data를 insert 할때는 1개의 데이터를 set 하고
			 * exec...()을 실행하는 것은 매우 비 효율적이다.
			 * 
			 * Java PrepareStatement에는
			 * 이처럼  bulk Data를 insert 할때는 Batch 처리를 한다.
			 * Batch
			 */
			
			for(StudentVO vo : stdList) {
				ps.setString(1, vo.getSt_num());
				ps.setString(2, vo.getSt_name());
				ps.setString(3, vo.getSt_tel());
				ps.setString(4, vo.getSt_addr());
				ps.addBatch();
			}
			ps.executeBatch();
			
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
