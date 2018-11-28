package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_이주훈 {
	/*
	 * PrintWriter 클래스를 사용해서 구구단 5단을 gugudan.txt 파일에 작성하시오
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt";

		try {
			PrintWriter pw = new PrintWriter(printFile);
			pw.println("5단의 구구단");
			for(int i = 1 ; i < 10 ; i ++) {
/*			pw.print(5);
			pw.print(" X ");
			pw.print(i);
			pw.print(" = ");
			pw.println(5 * i); */
			pw.printf("%d X %d = %d\r\n", 5, i, 5*i);		// printf를 사용할때는 줄바꿈키는 "\r\n"이다.
			}
			pw.close();
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
