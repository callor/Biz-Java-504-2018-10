package com.biz.grade.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.util.DBConnection;
import com.biz.grade.vo.StudentVO;

public class StudentDaoImp implements StudentDao {
	
	Connection dbConn ;
	
	public StudentDaoImp() {
		// TODO Auto-generated constructor stub
		dbConn = DBConnection.getInstance();
	}

	@Override
	public int insert(StudentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudentVO> selectAll() {
		
		// TODO 전체 학생의 데이터 조회하여 LIST로 리턴
		String sql = " SELECT * FROM tbl_student ";
		
		PreparedStatement ps ;
		List<StudentVO> stdList = new ArrayList();
		
		try {
			ps = dbConn.prepareStatement(sql);
			ResultSet rs  = ps.executeQuery();
			
			while(rs.next()) {
				
				StudentVO vo = new StudentVO(
						rs.getString("st_num"),
						rs.getString("st_name"),
						rs.getString("st_tel"),
						rs.getString("st_addr")
				 );
				stdList.add(vo);
			}
			rs.close();
			ps.close();
			
			return stdList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public StudentVO findByNum(String st_num) {
		// TODO 학번으로 조회하여 VO를 리턴
		String sql = " SELECT * FROM tbl_student ";
		sql += " WHERE st_num = '" + st_num + "'" ;
//		sql += " WHERE st_num = ? " ; 
		
		PreparedStatement ps ;
		
		try {
			ps = dbConn.prepareStatement(sql);
//			 ps.setString(1, "001");
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())  {
				StudentVO vo = new StudentVO(
						rs.getString("st_num"),
						rs.getString("st_name"),
						rs.getString("st_tel"),
						rs.getString("st_addr")
						
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
	public List<StudentVO> findByName(String st_name) {
		// TODO 이름으로 조회하여 LIST 로 리턴
		String sql = " SELECT * FROM tbl_student ";
		sql +=  " WHERE st_name = ? ";
		
		// SQL의 LIKE 키워드를 사용해서 SQL을 작성
		// sql += " WHERE st_name LIKE '%" + st_name + "%'"
		
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
