package com.biz.control;

public class Control15 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int intCount = 0;
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				intCount ++;
			}
		}
		System.out.println(intCount);
		
		
		for(int j = 0 ; j<5 ; j++) {
			for(int i = 0 ; i < 5 ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int j = 2; j <= 9; j++) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.print(j);
				System.out.print(" x ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.println(j * i);
			}
			System.out.println("======================");
		}
	}
	
	
	
	
	

}




