package com.biz.hello;

public class Hello03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 100;
		for(int i = 0 ; i < 10 ; i++) {
			intNum = intNum + 1;
		}
		// 1번 위치에서 intNum : 110
		
		for(int i = 0 ; i < 10 ; i++) {
			intNum ++;
		}
		// 2번 위치에서 intNum : 120
		
		int index = 0 ;
		int intSum = 0;
		for(int i = 0 ; i < 10 ; i++) {
			index ++;
			intSum += index; // intSum = intSum + index
		}
		
		// 3번 위치에서 intSum : 55
		System.out.println(intSum);
		
		for(int i = 0 ; i < 10 ; i++) {
			intSum += 1; // intSum ++
		}
		// 4번 위치에서 intSum : 65
		
		

	}

}



