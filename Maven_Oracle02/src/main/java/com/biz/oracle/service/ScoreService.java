package com.biz.oracle.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.biz.oracle.dao.ScoreDao;
import com.biz.oracle.db.OracleSqlFactory;
import com.biz.oracle.vo.ScoreVO;

public class ScoreService {
	
	SqlSessionFactory sessionFactory;
	Scanner scan ;
	
	public ScoreService() {
		
		scan = new Scanner(System.in);
		OracleSqlFactory sqlFactory = new OracleSqlFactory();
		this.sessionFactory = sqlFactory.getSessionFactory();
	}
	
	public List<ScoreVO> viewScore(String st_num) {
		
		// DB로 부터 값을 가져오기
		SqlSession session = sessionFactory.openSession();
		
		// Dao 받기
		ScoreDao dao = session.getMapper(ScoreDao.class);
		
		List<ScoreVO> scList = dao.findByStNum(st_num);
		for(ScoreVO vo : scList) {
			System.out.println(vo);
		}
		return scList ;
		
	}
	
	
	
	
	
	
	

}
