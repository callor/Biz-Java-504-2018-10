package com.biz.hello;

public class Hello02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		int intNum2 = 200;
		
		// 1번위치에서 intNum1 : 100
		addView();
		// 2번위치에서 intNum1 : 100
		
		intNum1 = addView();
		// 3번 위치에서 intNum2 : 200
		// 4번 위치에서 intNum1 : 30
		
		intNum2 = 200 + 300;
		// 5번 위치에서 intNum1 : 30
		// 6번 위치에서 intNum2 : 500
		
	}
	
	public static int addView() {
		int intNum1 = 10;
		int intNum2 = 20;
		int intSum = intNum1 + intNum2;
		return intSum;
	}

}
