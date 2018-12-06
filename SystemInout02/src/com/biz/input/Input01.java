package com.biz.input;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력 후 Enter");
		String strName = scanner.nextLine();
		System.out.println(strName);

	}

}
