package com.biz.oracle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.oracle.sql.ScoreSumSQL;
import com.biz.oracle.vo.ScoreSumVO;

public interface ScoreSumDao {
	
	@Select(ScoreSumSQL.SS_ALL)
	public List<ScoreSumVO> selectAll();
	
	@Select(ScoreSumSQL.SS_FIND_NUM)
	public ScoreSumVO findStByNum(String st_num);

}



