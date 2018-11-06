package com.biz.control;

public class ControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bTest = false;
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		// +-*/ % : 산술연산자
		// <> = : 비교연산자, 관계연산자
		bTest = (intNum1 < intNum2); // true
		System.out.println(bTest);
		
		bTest = (intNum1 > intNum2); // false
		System.out.println(bTest);

		bTest = (intNum1 == intNum2); // false
		System.out.println(bTest);

		bTest = (intNum1 <= intNum2); // true
		System.out.println(bTest);

		bTest = (intNum1 >= intNum2); // false
		System.out.println(bTest);

		// 서로 다르냐?
		bTest = (intNum1 != intNum2); // true
		System.out.println(bTest);
		
		
		

	}

}
