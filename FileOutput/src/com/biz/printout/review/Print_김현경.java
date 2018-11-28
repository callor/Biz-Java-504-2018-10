package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_김현경 {
	
	/*
	 * PrintWriter 클래스를 사용해서
	 * 구구단 5단을 gugudan.txt파일에 작성하시오
	 * 5 x 1 = 5
	 * 5 X 2 = 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String printFile ="D:/bizwork/workspace/ExFiles/gugudan.txt";
		
		
		try {
			
			PrintWriter pw = new PrintWriter(printFile);
		    int intNum =5;
			for(int i = 1; i < 10; i++) {
				pw.println(intNum + "x" + i+ "=" + (intNum*i));
			}
				
				pw.close();
				System.out.println("작성 완료");
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("오류");
		}
	
	}

}
