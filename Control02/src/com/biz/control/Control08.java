package com.biz.control;

public class Control08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intCount = 0;
		int intSum = 0;
		
		// 1부터 숫자를 더해서
		// 그 합이 10000 (이상)이 될때
		// 얼마까지 더해져야 되는지
		// 알아보고 싶다.
		while(true) {
			intCount ++ ;
			intSum += intCount;
			if(intSum >= 10000) break;
		}
		System.out.println("intSum:" + intSum);
		System.out.println("intCount:" + intCount);
		
		intSum = 0;
		for(int i = 1 ; i <= 141 ; i++) {
			intSum += i;
			System.out.println(intSum);
		}
		
		intSum = 0;
		for(int i = 1 ; true ; i++) {
			intSum += i;
			System.out.println(intSum);
			if(intSum >= 10000) break;
		}


		
		
	}

}
