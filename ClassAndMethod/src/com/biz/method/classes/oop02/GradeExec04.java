package com.biz.method.classes.oop02;

import com.biz.method.classes.dao.GradeDAO;

public class GradeExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GradeDAO dao = new GradeDAO();
		for(int i = 0 ; i < 5; i++) {
			dao.gradeVO.setStrNum(String.valueOf(i+1));
			dao.gradeVO.setStrNum("" + (i+1));
			setScore(dao);
			viewScore(dao);
			// dao ?
			setScore(dao);
			// dao ?
		}
	}
	
	public static void setScore(GradeDAO dao) {
//		dao.gradeVO.setStrNum("001");
		dao.gradeVO.setStrName("성춘향");
		dao.gradeVO.setIntKor(makeScore());
		dao.gradeVO.setIntEng(makeScore());
		dao.gradeVO.setIntMath(makeScore());
		dao.gradeVO.setIntSci(makeScore());
		dao.gradeVO.setIntHis(makeScore());
		dao.makeGrade();
	}
	
	public static void viewScore(GradeDAO dao) {
		System.out.println("==================");
		System.out.println("학번:" 
				+ dao.gradeVO.getStrNum());
		System.out.println("이름:" 
				+ dao.gradeVO.getStrName());
		System.out.println("------------------");
		System.out.println("국어:" 
				+ dao.gradeVO.getIntKor());
		System.out.println("영어:" 
				+ dao.gradeVO.getIntEng());
		System.out.println("수학:" 
				+ dao.gradeVO.getIntMath());
		System.out.println("과학:" 
				+ dao.gradeVO.getIntSci());
		System.out.println("국사:" 
				+ dao.gradeVO.getIntHis());
		System.out.println("------------------");
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
