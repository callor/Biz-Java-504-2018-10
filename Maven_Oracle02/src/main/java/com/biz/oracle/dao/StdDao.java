package com.biz.oracle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.oracle.vo.StdVO;

public interface StdDao {
	
	@Select(" SELECT * FROM tbl_student ")
	public List<StdVO> selectAll();
	
	public StdVO findByNum(String st_num);
	public int insert(StdVO vo);
	public int update(StdVO vo);
	public int delete(String st_num);

}
