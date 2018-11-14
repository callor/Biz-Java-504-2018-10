package com.biz.method.classes.wrapper;

public class Integer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNum1 = "30";
		String strNum2 = "50";
		
		String strSum = strNum1 + strNum2;
		strSum = strNum1.concat(strNum2);
		
		// 문자열 strNum1과 strNum2의 값을
		// 덧셈했을때 숫자 30과 50을 더한 값으로 
		// 바꾸고 싶다.
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		System.out.println(intNum1 + intNum2);
		
		float floatNum1 = Float.valueOf(strNum1);
		float floatNum2 = Float.valueOf(strNum2);
		System.out.println(floatNum1 + floatNum2);
		
		strNum1 = String.valueOf(intNum1);
		strNum2 = String.valueOf(intNum2);
		
		strNum1 = " " + intNum1;
		strNum2 = " " + intNum2;
		
		strNum1 = "30 ";
		strNum2 = "50 ";
		
		strNum1 = strNum1.trim();
		strNum2 = strNum2.trim();
		
		intNum1 = Integer.valueOf(strNum1);
		intNum2 = Integer.valueOf(strNum2); 
		System.out.println(intNum1 + intNum2);

		
	}
}
