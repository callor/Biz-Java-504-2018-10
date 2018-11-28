package com.biz.printout;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print06 {

	/*
	 * PrintWriter 클래스를 사용해서
	 * 구구단 5단을 gugudan.txt 파일에 작성하시오
	 * 5 x 1 = 5
	 * 5 x 2 = 10
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile 
		= "D:/bizwork/workspace/ExFiles/gugudan.txt";
		
		PrintWriter pw ; // 선언위치
		try {
			pw = new PrintWriter(printFile); // 초기화위치
			for(int i = 0 ; i < 9 ; i++) {
				pw.printf("%d x %d = %d\r\n",5,(i+1),5*(i+1));
			}
			pw.close();
			System.out.println("저장이 완료되었습니다");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		int intNum = 0 ;
		for(intNum = 0 ; intNum < 10 ; intNum ++) {
			
		}
		System.out.println(intNum);
		
		for(int i = 0 ; i < 100 ; i++) {
			
		}
		System.out.println(i);
		*/
		

	}

}




