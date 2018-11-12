package com.biz.method.m01;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int intStars = 3;
//		for(int i = 0; i < intStars ; i++) {
//			for(int j = 0 ; j < intStars ; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		makeStars(7);
		makeStars(10);
		makeStars(6);
		makeStars(8);
		makeStars(9);
	}
	
	public static void makeStars(int intStars) {
		// int intStars = 6;

		for(int i = 0; i < intStars ; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}



