package com.biz.ex01;

public class MehodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retNum = retSum(50);
		System.out.println(retNum);

	}
	
	public static int retSum(int intNum) {
		intNum = intNum + 100;
		intNum += 100;
//		System.out.println(intNum);
		return intNum;
	}

}
