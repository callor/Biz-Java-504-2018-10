package com.biz.var;

public class Variable05 {

	public static void main(String[] args) {

		int intNum1 = 0; // 선언과 clear를 동시에
		int intSum = 0;
		
		intNum1 = intNum1 + 1; // num1 = 1
		intSum = intSum + intNum1 ; // sum = 1 
		
		intNum1 = intNum1 + 1; // num1 = 2 
		intSum = intSum + intNum1; // sum = 3
		
		intNum1 = intNum1 + 1; // num1 = 3
		intSum = intSum + intNum1; // sum = 6

		intNum1 = intNum1 + 1; // num1 = 4
		intSum = intSum + intNum1; // sum = 10

		intNum1 = intNum1 + 1; // num1 = 5
		intSum = intSum + intNum1; // sum = 15

		
		
		
	}

}
