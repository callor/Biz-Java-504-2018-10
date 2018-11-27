package com.biz.ex02;

public class Exec03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수를 메서드에 매개변수로 전달을 할경우
		// 메서드에서 변수를 변경해도
		// 원본은 변하지 않는다.
		int a1 = 30;
		a( a1 );
		System.out.println(a1);
		
		// 배열을 메서드 매개변수로 전달할 경우
		// 메서드에서 변수를 변경하면
		// 원본 자체가 변경되어 버린다.
		int[] b1 = { 10,20 };
		System.out.println(b1[0]);
		b( b1 );
		System.out.println(b1[0]);
		
	}
	
	public static void b( int[] n ) {
		n[0] = 300;
	}
	
	public static void a( int n ) {
		n = 300;
	}

}


