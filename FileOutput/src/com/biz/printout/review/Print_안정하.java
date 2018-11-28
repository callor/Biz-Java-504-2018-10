package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_안정하 {
	/*
	 * PrintWriter 클래스를 사용해서 구구단 5단을 gugudan.txt. 파일에 작성하시오
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workutf/ExFiles/gugudan.txt";

		PrintWriter pw;
		try {
			pw = new PrintWriter(printFile);
			for (int i = 0; i < 9; i++) {
				pw.print(5);
				pw.print(" x ");
				pw.print(i + 1);
				pw.print(" = ");
				pw.println(5 * (i + 1));
			}
			pw.close();
			System.out.println("파일 저장 완료");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
