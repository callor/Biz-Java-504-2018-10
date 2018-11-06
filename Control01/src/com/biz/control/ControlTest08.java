package com.biz.control;

public class ControlTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 0;
		for(;intNum < 10;) {
			System.out.println(intNum++);
		}
		
		intNum = 0;
		for(;intNum < 10 ; intNum++) {
			System.out.println(intNum);
		}
		
		intNum = 0;
		for(;intNum <= 10 ; intNum += 2) {
			System.out.println(intNum);
		}

		intNum = 0;
		for(;intNum <= 10 ; intNum += 3) {
			System.out.println(intNum);
		}
		
		for(intNum = 0; intNum < 10; intNum++) {
			System.out.println(intNum);
		}
		System.out.println(intNum);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		

		
	}

}
