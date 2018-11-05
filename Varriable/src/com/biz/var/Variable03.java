package com.biz.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1;
		int intNum2;
		
		intNum1 = 30;
		
		intNum2 = intNum1; 
		//intNum1의 값 30을 읽어서
		// intNum2에 저장하라 = 복사개념

		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
		
		intNum1 = 50;
		System.out.println("intNum1: " + intNum1);
		System.out.println("intNum2: " + intNum2);
	
		intNum1 = intNum1 + 10;
		// 1. intNum1에 저장된 50을 CPU로 보내고
		// 2. 10을 CPU로 보내고
		// 3. 두 값을 + 연산하고
		// 4. 그 결과를 다시 intNum1 에 저장
		// ==> intNum1에 10을 증가, 누적
		intNum1 = intNum1 + 10;
		intNum1 = intNum1 + 10;
		
		//?? intNum1 
		System.out.println("Last:" + intNum1);
	}
}
