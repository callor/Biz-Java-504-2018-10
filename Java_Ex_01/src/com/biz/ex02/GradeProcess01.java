package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor = 88;
		int intEng = 99;
		int intMath = 77;
		int intSci = 98;
		int intHis = 78;

		intKor = (int)(Math.random() * (100-50+1)) + 50;
		intEng = scoreMake();
		intMath = scoreMake();
		intSci = scoreMake();
		intHis = scoreMake();
		
		int intSum = intKor + intEng 
				+ intMath + intSci + intHis;
		float floatAvg = (float)intSum / 5;
		floatAvg = intSum / 5.0f;
		
		System.out.println("국어:" + intKor);
		System.out.println("영어:" + intEng);
		System.out.println("수학:" + intMath);
		System.out.println("과학:" + intSci);
		System.out.println("국사:" + intHis);
		
		System.out.println("총점:" + intSum);
		System.out.println("평균:" + floatAvg);
		
		System.out.printf("총점: %d, 평균: %e"
				, intSum, floatAvg);
		
	}
	
	public static int scoreMake() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}

}
