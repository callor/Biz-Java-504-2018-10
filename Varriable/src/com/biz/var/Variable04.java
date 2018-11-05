package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 ; // 변수선언부
		intNum1 = 0; // 초기화,  clear
		
		int intNum2 ;
		intNum2 = 0; // clear과정이 생략된 것과 같다
		intNum2 = 30;
		
		// 선언, clear, 그리고 저장을 한문장으로
		int intNum3 = 50;
		
		/*
		 * 선언만 된 변수를 읽으려고 시도하면
		 * 초기화(init) 오류가 발생한다.
		 * 초기화 = 값을 clear하는 것
			int intNum4; ==> int intNum4 = 0
			System.out.println(intNum4);
		*/
		

	}

}
