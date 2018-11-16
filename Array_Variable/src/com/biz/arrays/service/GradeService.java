package com.biz.arrays.service;

import com.biz.arrays.vo.GradeVO;

public class GradeService {
	
	public GradeVO gradeVO;
	
	public GradeService() {
		gradeVO = new GradeVO();
	}

	public void makeScoreAll() {
		// TODO 전체과목(4과목)의 성적을 임의로 생성
		/*
		gradeVO.setIntKor(
				(int)(Math.random() * (100-50+1)) + 50);
		gradeVO.setIntEng(
				(int)(Math.random() * (100-50+1)) + 50);
		gradeVO.setIntMath(
				(int)(Math.random() * (100-50+1)) + 50);
		gradeVO.setIntSci(
				(int)(Math.random() * (100-50+1)) + 50);
		*/
		this.gradeVO.setIntKor(this.makeScore());
		gradeVO.setIntEng(this.makeScore());
		gradeVO.setIntMath(this.makeScore());
		gradeVO.setIntSci(this.makeScore());
	}
	
	/*
	 * 평균과 총점 계산
	 */
	public void makeTotal() {
		// TODO 각 과목의 성적을 읽어서 총점과 평균계산
		
		int intSum = gradeVO.getIntKor();
		intSum += gradeVO.getIntEng();
		intSum += gradeVO.getIntMath();
		intSum += gradeVO.getIntSci();
		
		gradeVO.setIntSum(intSum);
		
		float floatAvg = (float)intSum / 4;
		gradeVO.setFloatAvg(floatAvg);
	}
	
	public void viewGrade() {
		// TODO 한 학생의 성적을 한줄에 출력 
		System.out.print(gradeVO.getStrNum() + "\t");
		System.out.print(gradeVO.getIntKor() + "\t");
		System.out.print(gradeVO.getIntEng() + "\t");
		System.out.print(gradeVO.getIntMath() + "\t");
		System.out.print(gradeVO.getIntSci() + "\t");
		System.out.print(gradeVO.getIntSum() + "\t");
		System.out.print(gradeVO.getFloatAvg() + "\n");
	}
	
	public int makeScore() {
		// TODO 50부터 100까지 범위임의 숫자 생성
		return (int)(Math.random() * (100-50+1)) + 50;
	}


	
	

}






