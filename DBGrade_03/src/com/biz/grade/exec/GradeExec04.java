package com.biz.grade.exec;

import com.biz.grade.service.GradeService;

public class GradeExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stFile = "src/com/biz/grade/학생리스트.txt";
		GradeService gs = new GradeService(stFile);
		gs.gradeMenu();

	}
}
