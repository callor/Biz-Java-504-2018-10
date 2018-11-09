package com.biz.method;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addVar(40,10);
	}
	
	/*
	 * 2018-11-09
	 * auth : callor@callor.com
	 * editor : callor@callor.com
	 * method 선언
	 * 이름 : addVar()
	 * 기능 : TODO 매개변수 2개를 받아서 덧셈하기
	 */
	public static void addVar(int intNum1, int intNum2) {
		//	int intNum1 = 30;
		//	int intNum2 = 50;
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
	}

}
