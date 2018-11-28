package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_고재범 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PrintWriter 클래스를 사용해서
		 * 구구단 5단을 gugudan.txt 파일에 작성하시오
		 */
		 String printFile ="D:/workspace/project1/Exfiles/gugudan.txt";
		 
		 try {
			PrintWriter pw = new PrintWriter(printFile);
			
			int intNum=5;
			for(int i = 1; i <10; i++) {
			
				pw.print(intNum);
				pw.print("x");
				pw.print(i);
				pw.print("=");
				pw.println(intNum * i);
				
				
			}
			/*pw.print("5 x 1= 5");
			pw.print("5 x 2= 10");
			pw.print("5 x 3= 15");
			pw.print("5 x 4= 20");
			pw.print("5 x 5= 25");
			pw.print("5 x 6= 30");
			pw.print("5 x 7= 35");
			pw.print("5 x 8= 40");
			pw.print("5 x 9= 45");*/
			
			
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
