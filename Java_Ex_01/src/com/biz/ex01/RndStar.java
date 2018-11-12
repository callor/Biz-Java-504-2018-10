package com.biz.ex01;

public class RndStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intStars = (int)(Math.random() * (9-5+1)) + 5;
		makeStar(intStars);
	}
	
	public static void makeStar(int intStars) {
		System.out.println(intStars + "개의 별 찍기");
		for(int i = 0 ; i < intStars; i++) {
			for(int j = 0 ; j < intStars ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
