package com.biz.num;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자방식에 따라 도데체 얼마 작은 수 부터
		// 얼마나 큰 수까지 표현, 저장 할수 있는가?
		
		// 정수 : int, Integer
		System.out.println(Integer.MIN_VALUE);
		System.out.println(20);

		/*
		 * Java의 keyword(명령어)를 나열하여 명령문을 작성하는
		 * 2가지 큰 원칙
		 * 첫번째 : 첫글자가 소문자인 경우
		 *    키워드들을 공백으로 구분하여 나열한다.
		 * 	  나열하는 키워드들은 문법규칙에 따르나
		 *    키워드마다 나열하는 방식이 다르다
		 * 
		 * 두번째 : 첫글자가 대문자인 경우
		 *    키워드들을 마침표(.)로 구분하여 나열한다.
		 *    나열하는 키워드들은 문법규칙에 따르나
		 *    첫번째 키워드 다음에 이어사 나오는 키워드는
		 *    정해진 키워드들 중에 선택해야 한다.
		 *    키워드의 나열되는 개수는 보통 2개 이상이다.
		 *    
		 *    이클립스에서는 assist기능이 있어서
		 *    첫번째 키워드를 입력한후 점(.)을 찍으면
		 *    다음에 사용할 키워드들을 나열하여 보여주고
		 *    선택할수 있도록 도와준다.
		 *    
		 */
		System.out.println(Integer.MAX_VALUE);
		
		// 정수 중 8byte 크기는 long, Long
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		// 실수 float, Float
		// 소수점이하 6-7자리 범위까지 표현
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		// 정밀도가 좀 높은 실수 double, Double
		// 소수점이하 15-17자리 범위까지 표현
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
	}

}
