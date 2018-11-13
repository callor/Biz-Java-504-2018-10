package com.biz.ex02;

public class GradeProcess02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * for 문이 시작되기 전에 선언되는 변수는
		 * for 문이 끝난 다음에 그 값을 참조(읽기)위한
		 * 용도로 사용되나
		 * 여기 코드에서는 for 문이 끝난 다음에
		 * 각 과목의 점수를 참조할 일이 없다.
		 * 그래서, 굳이 for문이 시작되기 전에
		 * 각 과목의 변수를 선언할 필요가 없다.
		int intKor;
		int intEng;
		int intMath;
		int intSci;
		int intHis;
		*/
		
		for(int i = 0 ; i < 5 ; i++) {
			int intKor = makeScore(); 
			int intEng = makeScore();
			int intMath = makeScore();
			int intSci = makeScore();
			int intHis = makeScore();
			
			int intSum = gradeSum(intKor, intEng,
					intMath, intSci, intHis);
			
			float floatAvg = (float)intSum / 5;
			System.out.println((i+1) + "번학생의 점수");
			System.out.println("총점:" + intSum);
			System.out.println("평균:" + floatAvg);
		}
	}
	
	public static int gradeSum(int intKor, int intEng,
			int intMath, int intSci, int intHis) {

		return intKor + intEng + intMath 
		+ intSci + intHis;
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}

}
