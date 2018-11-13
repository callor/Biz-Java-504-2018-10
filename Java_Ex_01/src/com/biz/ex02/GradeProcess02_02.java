package com.biz.ex02;

public class GradeProcess02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 5명의 학생 성적 계산
		for(int intNum = 0; intNum < 5 ; intNum++) {
			processGrade(intNum+1);
		}
	}
	
	public static void processGrade(int intNum) {
		System.out.println("===================");
		System.out.println(intNum +"번 학생");
		System.out.println("-------------------");
		int intKor = makeScore();
		int intEng = makeScore();
		int intMath = makeScore();
		int intSci = makeScore();
		int intHis = makeScore();
		
		System.out.printf("국어점수: %d\n",intKor);
		System.out.printf("영어점수: %d\n",intEng);
		System.out.printf("수학점수: %d\n",intMath);
		System.out.printf("과학점수: %d\n",intSci);
		System.out.printf("국사점수: %d\n",intHis);
		System.out.println("-------------------");
		
		makeSum(intKor,intEng,intMath,intSci,intHis);
	}
	
	public static void makeSum(int intKor, int intEng,
			int intMath, int intSci, int intHis) {
		int intSum = intKor + intEng
				+ intMath + intSci + intHis;
		System.out.println("총점:" + intSum);
		
		makeAvg(intSum);
	}
	
	public static void makeAvg(int intSum) {
		float intAvg = (float)intSum / 5;
		System.out.println("평균:" + intAvg);
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}


}
