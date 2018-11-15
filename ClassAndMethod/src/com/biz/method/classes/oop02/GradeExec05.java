package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeDAO dao = new GradeDAO();
		GradeDAO dao1 = setRetScore(dao);
		viewScore(dao);

	}
	
	public static GradeDAO setRetScore(GradeDAO dao) {
		dao.gradeVO.setStrNum("002");
		dao.gradeVO.setStrName("성춘향");
		dao.gradeVO.setIntKor(makeScore());
		dao.gradeVO.setIntEng(makeScore());
		dao.gradeVO.setIntMath(makeScore());
		dao.gradeVO.setIntSci(makeScore());
		dao.gradeVO.setIntHis(makeScore());
		dao.makeGrade();
		return dao;
	}
	
	public static void viewScore(GradeDAO dao) {
		System.out.println("==================");
		System.out.println("총점:" 
				+ dao.gradeVO.getIntSum());
		System.out.println("평군:" 
				+ dao.gradeVO.getFloatAvg());
		System.out.println("==================");
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}

}
