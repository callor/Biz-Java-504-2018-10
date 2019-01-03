package com.biz.grade.dao;

import java.util.List;

import com.biz.grade.vo.StudentVO;

public interface StudentDao {
	
	// CRUD 선언
	public int insert(StudentVO vo);
	
	public List<StudentVO> selectAll();
	public StudentVO findByNum(String st_num);
	public List<StudentVO> findByName(String st_name);
		
	public int update(StudentVO vo);
	public int delete(String st_num);


}
