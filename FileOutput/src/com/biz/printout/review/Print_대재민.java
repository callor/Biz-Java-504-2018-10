package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_대재민 {
	
	/*
	 *  PrintWriter 클래스를 사용해서
	 *  구구단 5단을 gugudan.txt파일에 작성하시오 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/gugudan.txt"; // 메모장생성할위치에대한 정보를담고있는변수
		
		try {
			PrintWriter pw = new PrintWriter(printFile);//경로지정해서 쓰는 유틸클래스  위치지정,프린트로메모장내용채워넣음
			for(int i = 1; i < 10; i ++) { //구구단생성 알고리즘
				pw.print("5 X " + i);
				pw.print(" = ");
				pw.println(5*i);
				
			}
			pw.close(); // 자원해제 
			System.out.println("파일작성완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
