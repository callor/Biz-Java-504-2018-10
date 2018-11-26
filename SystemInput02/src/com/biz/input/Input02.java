package com.biz.input;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자1 >> ");
		String strNum1 = scanner.nextLine();
		System.out.print("숫자2 >> ");
		String strNum2 = scanner.nextLine();
		
		try {
			int intNum1 = Integer.valueOf(strNum1);
			int intNum2 = Integer.valueOf(strNum2);
			System.out.println(intNum1 + intNum2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("숫자로 변환하는데 오류 발생");
		}

	}

}
