package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_이주현 {

	/*
	 * PrintWriter 클래스를 사용해서 구구단 5단을 gugudan.txt 파일에 작성하시오 5 x 1 = 5
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "E:\\bizwork\\workspace\\ExFiles\\gugudan.txt";

		PrintWriter gugu;
		try {
			gugu = new PrintWriter(printFile);

			for (int i = 0; i < 9; i++) {
				gugu.println("5 x " + (i + 1) + " = " + 5 * (i + 1));

			}
			gugu.close();
			System.out.println("파일 작성 완료");
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
