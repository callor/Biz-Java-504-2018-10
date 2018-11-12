package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int intKor = 60 ; // 변수이름 첫글자 소문자
		int intEng = 90 ; // 변수이름은 의미있는 단어조합
		int intMath = 90 ;
		
		intKor = 60;
		intEng = 90;
		intMath = 80;
		
		int intSum = gradeSum(intKor, intEng, intMath);
		System.out.println(intSum);
		System.out.println(gradeSum(intKor,intEng, intMath));
		
	}
	
	// method 이름도 첫글자 소문자
	// 의미있는 단어 조합
	public static int gradeSum(int intKor, int intEng, int intMath) {

		int intSum = intKor + intEng + intMath;
		return intSum;
		
	}

}





