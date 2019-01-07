package com.biz.oracle.dao;

import java.util.List;

import com.biz.oracle.vo.ScoreVO;

public interface ScoreDao {

	public List<ScoreVO> selectAll(String sc_num);
	public void insert(ScoreVO vo);
	public void update(ScoreVO vo);
	public void delete(String sc_num);
	
}
