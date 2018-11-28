package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_이종환 {
	
	/*
	 * PrintWriter 클래스를 사용해서
	 * 구구단 5단을 gugudan.txt 파일에 작성하시오
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt";
		try {
			PrintWriter pw = new PrintWriter(printFile);
			for(int i = 0 ; i < 9 ; i ++ ) {
				int num1 = 5;
				int num2 = i+1 ;
				pw.print(num1);
				pw.print(" X ");
				pw.print(num2);
				pw.print(" = ");
				pw.println(num1 * num2);
			}
			pw.close();
			System.out.println("파일 저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
