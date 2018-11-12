package com.biz.method.m01;

public class Method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 7 ; i++) {
			for(int j = 0 ; j < 7 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// 변수를 선언해서 별의 개수를 임의 조정하는
		// 코드로 변경
		int intStars = 10;
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		intStars = 8;
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		intStars = 7;
		for(int i = 0; i < intStars ; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}


	
	
}



