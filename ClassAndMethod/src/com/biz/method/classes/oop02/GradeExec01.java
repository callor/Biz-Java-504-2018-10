package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeDAO dao = new GradeDAO();
		dao.gradeVO.setStrNum("001");
		dao.gradeVO.setStrName("이몽룡");
		dao.gradeVO.setIntKor(99);
		dao.gradeVO.setIntEng(88);
		dao.gradeVO.setIntMath(87);
		dao.gradeVO.setIntSci(89);
		dao.gradeVO.setIntHis(79);
		
		dao.gradeView();
		dao.viewSum();
		dao.viewAvg();

	}

}
