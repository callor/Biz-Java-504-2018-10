package com.biz.method.classes;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5과목의 성적 총점을 method를 이용해서
		// 계산을 하는 코드
		int intKor = 90;
		int intEng = 88;
		int intMath = 89;
		int intSci = 78;
		
		int intSum 
		= makeSum(intKor, intEng, intMath, intSci) ;
		System.out.println("총점:" + intSum);
			

	}
	
	public static int makeSum(int intKor, int intEng,
			int intMath, int intSci) {
		
		return intKor + intEng + intMath + intSci;
		
	}

}





