package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_고은향 {

	/*
	 * PrintWriter 클래스를 사용해서 구구단 5단을 gugudan.txt 파일에 작성하시오
	 * 5 x 1 = 5
	 * 5 x 2 =10
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String printFile = 
				 "D:/bizwork/workspace/ExFlies/gugudan.txt";
		
		PrintWriter pw; //printwriter를 pw라고 객체선언을 해주고
		try {
			pw = new PrintWriter(printFile); //pw의 값을 new로 클리어시켜주고 거기에 printfile의 값을 을 넣어준다
			
			int intNum = 5;
				for(int i = 1; i <10; i++) {
					pw.print(intNum+"X"+i+"=");
					pw.println(intNum*i);
				}
			
			pw.close();
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		int intNum = 0;
		for(intNum = 0 ; intNum < 10 ; intNum++) {
			
		}
	
		System.out.println(intNum);
	
	}
	

}
