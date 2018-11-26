package com.biz.op;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boolA = (30 == 40);
		if(30 == 40) {
			boolA = true;
		} else {
			boolA = false;
		}
		
		boolean boolB = ("KOREA".equalsIgnoreCase("korea"));
		String strNation = "KOREA";
		if(strNation.equalsIgnoreCase("korea")) {
			boolB = true;
		} else {
			boolB = false;
		}
		
		boolean boolC = (30 != 40);
		if(30 != 40) {
			boolC = true;
		} else {
			boolC = false;
		}
		
		boolean boolD = !(30 == 40);
		if( (30 == 40) == false ) {
			boolD = true;
		} else {
			boolD = false;
		}
		
		boolean boolE = 30 > 40 ? true : false;
		
		// 3항연산자
		String strEven = 30 % 2 == 0 ? "짝수" : "홀수";
		
		if(30%2 == 0) {
			strEven = "짝수";
		} else {
			strEven = "홀수";
		}
		
		String trueAndFalse = true ? "참" : "거짓";
		trueAndFalse = (30 >= 40) ? "참" : "거짓";
		
		System.out.println("Republic of Korea".toUpperCase());
		System.out.println("Republic of Korea".toLowerCase());
		
		String s1 = "Republic of Korea".toLowerCase();
		System.out.println(s1);

	}

}




