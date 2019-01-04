package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.biz.grade.vo.ScoreVO;

public class ScoreDaoImp implements ScoreDao{

	Connection dbConn ;
	
	public ScoreDaoImp() {
		this.dbConnection();
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
	public int insert(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ScoreVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreVO findByNum(String sc_num) {
		// TODO 학생의 학번으로 점수 조회
		
		String sql = " SELECT * FROM tbl_score ";
		sql += " WHERE sc_num = '" + sc_num + "'";
		PreparedStatement ps;
		
		try {
			ps = dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				ScoreVO vo = new ScoreVO(
						rs.getString("sc_num"),
						rs.getInt("sc_kor"),
						rs.getInt("sc_eng"),
						rs.getInt("sc_math")
					);
				return vo;
			}
			return null;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public int update(ScoreVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String sc_num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
