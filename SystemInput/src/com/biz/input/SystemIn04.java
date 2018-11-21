package com.biz.input;

import java.util.Scanner;

public class SystemIn04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String[] arrString = new String[3];
		for(int i = 0 ; i < arrString.length ;i++) {
			System.out.print(i);
			System.out.print("번째 숫자>> ");
			arrString[i] = scanner.nextLine();
		}
		
		for(int i = 0 ; i <arrString.length; i++) {
			System.out.println(i + "번째 : " 
						+ arrString[i]);
		}
		
		int intSum = 0;
		for(int i = 0 ; i < arrString.length;i++) {
			intSum += Integer.valueOf(arrString[i]);
		}
		System.out.println("합계:" + intSum);
		
	}

}
