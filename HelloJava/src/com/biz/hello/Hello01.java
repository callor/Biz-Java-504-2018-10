package com.biz.hello;

public class Hello01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 100;
		int intNum2 = 200;
		
		// 메서드를 호출한다.
		// 우리가 만든 메서드를 Java의 명령어처럼 사용하는
		// 방법
		addView();
	}
	public static void addView() {
		int intNum1 = 10;
		int intNum2 = 20;
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
	}

}
