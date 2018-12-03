package com.biz.arrays.chars;

public class StringChar09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Republic of Korea";
		
		// 문자열을 배열로 생성
		// 1. 문자열 배열로 생성
		String[] arrNation = strNation.split("");
		
		// 2. char형 배열로 생성
		char[] charNation = strNation.toCharArray();

		// 배열을 콘솔에 나열하는 방법
		// 문자열배열 요소를 콘솔에 나열
		for(int i = 0 ; i < arrNation.length ; i++) {
			System.out.print(arrNation[i] + 10);
			System.out.print(", ");
		}
		System.out.println();
		
		// char형 배열 요소를 콘솔에 나열
		for(int i = 0 ; i < charNation.length ; i++) {
			// char형 변수는 정수와 함께 연산을 수행하면
			// 자동으로 int형으로 변환되여 연산이 수행된다
			System.out.print(charNation[i]+10);
			System.out.print(", ");
		}
		System.out.println();
		
		// char형 배열 요소를 콘솔에 나열
		for(int i = 0 ; i < charNation.length ; i++) {
			// char형 변수와 문자A 를 연산수행하면
			// char형 변수에 담긴 값과
			// 문자A는 모두 int형 코드(ASCII)로 바뀌어
			// 연산이 수행된다.
			System.out.print(charNation[i]+'A');
			System.out.print(", ");
		}
		System.out.println();
		
		// char + char = int형코드 + int형코드
		// char - char = int형코드 - int형코드
		// 연산이 수행된다.
		// 이 원리를 이용해서
		// 원래(원본, PlanText)에 키값을 연산 수행하여
		// 암호화된 Text로 변환하는 기법
		
	}

}





