package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.biz.grade.util.DBConnection;
import com.biz.grade.vo.ScoreVO;

public class ScoreDaoImp implements ScoreDao{

	Connection dbConn;
	
	public ScoreDaoImp() {
		dbConn = DBConnection.getInstance();
	}
	
	@Override
	public int insert(ScoreVO vo) {
		// TODO VO를 매개변수 받아 score table에 데이터 추가
		String sql = " INSERT INTO tbl_score ";
		sql += " VALUES( ?,?,?,? ) " ;
		
		PreparedStatement ps;
		try {
			
			ps = dbConn.prepareStatement(sql);
			ps.setString(1, vo.getSc_num());
			ps.setInt(2,vo.getSc_kor());
			ps.setInt(3, vo.getSc_eng());
			ps.setInt(4, vo.getSc_math());
						
			int ret = ps.executeUpdate();
			return ret ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
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
