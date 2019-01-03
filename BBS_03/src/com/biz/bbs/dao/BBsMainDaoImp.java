package com.biz.bbs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.bbs.vo.BBsMainVO;

/*
 * 반드시
 * DaoImp는 Dao interface를 implement해서
 * 구현을 해야 한다
 */
public class BBsMainDaoImp implements BBsMainDao {
	
	/*
	 * DB 연결 설정
	 */
	Connection dbConn;

	
	public BBsMainDaoImp() {
		this.dbConntion();
	}
	
	/*
	 * dbConn 맴버변수를 초기화 하는 메서드
	 * dbConn 맴버변수 : db에 접속하기 위한 통로를 마련하고
	 * 그 정보를 가지고 있는 변수
	 */
	public void dbConntion() {
		// oracle.jdbc.driver.OracleDriver.class
		String dbDriver = "oracle.jdbc.driver.OracleDriver" ;
		
		try {
			// Driver Loading
			Class.forName(dbDriver);
			
			// DB 접속 profile
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "bbsuser";
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
	public void insert(BBsMainVO vo) {
		// TODO vo를 매개변수로 전달받아 DB에 저장하기

		String strDate = vo.getB_date();
		String strAuth = vo.getB_auth();
		String strSubject = vo.getB_subject();
		String strText = vo.getB_text();
		
		String sql = " INSERT INTO tbl_bbs_main " ;
		sql += " VALUES( SEQ_BBS_MAIN.NEXTVAL, " ;
		sql += " '" + strDate + "' , ";
		sql += " '" + strAuth + "' , " ;
		sql += " '" + strSubject + "' , " ;
		sql += " '" + strText + "' " ;
		sql += " ) ";
		
		sql = " INSERT INTO tbl_bbs_main ";
		sql += " VALUES( SEQ_BBS_MAIN.NEXTVAL, ?, ?, ?, ? )" ;
		
		
		PreparedStatement ps ;
		try {
			
			ps = dbConn.prepareStatement(sql);
			ps.setString(1, strDate);
			ps.setString(2, strAuth);
			ps.setString(3, strSubject);
			ps.setString(4, strText);
			
//			ps.executeQuery();

			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	
	private BBsMainVO resultSet2BBsMainVO(ResultSet rs) {
		// 게시판 V2.0 Upgrade
		try {
			BBsMainVO vo = new BBsMainVO(
					rs.getLong("b_id"),
					rs.getString("b_date"),
					rs.getString("b_auth"),
					rs.getString("b_subject"),
					rs.getString("b_text")
					);
			return vo;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@Override
	public List<BBsMainVO> selectAll() {
		// TODO DB로부터 모든 게시판 데이터를 읽어 List로 리턴
		
		String sql = " SELECT * FROM tbl_bbs_main ";
		sql += " ORDER BY b_id " ;
		
		// JDBC 연결 객체
		PreparedStatement ps ;
		
		
		try {
			// DB에 연결하기 위하여 sql 문자열을 JDBC 형태로 변환
			ps = dbConn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			// rs 데이터를 List 데이터로 변환
			List<BBsMainVO> bbsList = new ArrayList();
			
			// while(true)
			// if( rs.next() == false ) break
			while(rs.next()) {
				/*
				Long id = rs.getLong("b_id");
				String strDate = rs.getString("b_date");
				String strAuth = rs.getString("b_auth");
				String strSubject = rs.getString("b_subject");
				String strText = rs.getString("b_text");
				
				BBsMainVO vo = new BBsMainVO();
				vo.setB_id(id);
				vo.setB_date(strDate);
				vo.setB_auth(strAuth);
				vo.setB_subject(strSubject);
				vo.setB_text(strText);
				*/
				
				// 게시판 V2.0 Upgrade
				/*
				BBsMainVO vo = new BBsMainVO(
						rs.getLong("b_id"),
						rs.getString("b_date"),
						rs.getString("b_auth"),
						rs.getString("b_subject"),
						rs.getString("b_text")
						);
				
				*/
				// 게시판 V2.1
				bbsList.add(resultSet2BBsMainVO(rs));
				
			}
			rs.close();
			return bbsList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BBsMainVO findById(long id) {
		// TODO Auto-generated method stub
		
		String sql = " SELECT * FROM tbl_bbs_main ";
		sql += " WHERE b_id = ?";
		
		PreparedStatement ps ;
		
		try {
			
			ps = dbConn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			
			rs.next();
			// 게시판 V2.1
			return resultSet2BBsMainVO(rs);
			
			/*
			BBsMainVO vo = new BBsMainVO();
			vo.setB_id(rs.getLong("b_id"));
			vo.setB_date(rs.getString("b_date"));
			vo.setB_auth(rs.getString("b_auth"));
			vo.setB_subject(rs.getString("b_subject"));
			vo.setB_text(rs.getString("b_text"));
			*/
			
			// 게시판 V2.0 Upgrade
			/*
			BBsMainVO vo = new BBsMainVO(
					rs.getLong("b_id"),
					rs.getString("b_date"),
					rs.getString("b_auth"),
					rs.getString("b_subject"),
					rs.getString("b_text")
					);
			return vo;
			*/
			

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public void update(BBsMainVO vo) {
		// TODO vo를 매개변수로 받아 해당 레코드 데이터를 수정
		String sql = " UPDATE tbl_bbs_main ";
		sql += " SET b_auth = ?, ";
		sql += " b_subject = ?, ";
		sql += " b_text = ? " ;
		sql += " WHERE b_id = ? ";
		
		PreparedStatement ps;
		
		try {
			ps = dbConn.prepareStatement(sql);
			ps.setString(1, vo.getB_auth());
			ps.setString(2, vo.getB_subject());
			ps.setString(3, vo.getB_text());
			
			ps.setLong(4, vo.getB_id());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete(long id) {
		// TODO id를 매개변수로 받아 해당 레코드를 삭제
		String sql = " DELETE FROM tbl_bbs_main " ;
		sql += " WHERE b_id = ? " ;
		
		PreparedStatement ps ;
		
		try {
			
			ps = dbConn.prepareStatement(sql);
			ps.setLong(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}







