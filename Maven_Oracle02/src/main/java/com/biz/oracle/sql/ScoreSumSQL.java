package com.biz.oracle.sql;

public class ScoreSumSQL {

	public static final String SS_ALL
		= " SELECT * FROM view_score_sum " ;
	
	public static final String SS_FIND_NUM 
		= " SELECT * FROM view_score_sum WHERE st_num = #{st_num} " ;
}
