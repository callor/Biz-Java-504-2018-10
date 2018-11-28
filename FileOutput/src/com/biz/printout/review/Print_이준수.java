package com.biz.printout.review;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_이준수 {

	 /*
	  * Printwriter 클래스를 사용해서 구구단 5단을 gugudan.txt 파일에 작성하시오.
	  */
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  String printFile = "D:/bizwork/workutf/ExFiles/gugudan.txt";
	  //PrintWriter pa = new PrintWriter(printFile);
	  try {
	   PrintWriter pw = new PrintWriter(printFile);
	   for (int i = 5; i <= 5; i++) {
	    for (int j = 1; j <= 9; j++) {
	     pw.print(i);
	     pw.print(" x ");
	     pw.print(j);
	     pw.print(" = ");
	     pw.println(i * j);
	    }
	   }
	   pw.close();
	   System.out.println("구구단 5단 입력완료.");

	  } catch (FileNotFoundException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	 }

}
