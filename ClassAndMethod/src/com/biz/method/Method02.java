package com.biz.method;

public class Method02 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		addVar();
		addVar(20,30);
		addVar(50,100);
		
		addVarReturn(50,20);
	
		System.out.println(addVarReturn(3,4));
		
		int intVas = addVarReturn(5,8);
		System.out.println(intVas);
		
		intVas = addVarReturn(100,200);
		intVas = addVarReturn(50,50);
		intVas = addVarReturn(90,30);
		intVas = addVarReturn(70,60);
		
		
	}
	
	// 매개변수가 없는 완전독립체 method
	public static void addVar() {
		int intNum1 = 20;
		int intNum2 = 30;
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
	}

	// 매개변수가 있는 원조형 method
	public static void addVar(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2 ;
		System.out.println(intSum);
	}
	
	// 값을 전달하고, 그 결과를 반드시 main에게
	// 보고하는 method 선언
	// 이 method는 스스로 console에 표시하는
	// 		기능을 금지한다.
	public static int addVarReturn(int intNum1, int intNum2) {
		int intSum = intNum1 + intNum2;
		/*
		 * return 문은 
		 * method가 코드 실행을 모두 끝내거나
		 * 	중단했을 경우
		 * method를 호출(사용)한 곳으로 메시지를
		 * 전달하는 용도로 사용할 수 있다.
		 *  
		 */
		// return 0 ;
		return intSum ; 
		// 두개의 정수형 매개변수 값을 전달 받은후
		// 덧셈한 결과가 담긴 intSum 변수를
		// return 문과 함께 작성하므로 해서
		// intSum에 보관되어 있는 
		// intNum1+intNum2의 결과를
		// 호출한 곳으로 메시지로 전달 한다.
	}
	
	
	
	
	
	
	
}
