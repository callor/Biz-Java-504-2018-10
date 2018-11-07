package com.biz.control;

public class Control03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		int index = 0;
		
		// 5만원권
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		// index ++; // 1
		if(index++ % 2 == 0) intPaper /= 5;
		else intPaper /= 2;

		// 1만원권
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		// index ++; // 2
		if(index++ % 2 == 0) intPaper /= 5;
		else intPaper /= 2;
		
		
		// 5천원권
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		index ++; // 3
		if(index == 3) intPaper /= 5;
		

		
	}

}



