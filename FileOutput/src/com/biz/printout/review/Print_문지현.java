package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_문지현 {

	public static void main(String[] args) {

		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt";
		PrintWriter pw;
		try {
			pw = new PrintWriter(printFile);
			for (int i = 1; i <= 9; i++) {
				pw.printf("5*%d = %d\r\n", i, (i * 5));
			}
			pw.close();
			System.out.println("파일작성완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}