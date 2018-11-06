package com.biz.control;

public class ControlTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intSum = 0;
		for(int count = 0;count<100;count++) {
//			System.out.println("count:" + (count+1));
			System.out.println(count+1);
			intSum += (count+1);
		}
		System.out.println("intSum:" + intSum);
		
		intSum = 0;
		for(int count = 1;count <= 100;count++) {
			System.out.println(count);
			intSum += count;
		}
		System.out.println(intSum);
		
		// 1부터 100까지 짝수와 홀수의 개수세기
		int intEven = 0;
		int intOdd = 0;
		for(int count = 1;count <=100;count++) {
			if((count%2)==0) intEven ++;
			else intOdd ++;
		}
		System.out.println("EVEN:" + intEven);
		System.out.println("ODD:" + intOdd);
		
		// 1부터 100까지 짝수와 홀수의 합 구하기
		int intEvenSum = 0;
		int intOddSum = 0;
		for(int count = 1;count <=100;count++) {
			
			// count : 2,4,6,8,10...
			if((count%2)==0) intEvenSum += count;
			// count : 1,3,5,7,9...
			else intOddSum += count;
		}
		System.out.println("EVEN:" + intEven);
		System.out.println("ODD:" + intOdd);
		
		// 1부터 100까지 숫자중 3의 배수의 개수??
		int thCount = 0;
		for(int c = 1; c <100 ; c++) {
			if(c%3 == 0) thCount ++; 
		}
		System.out.println("3의 배수의 개수:" + thCount);
		
		// 1부터 100까지 숫자중 3의 배수의 합은?
		int thSum = 0;
		for(int c = 1 ; c < 100 ; c++) {
			if(c%3 == 0) thSum += c;
		}
		System.out.println("3의 배수의 합:" + thSum);
		
		
		
		int a = 3; 
		// 정수형변수 a를 선언하고,
		//  clear한후 3을 저장하라
		
		System.out.println(a);
		// 변수 a에 저장된 값(3)을 console에 보여라
		
		int b = 3;
		// 정수형변수 b를 선언하고,
		// clear한후 3을 저장하라
		
		System.out.println(a+b);
		// 변수 a에 저장된 값(3)과
		// 변수 b에 저장된 값(4)를 덧셈하여
		// console에 보여라

		
		
		
	}

}
