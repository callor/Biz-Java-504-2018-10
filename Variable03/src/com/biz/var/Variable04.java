package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		
		double d = Math.random();
		System.out.println(d);
		
		double d10 = d * 10;
		System.out.println(d10);
		
		int i = (int)d10;
		System.out.println(i);
		System.out.println(i+1);

		int intR = (int)(Math.random() * 10) + 1;
		intR = (int)(Math.random()*(100-50+1)) + 50;
		
		for(int k = 0 ; k < 10 ; k ++ ) {
			intR = (int)(Math.random()*(100-50+1)) + 50;
			System.out.println(intR);
		}
		
		
		
	}

}
