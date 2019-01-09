package com.biz.mysql.dao;

import java.util.List;

import org.apache.ibatis.annotations.* ;
//import org.apache.ibatis.annotations.Select;

import com.biz.mysql.db.AddrSQL;
import com.biz.mysql.vo.AddrVO;

public interface AddrDao {
	
	@Select(AddrSQL.ADDR_SELECT_ALL)
	public List<AddrVO> selectAll();
	
	@Select(AddrSQL.ADDR_FIND_BY_NAME)
	public List<AddrVO> findByName(String name);
	
	@Insert(AddrSQL.ADDR_INSERT)
	public int insert(AddrVO vo);
	
	
	public int update(AddrVO vo);
	public int delete(long id);

}
