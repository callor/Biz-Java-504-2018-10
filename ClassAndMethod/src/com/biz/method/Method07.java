package com.biz.method;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		System.out.println("A" + intNum1); // 100
		
		addVar(100);
		System.out.println("B" + intNum1); // 100
		
		addVar(intNum1);
		System.out.println("C" + intNum1); // 100
		
		intNum1 = addVar(intNum1);
		System.out.println("D" + intNum1); // 300
	}
	
	public static int addVar(int intNum1) {
		intNum1 += 200;
		return intNum1;
	}

}
