package com.biz.mysql.db;

public class AddrSQL {
	public static final String ADDR_SELECT_ALL = 
			" SELECT * FROM tbl_addr ";
	
	public static final String ADDR_FIND_BY_NAME =
			" SELECT * FROM tbl_addr WHERE ad_name = #{name} ";
	
	public static final String ADDR_INSERT =
			" INSERT INTO tbl_addr " 
			+ " VALUES(0, #{ad_name}, #{ad_tel}, #{ad_addr} )" ;
	
	public static final String ADDR_UPDATE = 
			" UPDATE tbl_addr "
			+ " SET ad_name = #{ad_name}, "
			+ " ad_tel = #{ad_tel}, "
			+ " ad_addr = #{ad_addr} " 
			+ " WHERE id = #{id} " ;
	
}
