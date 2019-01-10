package com.biz.oracle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.biz.oracle.sql.StdSQL;
import com.biz.oracle.vo.StdVO;

public interface StdDao {
	
	@Select(StdSQL.STD_ALL)
	public List<StdVO> selectAll();
	
	@Select(StdSQL.STD_FIND_NUM)
	public StdVO findByNum(String st_num);
	
	@Select(StdSQL.STD_FIND_NAME)
	public List<StdVO> findByName(String st_name);
	
	@Insert(StdSQL.STD_INSERT)
	public int insert(StdVO vo);
	
	@Update(StdSQL.STD_UPDATE)
	public int update(StdVO vo);
	
	@Delete(StdSQL.STD_DELETE)
	public int delete(String st_num);

}
