package com.biz.grade.exec;

import com.biz.grade.service.StudentService;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stFile = "src/com/biz/grade/학생리스트.txt";
		StudentService ss = new StudentService(stFile);
		
		ss.stdMenu();
		

	}

}
