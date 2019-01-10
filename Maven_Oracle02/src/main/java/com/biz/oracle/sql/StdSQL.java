package com.biz.oracle.sql;

public class StdSQL {
	
	public static final String STD_INSERT 
		= " INSERT INTO tbl_student(st_num, st_name, st_grade, st_tel) " 
		+ " VALUES( #{st_num}, #{st_name}, #{st_grade}, #{st_tel} )";
	
	public static final String STD_ALL = " SELECT * FROM tbl_student ";
	public static final String STD_FIND_NUM 
		= " SELECT * FROM tbl_student WHERE st_num = #{st_num} ";
	public static final String  STD_FIND_NAME 
		= " SELECT * FROM tbl_student WHERE st_name = #{st_name} "; 
	public static final String  STD_UPDATE
		= " UPDATE tbl_student SET st_name = #{st_name}, "
		+ " st_grade = #{st_grade}, "
		+ " st_tel = #{st_tel} "
		+ " WHERE st_num = #{st_num} " ;
		
	public static final String STD_DELETE
		= " DELETE FROM tbl_student "
		+ " WHERE st_num = #{st_num} " ;
}
