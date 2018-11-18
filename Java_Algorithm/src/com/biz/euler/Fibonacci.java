package com.biz.euler;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1st = 1;
		int num2nd = 2;
		int fibNum = num2nd;
		System.out.println(num1st);
		System.out.println(num2nd);

		int intSum = num1st + num2nd ;
		int intSum2 = num2nd;
		while(true) {
			fibNum = num1st + num2nd;
			if(fibNum > 1000) break;

			System.out.println(fibNum);
			if(fibNum % 2 == 0) {
				intSum2 += fibNum;
			}
			
			intSum += fibNum;
			
			num1st = num2nd ;
			num2nd = fibNum ;
		}
		System.out.println("합:" + intSum);
		System.out.println("짝수의 합:" + intSum2);
	}

}
