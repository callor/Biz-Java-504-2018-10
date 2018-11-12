package com.biz.method.m01;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 임의숫자를 무작위로 생성하는 명령문
		Math.random();
		for(int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}

		System.out.println("0부터 9까지 정수만들기");
		for(int i = 0; i < 10; i++) {
			int intNum = (int)(Math.random()*10);
			System.out.println(intNum);
		}

		System.out.println("0부터 99까지 정수만들기");
		for(int i = 0; i < 10; i++) {
			int intNum = (int)(Math.random()*100);
			System.out.println(intNum);
		}
		System.out.println("1부터 100까지 정수만들기");
		for(int i = 0; i < 10; i++) {
			int intNum = (int)(Math.random()*100)+1;
			System.out.println(intNum);
		}		

		System.out.println("10부터 109까지 정수만들기");
		for(int i = 0; i < 10; i++) {
			int intNum = (int)(Math.random()*100)+10;
			System.out.println(intNum);
		}		
		
		System.out.println("50부터 100까지 정수만들기");
		for(int i = 0; i < 10; i++) {
			int intNum 
			= (int)(Math.random()*(100-50+1))+50;
			System.out.println(intNum);
		}
		
		int intStart = 50;
		int intEnd = 100;
		int rand 
		= (int)Math.random() 
		* (intEnd - intStart + 1) 
		+ intStart;

		// 5부터 10까지의 난수 발생
		int intStars = (int)Math.random() * (10-5+1) + 5;
		makeStars(intStars);
	
		
	}
	public static void makeStars(int intStars) {
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
