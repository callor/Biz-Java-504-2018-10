package com.biz.control;

public class ControlTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 33;
		int intMode = (intNum1 %2);
		boolean b = (intMode == 0);
		
		if( (intNum1 %2) == 0 ) {
			System.out.println(intNum1 + " 은 짝수");
		} else {
			System.out.println(intNum1 + " 은 홀수");
		}
		
		// if, else 문 다음에 명령문이 단 한줄만 있으면
		// {} 를 생략할수 있다.
		if( (intNum1 %2) == 0 ) 
			System.out.println(intNum1 + " 은 짝수");
		else 
			System.out.println(intNum1 + " 은 홀수");
		
		if( (intNum1 %2) == 0 ) { 
			System.out.println(intNum1 + " 은 짝수");
			System.out.println(intNum1 + " 은 짝수");
		} else 
			System.out.println(intNum1 + " 은 홀수");
		
		// if 문에 {} 가 없으면
		// 바로 다음의 한문장만 if문의 영향을 받는다.
		if( (intNum1 %2) == 0 ) 
			System.out.println(intNum1 + " 은 짝수");
		System.out.println(intNum1 + " 은 짝수");

		// if 문 끝에 ; 이 오면
		// if 문에 영향을 받는 명령문이 하나도 없다. 
		if( (intNum1 %2) == 0 ) ;
		System.out.println(intNum1 + " 은 짝수");
		
		if( (intNum1 %2) == 0 )
			System.out.println("if");
		
		if( (intNum1 %2) == 0 ) ;
		
		// 명령문의 제어권 영역
		// === 명령문 끝에 ; 오면 
		//		: 한줄로 끝
		// == 명령문 다음에 {...} 
		//		: 중괄호 범위내의 명령들이 한 그룹
		// == 명령문 다음줄에 명령문과 ; 오면
		//		: 거기까지
		
		
	}

}
