package com.biz.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		
		intNum += 10;
		intNum += 20;
		intNum += 30;
		intNum += 40;
		
		System.out.println(intNum);
		
		intNum = 0;
		int intCount = 0;
		
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		intNum += ((intCount++) * 10);
		
		intNum = 0;
		for(int i = 0 ; i<5 ;i++) {
			intNum += (i*10);
		}
	}
}
