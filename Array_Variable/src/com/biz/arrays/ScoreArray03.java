package com.biz.arrays;

public class ScoreArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation = "Repulic of Korea";
		strNation.length();
		
		int intNum = 0;
		// intNum;
		
		int[] intEng = new int[10];
		int intLength = intEng.length;
		System.out.println(intLength);
				
		for(int i = 0 ; i<intLength;i++) {
			intEng[i] = ConstMethod.makeScore();
		}
		
		int intSum = 0;
		for(int i = 0 ; i < intEng.length;i++) {
			intSum += intEng[i];
		}
		
		int[] intMath = new int[50];
		
		System.out.println(intEng.length);
		System.out.println(intMath.length);
		

	}

}
