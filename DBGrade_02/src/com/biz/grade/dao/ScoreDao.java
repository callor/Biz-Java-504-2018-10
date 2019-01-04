package com.biz.grade.dao;

import java.util.List;

import com.biz.grade.vo.ScoreVO;

public interface ScoreDao {

	// CRUD 선언
	public int insert(ScoreVO vo);
	
	public List<ScoreVO> selectAll();
	public ScoreVO findByNum(String sc_num);
	
	public int update(ScoreVO vo);
	public int delete(String sc_num);
		
}




